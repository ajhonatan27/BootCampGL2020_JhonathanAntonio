package com.globallogic.modulo01_ej8;

public class modulo01_ej8x1 {

	public static void main(String[] args) {
		
		try {
			int numero = 0;
			numero = numero / 0;
		}catch(Exception e){
			System.out.println("Se produjo una excepción: Esto es una Excepción");
		}finally {
			System.out.println("Esto se ejecuta sin importar si se presentan errores");
		}
	}

}
