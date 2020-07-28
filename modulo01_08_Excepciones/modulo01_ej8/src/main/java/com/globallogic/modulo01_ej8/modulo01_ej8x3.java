package com.globallogic.modulo01_ej8;

public class modulo01_ej8x3 {

	public static void main(String[] args) {
		try {
			int[] numeros = new int[3];
			System.out.print(numeros[10]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Excepción: índice de array fuera de límites");
		}
	}

}
