package com.globallogic.modulo01_ej7.Models;

import com.globallogic.modulo01_ej7.Interfaz.Animal;
public class MainAnimal {

	public static void main(String[] args) {
		Perro dog = new Perro();
		
		dog.dormir();
		dog.sonidoAnimal();
		dog.come("Perro");
		Animal.camina("Perro");
	}

}
