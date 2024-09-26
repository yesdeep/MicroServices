package com.ex.service;

import org.springframework.stereotype.Component;

@Component("Local_city")
public class City {

    String cityName;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
