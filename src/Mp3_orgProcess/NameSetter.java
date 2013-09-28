/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Mp3_orgProcess;

/**
 *
 * @author djlaptop
 */
public class NameSetter {
    
    public static String Name (String mp3info) {
        String name = mp3info;
  
        // check to see if the name has special characters in it.
        if (name == null){
            name = "Unknown";
        } else {
            name.replaceAll("[^a-zA-Z-]+","");
    
        }
       
        
        return name;
    }


}
