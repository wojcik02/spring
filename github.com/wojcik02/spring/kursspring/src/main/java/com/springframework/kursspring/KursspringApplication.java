package com.springframework.kursspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.springframework.kursspring.domain.Castle;

@SpringBootApplication
public class KursspringApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(KursspringApplication.class, args);
		//ConfigurableApplicationContext ctx = SpringApplication.run(KursspringApplication.class, args);
		//Castle castle = (Castle)ctx.getBean ("castle");
		//System.out.println(castle);
		
	}
}
