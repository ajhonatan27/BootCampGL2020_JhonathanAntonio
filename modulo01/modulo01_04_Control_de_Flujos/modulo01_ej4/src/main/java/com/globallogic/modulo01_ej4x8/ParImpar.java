package com.globallogic.modulo01_ej4x8;

public class ParImpar {

	public static void main(String[] args) {
		int i = 1;
		
		while(i<=50) {
			if(i%2==0) {
				System.out.println("El valor "+i+" es par");
			}
			else {
				System.out.println("El valor "+i+" es impar");
			}
			i++;
		}
	}

}
