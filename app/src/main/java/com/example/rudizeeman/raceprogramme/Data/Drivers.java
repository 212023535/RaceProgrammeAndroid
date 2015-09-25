package com.example.rudizeeman.raceprogramme.Data;

/**
 * Created by Rudi.Zeeman on 9/4/2015.
 */
public class Drivers
{
    String name;
    String vehicle;
    Boolean pitCrew;

    public Drivers(){super();};

    public Drivers(String name,String vehicle,Boolean pitCrew)
    {
        this.name = name;
        this.pitCrew = pitCrew;
        this.vehicle = vehicle;
    }
}
