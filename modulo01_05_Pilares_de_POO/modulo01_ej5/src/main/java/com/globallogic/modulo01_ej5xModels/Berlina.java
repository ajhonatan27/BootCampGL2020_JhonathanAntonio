package com.globallogic.modulo01_ej5xModels;

public class Berlina extends Automovil{
	
	@Override
	public void retoceder() {
		System.out.println("Estoy retrocediendo(Berlina)");		
	}
	
	public void avanzar() {
		System.out.println("Soy el metodo avanzar de Automovil");
	}
}
