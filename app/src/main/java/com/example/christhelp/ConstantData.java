package com.example.christhelp;

import java.util.HashMap;


public class ConstantData {

    private ConstantData(){

    }
    public static final String PACKAGE_NAME = "com.google.android.gms.location.Geofence";

    public static final String SHARED_PREFERENCES_NAME = PACKAGE_NAME + ".SHARED_PREFERENCES_NAME";

    public static final String GEOFENCES_ADDED_KEY = PACKAGE_NAME + ".GEOFENCES_ADDED_KEY";

    /**
     * Used to set an expiration time for a geofence. After this amount of time Location Services
     * stops tracking the geofence.
     */
    public static final long GEOFENCE_EXPIRATION_IN_HOURS = 12;
    public static final String GEOFENCE_ID_STAN_UNI = "home";

    /**
     * For this sample, geofences expire after twelve hours.
     */
    public static final long GEOFENCE_EXPIRATION_IN_MILLISECONDS =
            GEOFENCE_EXPIRATION_IN_HOURS * 60 * 60 * 1000;
    //public static final float GEOFENCE_RADIUS_IN_METERS = 1609; // 1 mile, 1.6 km
    public static final float GEOFENCE_RADIUS_IN_METERS = 20; // 1 mile, 1.6 km

    /**
     * Map for storing information about airports in the San Francisco bay area.
     */

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getll(){
        return ll;
    }



    public String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String name;
    public double latitude;
    public double longitude;
public  double ll;
    public float radius;

    public ConstantData(String id, String name, double latitude, double longitude, float radius) {
        this.id = id;
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.radius = radius;
    }

    public static final HashMap<String, ConstantData> BAY_AREA_LANDMARKS = new HashMap<String, ConstantData>();
    static {
        BAY_AREA_LANDMARKS.put("home",new ConstantData("1","abcd",12.892567, 77.577250,10));
        BAY_AREA_LANDMARKS.put("home2",new ConstantData("1","abcd",12.896926, 77.622730,40));
        BAY_AREA_LANDMARKS.put("block3",new ConstantData("7","abd",12.931893, 77.606396,40));

        BAY_AREA_LANDMARKS.put("audienter",new ConstantData("1","abcd",12.936133, 77.606215,10));
        BAY_AREA_LANDMARKS.put("puc",new ConstantData("2","abd",12.935561, 77.606208,10));
        BAY_AREA_LANDMARKS.put("park",new ConstantData("3","abd",12.934890, 77.606192,10));
        BAY_AREA_LANDMARKS.put("central",new ConstantData("4","abd",12.934529, 77.606197,20));
        BAY_AREA_LANDMARKS.put("block1",new ConstantData("5","abd",12.933932, 77.606426,20));
        BAY_AREA_LANDMARKS.put("block2",new ConstantData("6","abd",12.933200, 77.606426,40));

        BAY_AREA_LANDMARKS.put("block4",new ConstantData("8","abd",12.932131, 77.606000,10));
        BAY_AREA_LANDMARKS.put("block2nd",new ConstantData("9","abd",12.932797, 77.606291,20));



    }


    // end region
// region Public





}