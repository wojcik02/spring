package com.springframework.kursspring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import domain.Knight;
import domain.Quest;

@Component
public class Starter implements CommandLineRunner  {

	@Override
	public void run(String... args) throws Exception {
		
		Quest saveThePrincess = new Quest("Uratuj księżniczkę");
	
		Knight lancelot = new Knight("Lancelot" , 29, saveThePrincess);
		
		System.out.println(lancelot);
		
		
		Quest killTheDragon = new Quest("Zabij smoka");
		Knight percival = new Knight ("Percival", 30);
		System.out.println(percival);
		percival.setQuest(killTheDragon);
		System.out.println(percival);
	}

}
