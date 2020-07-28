package com.globallogic.modulo01_ej4x3;
import java.util.Scanner;

public class Ventas {

	public static void main(String[] args) {
		double compra,descuento = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingresa el valor de la compra: ");
		compra = entrada.nextDouble();
		
		if(compra >= 350) {
			descuento = compra * 0.25;
			System.out.println("El descuento es de: "+descuento);
		}
		else if( compra >=300 && compra <350) {
			descuento = compra * 0.20;
			System.out.println("El descuento es de: "+descuento);
		}
		else {
			System.out.println("Sin descuentos, el total es de: "+compra);
		}
		
		entrada.close();
	}

}
