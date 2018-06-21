import java.io.File;
import java.io.FilenameFilter;

public class FileLoader {
 
  private FileLoader(){}
  
  public static File[] load(String baseFolder, final String extension) {
        File dir = new File(baseFolder);

          return dir.listFiles(new FilenameFilter() { 
                 public boolean accept(File dir, String filename)
                      { return filename.endsWith(extension); }
        } );   
  }
  
}
