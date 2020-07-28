package com.globallogic.modulo01_ej7.Interfaz;

public interface Animal {

	void dormir();
	
	void sonidoAnimal();
	
	default void come(String serViviente) {
		System.out.println("El "+serViviente+" come");
	};
	
	static void camina(String serViviente) {
		System.out.println("El "+serViviente+" camina");
	};
}
