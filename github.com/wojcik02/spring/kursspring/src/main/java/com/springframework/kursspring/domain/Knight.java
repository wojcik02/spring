package com.springframework.kursspring.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Knight {
	
//Wstrzykiwanie ypów prymitywnych	
//Value("Lacelot")
	
	private String name = "Lancelot";
	private int age = 29;
	private Quest quest;
//	
//	public Knight(String name, int age, Quest quest) {
//		
//		this.name = name;
//		this.age = age;
//		this.quest = quest;
//		
//	}
//	
	
public Knight() {
	
}
public Knight(String name, int age) {
		
		this.name = name;
		this.age = age;
		
	}
	@Autowired
	public void setQuest(Quest quest) {
		System.out.println("Ustawiam zadanie dla Rycerza");
		this.quest = quest;
	}
	
	@Override
	public String toString() {
		return "Rycerz o imieniu: "+ name + "("+ age+"). Ma za zadanie "+quest;
	}

}
