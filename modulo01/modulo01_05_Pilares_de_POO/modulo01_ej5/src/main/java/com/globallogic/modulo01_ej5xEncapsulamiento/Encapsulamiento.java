package com.globallogic.modulo01_ej5xEncapsulamiento;

import com.globallogic.modulo01_ej5xModels.Gato;

public class Encapsulamiento {

	public static void main(String[] args) {
		Gato gato = new Gato();
		
		gato.setNombre("aster");
		gato.setPatas(4);
		System.out.println(""+gato.getNombre());
		System.out.println(""+gato.getPatas());
	}

}
