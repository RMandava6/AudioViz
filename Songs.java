import java.util.List;
import java.io.File;
import java.util.LinkedList;

public class Songs {
 
  private List<Song> list;
  private int currentIndex=0;
  private int lastIndex;
  
  public Songs(String dirName) {
   load(dirName);
  }
  
  public void load(String dirName) {
   File[] files = FileLoader.load(dirName, ".mp3"); 
   list = new LinkedList<Song>();
   if(files!=null) {
    for( File current: files) {
       Song song = new Song(dirName, current.getName()); 
       list.add(song);
    }
    
    lastIndex = list.size()-1;
   } 
  }
  
  public Song getCurrent() {
     return list.get(currentIndex); 
  }
  
  public Song next() {
     currentIndex = (currentIndex == lastIndex) ? 0 : currentIndex + 1;
     return list.get(currentIndex); 
  }
  
  public Song previous() {
    currentIndex = (currentIndex == 0) ? lastIndex : currentIndex - 1; 
    return list.get(currentIndex); 
  }
  
  public void reset(String dirName) {
     load(dirName); 
  }
  

}
