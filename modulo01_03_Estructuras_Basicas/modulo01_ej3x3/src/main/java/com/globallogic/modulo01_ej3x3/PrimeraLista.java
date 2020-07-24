package com.globallogic.modulo01_ej3x3;
import java.util.ArrayList;
import java.util.List;

public class PrimeraLista {

	public static void main(String[] args) {
		List<String> letters = new ArrayList<String>();
		letters.add("A");
		letters.add("B");
		letters.add("C");
		
		letters.forEach(System.out::println);
		
		letters.add(0, "X");
		letters.forEach(System.out::println);
	}

}
