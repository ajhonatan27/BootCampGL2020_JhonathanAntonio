package com.globallogic.modulo01_ej4x5;

public class Divisible {
	public static void main(String[] args) {
		int i, acc=0;
		
		for(i=0; i<=10000; i++) {
			if(i%20 == 0) {
				acc++;
			}
		}
		System.out.println(acc);
	}
}
