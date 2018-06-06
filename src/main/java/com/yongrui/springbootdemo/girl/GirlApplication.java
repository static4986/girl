package com.yongrui.springbootdemo.girl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/*@EnableAutoConfiguration
@ComponentScan("com.yongrui.springbootdemo.girl.*")*/
@SpringBootApplication
public class GirlApplication {

	public static void main(String[] args) {
		SpringApplication.run(GirlApplication.class, args);
	}
}
