package com.itcast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ConfigurableApplicationContext;
@ServletComponentScan
@SpringBootApplication
public class Tlias_managementApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Tlias_managementApplication.class, args);
		System.out.println(run);
	}

}
