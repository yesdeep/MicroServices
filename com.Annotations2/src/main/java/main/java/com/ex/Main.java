package com.ex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.ex.config.AppConfig;
import com.ex.drivers.DataBaseDriver;
import com.ex.service.UserService;

public class Main {
	public static void main(String[] args) {
		System.out.println("----------------------------------");
		AbstractApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

		//DataBaseDriver oracle = appContext.getBean("oracleDriver", DataBaseDriver.class);
		//DataBaseDriver mysql = appContext.getBean("mysqlDriver", DataBaseDriver.class);
		
        //System.out.println("Oracle driver info:");
        //System.out.println(oracle.getInfo());
        
//        System.out.println("MySQL driver info:");
//        System.out.println(mysql.getInfo());
//
        System.out.println("UserService Information");
		UserService userService = appContext.getBean(UserService.class);
		System.out.println(userService.getDriverInfo());

		UserService userService2 = appContext.getBean(UserService.class);
		System.out.println("-----"+userService2.getCity().getCityName());



		System.out.println("----------------------------------");
		appContext.close();
	}
}
