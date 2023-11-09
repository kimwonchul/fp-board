package com.fp.fpboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class FpBoardApplication {

	public static void main(String[] args) {
		SpringApplication.run(FpBoardApplication.class, args);
	}

}
