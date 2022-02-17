package test7_6.Location;

public class Location {
    private String cityName;
    private int latitude;
    private int  longitude;

    public Location(String cityName, int latitude, int longitude){
       this.cityName = cityName; this.latitude = latitude; this.longitude = longitude;
    }
    public String toString(){
        return  cityName + "  " + latitude + "  " + longitude;
    }

}
