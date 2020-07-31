package com.globallogic.bootcampgl.junitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
class AppTest {
	String one = "hola",two = "hola",three = "mundo";
	Long variable=null;
	
	@Test
	void test() {
		assertEquals("Test", "Test");
	}
	
	@Test
	void customTest() {
		assertEquals(one,two);
		assertEquals(one,three);/*para que no tire error assertNotEquals(one,three);*/
	}
	
	@Test
	void customSecondTest() {
		assertTrue(25>12);
		assertFalse(25<27);//para que no tire error assertFalse(25>27);
	}
	
	@Test
	void customThirdTest() {
		assertEquals(variable,null);
		variable=1l;
	}
	
	@AfterEach
	void afterEach() {
		assertNotEquals(variable,"1l");//para que no tire error assertEquals(variable,"1l");
	}
	
	public int suma(int numeroA, int numeroB) {
		return numeroA+numeroB;
	}
	
	@Test
	void customFourTest() {
		assertEquals(suma(5,7),12,"Suma Incorrecta");
	}
	
	public boolean metodoFor(int maximo) {
		for(int i=0 ; i<maximo ; i++) {
			if(i==3) {
				return true;
			}
		}
		return false;
	}
	
	@Test
	void customFiveTest() {
		assertTrue(metodoFor(10),"Esta variable no es True: ");
	}
	
	@Test
	void customSixTest() {
		assertFalse(metodoFor(2),"Esta variable no es False: ");
	}
}