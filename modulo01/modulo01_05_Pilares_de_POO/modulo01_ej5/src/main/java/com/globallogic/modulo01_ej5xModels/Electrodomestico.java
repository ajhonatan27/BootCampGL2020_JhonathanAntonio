package com.globallogic.modulo01_ej5xModels;

public class Electrodomestico {
	private String marca = "BMW";
	private double peso = 1.2;
	private char consumo = 'G';
	private String color = "Black";
	
	public void encender() {
		System.out.println("Encendiendo electrodomestico");
	}
	
	public void apagar() {
		System.out.println("Apagando electrodomestico");
	}
	
	public String getMarca() {
		return marca;
	}
	public double getPeso() {
		return peso;
	}
	public char getConsumo() {
		return consumo;
	}
	public String getColor() {
		return color;
	}
}
