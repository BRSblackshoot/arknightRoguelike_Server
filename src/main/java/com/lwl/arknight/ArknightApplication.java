package com.lwl.arknight;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.lwl.arknight.mapper")
public class ArknightApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArknightApplication.class, args);
	}

}
