/*
 * This is the main processor that gets files and 
 * moves them to the appropriate directory
 */
package Mp3_orgProcess;

import Mp3Functions.Mp3item;
import com.beaglebuddy.mp3.MP3;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Process file is the main file that works out all the 
 * other negotiations and returns a success or fail
 * 
 */
public class ProcessFiles {
    
      public static boolean ProcessFiles (String file, String outputDir, int num) {
          boolean x = false;
          String fileLocation = file;
          String outDir = outputDir;
          File f = new File(file);
          
          // Create mp3 information object
          Mp3item Mp3File = new Mp3Functions.Mp3item();
          
          //Set Location of the file currently and other particulars of mp3 object
          Mp3File.setFileLocation(file);          
          Mp3File.setFileName(f.getName());
          
          try {
            MP3 mp3Info = new MP3(Mp3File.getFileLocation());
                
            //  Mp3File.setArtistName(mp3Info.getBand());
            //  Mp3File.setAlbumName(mp3Info.getAlbum().replaceAll("[^a-zA-Z]+","-"));    
            
            Mp3File.setArtistName(NameSetter.Name(mp3Info.getBand()));
            Mp3File.setAlbumName(NameSetter.Name(mp3Info.getAlbum()));
            
            
            
            
            System.out.println(mp3Info.getBand() + "--" + mp3Info.getAlbum() + "__" + num);    
             
          } 
          catch (IOException ex) { 
              Logger.getLogger(ProcessFiles.class.getName()).log(Level.SEVERE, null, ex);
          }
          
          
          return x;
      }
    
      
      
}
