package com.globallogic.modulo01_ej5xHerencias;

import com.globallogic.modulo01_ej5xModels.Electrodomestico;
import com.globallogic.modulo01_ej5xModels.Heladera;

public class Herencia {

	public static void main(String[] args) {
		Electrodomestico electrodomestico = new Electrodomestico();
		Heladera heladera = new Heladera();
		
		heladera.apagar();
		heladera.encender();
		heladera.guardarElemento("Frutas");
		heladera.extraerElemento("Gaseosa");
		
		System.out.println(""+electrodomestico.getMarca());
		System.out.println(""+electrodomestico.getPeso());
		System.out.println(""+electrodomestico.getConsumo());
		System.out.println(""+electrodomestico.getColor());
		
		System.out.println(""+heladera.getCapacidad());
		System.out.println(""+heladera.getCapacidadFreezer());
		System.out.println(""+heladera.getTieneFreezer());
	}

}
