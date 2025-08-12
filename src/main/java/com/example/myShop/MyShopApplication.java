package com.example.myShop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EntityScan("com.example.myShop.entity")
@EnableJpaAuditing
public class MyShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyShopApplication.class, args);
	}

}
