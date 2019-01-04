package com.springframework.kursspring.domain;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;



public class Castle {
	
	
	private String name ;
	
	Knight knight;
	
	public Castle(Knight knight) {
		this.knight = knight;
		
	}
	
	Castle (Knight knight, String name) {
		this.knight = knight;
		this.name = name;
	}
	
	//po utworzeniu beanów w kontenerze
	//@PostConstruct
	public void build() {
		System.out.println("Wybudowano zamek: "+name);
	}
	
	//przed zniszczeniem beanów z kontenera
	//@PreDestroy
	public void tearDown() {
		System.out.println("Zaraz zburzymy: "+name);
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	@Override 
	public String toString() {
		return "Znajduje się tu zamek o nazwie "+this.name+ ", zamieszkały przez rycerza: "+knight; 
	}
	
	

}
