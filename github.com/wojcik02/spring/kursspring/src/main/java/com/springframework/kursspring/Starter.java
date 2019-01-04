package com.springframework.kursspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springframework.component.TestComponent;
import com.springframework.kursspring.domain.Castle;
import com.springframework.kursspring.domain.Knight;
import com.springframework.kursspring.domain.Quest;

//tworzenie bean do kontenera
@Component ("starter")
public class Starter implements CommandLineRunner  {
	
	
	//wstrzyknięcie bean do komponentów springa z konetnera 
	
	@Autowired
	TestComponent test;
	
	
	@Autowired
	Castle castle;
	


	@Override
	public void run(String... args) throws Exception {
		
		System.out.println(castle);
		
//		Quest saveThePrincess = new Quest("Uratuj księżniczkę");
//		Knight lancelot = new Knight("Lancelot" , 29, saveThePrincess);
//		System.out.println(lancelot);
//		
//		Quest killTheDragon = new Quest("Zabij smoka");
//		Knight percival = new Knight ("Percival", 30);
//		System.out.println(percival);
//		percival.setQuest(killTheDragon);
//		System.out.println(percival);
	}

}
