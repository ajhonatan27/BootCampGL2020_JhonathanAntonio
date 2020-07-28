package com.globallogic.modulo01_ej8;

public class modulo01_ej8x2 {

	public static void main(String[] args) {
		
		try {
			String texto[] = null;
			texto.toString();
		}catch(NullPointerException e) {
			System.out.println("Se produjo una excepción null");
		}
	}
}
