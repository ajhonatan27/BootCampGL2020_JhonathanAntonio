package com.globallogic.modulo01_ej5xModels;

public class Televisor extends Electrodomestico {
	private double pulgadas = 55;
	private String resolucion = "HD";
	
	public void cambiarCanal(int canal) {
		System.out.println("Cambiando a canal "+canal);
	}
	
	public double getPulgadas() {
		return pulgadas;
	}
	
	public String getResolucion() {
		return resolucion;
	}
	
	public void encender() {
		System.out.println("Encendiendo televisor");
	}
}
