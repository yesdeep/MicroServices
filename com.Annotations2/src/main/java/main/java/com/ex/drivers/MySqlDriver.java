package com.ex.drivers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

//@Primary
@Component
@PropertySource("classpath:mysqldatabase.properties")
public class MySqlDriver implements DataBaseDriver {

    @Value("${databaseName}")
    private String databaseName;
    @Value("${disableStatementPooling}")
    private String disableStatementPooling;



    public String getInfo() {
        return "[ Driver: mySql" +
                ", databaseName: " + databaseName +
                ", disableStatementPooling: " + disableStatementPooling +
                " ]";
    }
}
