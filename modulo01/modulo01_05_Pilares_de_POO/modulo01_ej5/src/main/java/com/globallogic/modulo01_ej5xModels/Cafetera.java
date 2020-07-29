package com.globallogic.modulo01_ej5xModels;

public class Cafetera extends Electrodomestico {
	 private double litros =2.25;
	 
	 public void elegirSabor(String sabor) {
		 System.out.println("Eilgiendo sabor "+sabor);
	 }
	 
	 public double getLitros() {
		 return litros;
	 }
	 
	 public void encender() {
		System.out.println("Encendiendo cafetera");
	 }
}
