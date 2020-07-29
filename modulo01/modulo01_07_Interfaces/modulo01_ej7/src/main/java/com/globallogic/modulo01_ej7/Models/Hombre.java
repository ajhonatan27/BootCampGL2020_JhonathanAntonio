package com.globallogic.modulo01_ej7.Models;


import com.globallogic.modulo01_ej7.Interfaz.Animal;
import com.globallogic.modulo01_ej7.Interfaz.Persona;

public class Hombre implements Animal,Persona{
	
	public void dormir() {
		System.out.println("Hombre ZZZzzz");
	}
	
	public void sonidoAnimal() {
		System.out.println("El hombre no hace sonido de animal");
	}
	
	public void hablar() {
		System.out.println("Hola mundo");
	}
	
	public static void main(String[] args) {
		Hombre men = new Hombre();
		
		
		men.dormir();
		men.hablar();
		men.sonidoAnimal();
		men.come();
		Animal.camina("Hombre");
	}
	
}
