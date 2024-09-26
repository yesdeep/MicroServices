package com.ex.service;

import com.ex.drivers.DataBaseDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Service
@Component
public class UserService {

    public UserService() {
    }


    public UserService(DataBaseDriver dataBaseDriver) {
        this.dataBaseDriver = dataBaseDriver;
    }
    @Autowired
    public UserService(DataBaseDriver dataBaseDriver, City city) {
        this.dataBaseDriver = dataBaseDriver;
        this.city = city;
    }

    //@Autowired
    //@Qualifier("oracleDriver")
    private DataBaseDriver dataBaseDriver;

    public String getDriverInfo(){
        return dataBaseDriver.getInfo();
    }

    //@Autowired
    private City city;

    public City getCity() {
        return city;
    }


    public void setCity(City city) {
        this.city = city;
    }
}
