package com.springframework.kursspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

import com.springframework.component.TestComponent;
import com.springframework.kursspring.domain.Castle;
import com.springframework.kursspring.domain.Knight;
import com.springframework.kursspring.domain.Quest;

@SpringBootApplication
@ImportResource("classpath:config/spring-config.xml")
//@ComponentScan({"com.springframework.kursspring","com.springframework.component"})
@ComponentScan(basePackageClasses= {Starter.class, Castle.class, Quest.class, Knight.class, TestComponent.class})
public class KursspringApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(KursspringApplication.class, args);
		//ConfigurableApplicationContext ctx = SpringApplication.run(KursspringApplication.class, args);
		//Castle castle = (Castle)ctx.getBean ("castle");
		//System.out.println(castle);
		
	}
}
