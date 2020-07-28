package com.globallogic.modulo01_ej8;

public class PropiaClaseExcepcion {

	public static void main(String[] args) {
		
		try {
			throw new MiExcepcion("Este es mi excepcion");
		}catch(MiExcepcion e) {
			System.out.println(""+e.getMessage());
		}
	}

}
