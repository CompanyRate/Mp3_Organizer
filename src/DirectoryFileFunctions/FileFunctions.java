/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DirectoryFileFunctions;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

/**
 *
 * @author djlaptop
 */
public class FileFunctions {

    
        public static boolean specialCheck(String name){
            //Check if special character
            boolean special = false;
            
               System.out.println(name);
              
               
            
            return special;
        }
        public static String Filerenamer(String name, String actualName) {
            String n = "";

            //this will check to make sure the name is not a special character and give it a name
            if (name == null){
                //remove any periods
                //add back mp3 ext
                n = actualName;
                
                n = n.replaceAll(".", "");
                
                n = n + ".mp3"; 
            }else
            {
                //check to make sure name is not special char
                if (specialCheck(name))
                {
                    n = name;
                    
                n = n.replaceAll(".", "");
                n = n + ".mp3";
                }else
                {
                    n = actualName;
                    
                n = n.replaceAll(".", "");
                n = n + ".mp3";
                }
                
            }

               
            n.replaceAll("\\W", "");
            n.replaceAll("\"","&quote;"); 
            System.out.println(n.toString());
            return n;
        }    

        public static boolean MoveFile(String inFilePath, String outFilePath) throws IOException{
          //Move The file
          boolean x= true;
         
           //move file from one directory to another
       File infile = new File(inFilePath);
       File outfile = new File(outFilePath);
       
       Path in = infile.toPath();
       Path out = outfile.toPath();
     
      Path move = Files.move(in, out,StandardCopyOption.REPLACE_EXISTING);
       
       System.out.println(in.toString());
       System.out.println(out.toString());
         //   String toString = move.toString();
         // Files.move(infile, outfile,StandardCopyOption.REPLACE_EXISTING);
       
       return x;
    
        
        
        }

        
        
        public static void createDirectoryIfNeeded(String directoryName)
        {
          File theDir = new File(directoryName);

          // if the directory does not exist, create it
          if (!theDir.exists())
          {
            theDir.mkdirs();
            
            
            
        //    System.out.println(theDir.getAbsolutePath());
          }
          else
          {
        //      System.out.println("directory is created already");
          }
        }
        
        public static boolean CheckFileName(String Source, String Filename){
            boolean FileExist = false;
            
            return FileExist;
        }
 
}
