
public class Song {
  
  private String baseFolder;
  private String name;
  
    public Song(String baseFolder, String name) {
      this.baseFolder = baseFolder;
      this.name = name;
    }
    
    public String getName(){
      return name;
    }
    
    public String getBaseFolder() {
      return baseFolder;
    }
 
    public String getPath() {
      return baseFolder + name;
    }
}
