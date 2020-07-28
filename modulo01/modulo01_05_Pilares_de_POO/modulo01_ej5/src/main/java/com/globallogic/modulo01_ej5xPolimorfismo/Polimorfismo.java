package com.globallogic.modulo01_ej5xPolimorfismo;
import com.globallogic.modulo01_ej5xModels.Televisor;
import com.globallogic.modulo01_ej5xModels.Cafetera;
import com.globallogic.modulo01_ej5xModels.Heladera;
import com.globallogic.modulo01_ej5xModels.Electrodomestico;
public class Polimorfismo {

	public static void main(String[] args) {
		Televisor televisor = new Televisor();
		Cafetera cafetera = new Cafetera();
		Heladera heladera = new Heladera();
		
		Electrodomestico[] electrodomesticos = {televisor,cafetera,heladera};
		
		for(Electrodomestico electrodomestico : electrodomesticos) {
			electrodomestico.encender();
		}
		
	}

}
