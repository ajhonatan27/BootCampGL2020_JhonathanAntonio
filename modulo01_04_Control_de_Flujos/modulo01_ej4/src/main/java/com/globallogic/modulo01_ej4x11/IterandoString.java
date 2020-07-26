package com.globallogic.modulo01_ej4x11;

public class IterandoString {

	public static void main(String[] args) {
		String palabra = "BootCamp 2020";
		
		for(char letra : palabra.toCharArray()) {
			if(letra != 32) {
				System.out.println("Letra: "+letra);
			}
		}
	}

}
