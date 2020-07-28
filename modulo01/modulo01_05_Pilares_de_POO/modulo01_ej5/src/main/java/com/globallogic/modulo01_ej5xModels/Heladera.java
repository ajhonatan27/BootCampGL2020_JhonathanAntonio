package com.globallogic.modulo01_ej5xModels;

public class Heladera extends Electrodomestico{
	private double capacidad = 1.5;
	private boolean tieneFreezer = true;
	private double capacidadFreezer = 2.0;
	
	public void guardarElemento(String elemento) {
		System.out.println("Guardando "+elemento);
	}
	
	public void extraerElemento(String elemento) {
		System.out.println("Extrayendo "+elemento);
	}
	
	public double getCapacidad() {
		return capacidad;
	}
	public boolean getTieneFreezer() {
		return tieneFreezer;
	}
	public double getCapacidadFreezer() {
		return capacidadFreezer;
	}
	public void encender() {
		System.out.println("Encendiendo heladera");
	}
}
