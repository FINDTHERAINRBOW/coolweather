package com.example.coolweather.db;

import org.litepal.crud.LitePalSupport;

/**
 * Created by Suye on ${Date}
 */
public class County extends LitePalSupport {
    private int id;
    private String countyNmae;
    private String weatherId;
    private int CityId;

    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyNmae() {
        return countyNmae;
    }

    public void setCountyNmae(String countyNmae) {
        this.countyNmae = countyNmae;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return CityId;
    }

    public void setCityId(int cityId) {
        CityId = cityId;
    }
}
