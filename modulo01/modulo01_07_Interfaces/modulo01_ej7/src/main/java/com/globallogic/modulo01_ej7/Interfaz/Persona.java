package com.globallogic.modulo01_ej7.Interfaz;

public interface Persona {
	
	void hablar();
	
	void dormir();
	
	default void come() {
		System.out.println("El hombre come");
	};
}
