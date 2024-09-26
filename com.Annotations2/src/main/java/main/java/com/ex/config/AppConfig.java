package com.ex.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.ex.drivers.DataBaseDriver;
import com.ex.drivers.MySqlDriver;
import com.ex.drivers.OracleDriver;

@Configuration
@ComponentScan("com.ex")
@PropertySource("classpath:oracledatabase.properties")
public class AppConfig {

	@Autowired
    Environment environment;
	
	/*@Bean
	DataBaseDriver oracleDriver() {
		OracleDriver oracleDriver = new OracleDriver();
		oracleDriver.setDriver(environment.getProperty("db.driver"));
        oracleDriver.setUrl(environment.getProperty("db.url"));
        oracleDriver.setPort(Integer.parseInt(environment.getProperty("db.port")));
        oracleDriver.setUser(environment.getProperty("db.user"));
        oracleDriver.setPassword(environment.getProperty("db.password"));

        return oracleDriver;
	}*/

	/*@Bean
	DataBaseDriver mySqlDriver() {
		return new MySqlDriver();
	}*/
}
