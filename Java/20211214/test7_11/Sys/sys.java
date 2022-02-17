package test7_11.Sys;

public class sys {
    private String landName;
    private String cityName;

    public sys(String landName, String cityName){
        this.landName = landName; this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }

    public String getLandName() {
        return landName;
    }
}
