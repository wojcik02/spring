package com.springframework.kursspring;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.springframework.kursspring.domain.Castle;
import com.springframework.kursspring.domain.Knight;

@RunWith(SpringRunner.class)
@SpringBootTest
public class KursspringApplicationTests {

	@Autowired
	Knight knight;
	@Autowired
	Castle castle;
	
	
	@Test
	public void contextLoads() {
	}
	
	@Test
	public void testCastle() {
		String except = "Znajduje się tu zamek o nazwie Castle Black, zamieszkały przez rycerza: Rycerz o imieniu: Lancelot(29). Ma za zadanie Uratuj księżniczkę";
		//Castle castle = new Castle(knight);
		assertEquals(except,castle.toString());
	}

}
