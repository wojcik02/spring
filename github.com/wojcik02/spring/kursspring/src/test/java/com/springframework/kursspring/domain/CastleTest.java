package com.springframework.kursspring.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.springframework.kursspring.domain.Castle;
import com.springframework.kursspring.domain.Knight;

public class CastleTest {
	
	
	@Test
	public void castleToStringMessage() {
		Quest quest = new Quest();
		Knight knight = new Knight();
		knight.setQuest(quest);
		Castle castle = new Castle(knight, "Castle Black");
		String except = "Znajduje się tu zamek o nazwie Castle Black, zamieszkały przez rycerza: Rycerz o imieniu: Lancelot(29). Ma za zadanie Uratuj księżniczkę";
		assertEquals(except,castle.toString());
		
	}

}
