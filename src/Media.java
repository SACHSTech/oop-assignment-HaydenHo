public abstract class Media {
    // Setting Variables
    private String strName;
    private String strType;
    private String strArtist;
    private String strDate;
    private int intMediaDuration;
    private int intTotalListener;


    /**
     * Constructor for medias
     * @param mediaName - name of media
     * @param mediaType - type of media 
     * @param mediaDate - release date of media
     * @param mediaArtist - artist of media
     * @param mediaDuration - duration of media
     * @param TotalListener - total listner of media
     */
    public Media(String mediaName, String mediaType, String mediaDate, String mediaArtist, int mediaDuration, int TotalListener){
        strName = mediaName;
        strType = mediaType;
        strArtist = mediaArtist;
        strDate = mediaDate;
        intMediaDuration = mediaDuration;
        intTotalListener = TotalListener;
    }

    /*
     * Returns the name of the media
     * 
     * @return name of media
     */
    public String getName() {
        return strName;
    }

    /*
     * Returns the type of the media
     * 
     * @return type of media
     */
    public String getType() {
        return strType;
    }


    /*
     * Returns the Artist of the media
     * 
     * @return Artist of media
     */
    public String getArtist() {
        return strArtist;
    }

    /*
     * Returns the release date of the media
     * 
     * @return release date of media
     */
    public String getDate() {
        return strDate;
    }

    public int getDuration() {
        return intMediaDuration;
    }

    public int getListeners() {
        return intTotalListener;
    }
    /*
     * Returns the name of the media
     * 
     * @return name of media
     */
    public String toString(){
        return getName();
    }

public abstract int TotalListeners(); 
}
