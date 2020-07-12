package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

public class County extends DataSupport {

    private int id;

    private String countyName;

    private String weatherId;

    private int cityId;

    public int getId(){
        return id;
    }

    public void setId(){
        this.id = id;
    }

    public String getCountyName(){
        return countyName;
    }

    public void setCountName(){
        this.countyName = countyName;
    }

    public String getWeatherId(){
        return weatherId;
    }

    public void setWeatherId(){
        this.weatherId = weatherId;
    }

    public int getCityCode(){
        return cityId;
    }

    public void setCityId(int cityId){
        this.cityId = cityId;
    }

}
