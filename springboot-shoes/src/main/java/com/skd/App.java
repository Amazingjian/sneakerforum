package com.skd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.skd.mapper") //@MapperScan 用户扫描MyBatis的Mapper接口
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
