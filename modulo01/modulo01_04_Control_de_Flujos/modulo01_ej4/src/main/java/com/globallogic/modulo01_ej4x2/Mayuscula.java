package com.globallogic.modulo01_ej4x2;

public class Mayuscula {
	public static void main(String[] args) {
		Character objChar1 = new Character('A');
		Character objChar2 = new Character('b');
		
		isUpper(objChar1);
		isUpper(objChar2);
	}
	public static void isUpper(char caracter) {
		if (Character.isUpperCase(caracter)) {
			System.out.println("La letra esta en mayuscula");
		}
		else {
			System.out.println("La letra está no esta en mayuscula");
		}
	}
}