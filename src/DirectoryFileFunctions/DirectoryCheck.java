/*
 * Directory Function preform all directory functions and other file management
 * Functions. 
 */
package DirectoryFileFunctions;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.TrueFileFilter;

public class DirectoryCheck {

/*
 * CompareDir compares two directory and compare if they are the same 
 * coupled with dirCheck you can compare to see if directory exist and if they are the same
 * and returns a boolean
 */
    
    public static boolean compareDir(String xDir, String nDir){
        boolean x = false;
        
        if (xDir.equals(nDir)){
            // directory is the same 
           x = false;
        }
        else {
          // The directory is different now check to make sure both exist
        
        boolean n = dirCheck(xDir);
        boolean p = dirCheck(nDir);
        
        if (n  && p){
            // both directories are good
           x = true;
        }
        else {
           x = false; 
        }
        
        }
        return x;
    }
 
/*
 * dirCheck checks to see if directory exist or not
 */
    public static boolean dirCheck(String pDir){
        boolean x =false;
        String xdirectory =pDir;
        File checkFolder = new File(xdirectory); 
        //check to see if the directory exist 
        
        if (checkFolder.exists()){
            //Folder does exist.
            x = true;
        }else {
            //Folder does not exist
            x = false;
        }
        return x;
    }
  /*
   * fileList returns an List of files in a given directory
   * and error is thrown if directory does not exist.
   */
    public static List<File> fileList(String source) throws IOException{
     
        ArrayList myList = new ArrayList();
        File dir = new File(source);
        List<File> files = (List<File>) FileUtils.listFiles(dir, TrueFileFilter.INSTANCE, TrueFileFilter.INSTANCE);	    
        
        return files;
    }
    
    public static String Filename(String fpath){
        String filenameStr = "";
        
        File file = new File(fpath);
        filenameStr = file.getAbsolutePath();
        
        return filenameStr;
    }
}
