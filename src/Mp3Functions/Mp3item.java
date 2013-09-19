package Mp3Functions;
/**
 *
 * @Mp3 Item is the object class for storing mp3 data 
 * some items may not be available but are place here for future use
 */
public class Mp3item {
    String Name;  // File name
    String FileLocation;  // Location on the drive directory in it's entire path (actual file)
    String BPM;  // The BPM if listed in Tags 
    String ArtistName; // Artist or band name from Tags
    String TrackName;  // Track Name from Tags
    int TrackNumber;  // Track Number from Tags
    String AlbumName; //from Tags
    String NewLocation;  // Where the file should be stored 
    String NewName;  // What the new file name should be
     

    public static String DirectoryName(String Destination, String ArtistName, String AlbumName){
        String DirName = "";
        String Artist = "";
        String Album = "";
        String Dir = "";
        
        /*
         * This will give you the proper directory name to create
         */
        if (Destination == null) {
            Dir = "Unknown";
        } else {
           Dir = Destination;
        }
        if (ArtistName == null) {
            Artist = "Unknown";
        } else {
            Artist = ArtistName;
        }
        if (AlbumName == null) {
            Album = "Unknown";
        } else {
            Album = AlbumName;
        }
        
        
        
        DirName = Dir + "\\" + Artist + "\\" + Album; 
        
        
        
       return DirName;
    } 
    
    public int getTrackNumber() {
        return TrackNumber;
    }

    public void setTrackNumber(int TrackNumber) {
        this.TrackNumber = TrackNumber;
    }
    
 
    
    
    public String getTrackName() {
        return TrackName;
    }

    public void setTrackName(String TrackName) {
        this.TrackName = TrackName;
    }
   public static String NewFilename(Object Mp3File){
       /* This method will take the object and use the rule and give you what 
        * The new name should be called 
        */
       String newName = "";
   
       /*
        * Rule to naming is ArtistName_Song/Track_BPM.mp3
        * File Directory Should be 
        */

   return newName;    
   }
   
   public static String NewDirName(Object Mp3File){
       String NewDir = "";
       
       
       
       return NewDir;
   }
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getFileLocation() {
        return FileLocation;
    }

    public void setFileLocation(String FileLocation) {
        this.FileLocation = FileLocation;
    }

    public String getBPM() {
        return BPM;
    }

    public void setBPM(String BPM) {
        this.BPM = BPM;
    }

    public String getArtistName() {
        return ArtistName;
    }

    public void setArtistName(String ArtistName) {
        this.ArtistName = ArtistName;
    }

    public String getAlbumName() {
        return AlbumName;
    }

    public void setAlbumName(String AlbumName) {
        this.AlbumName = AlbumName;
    }

    public String getNewLocation() {
        return NewLocation;
    }

    public void setNewLocation(String NewLocation) {
        this.NewLocation = NewLocation;
    }

    public String getNewName() {
        return NewName;
    }

    public void setNewName(String NewName) {
        this.NewName = NewName;
    }

    
    
}
