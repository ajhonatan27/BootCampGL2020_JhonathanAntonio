package com.globallogic.modulo01_ej6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int maxEmpleados = 20;
    	Empleado[] arrayEmpleado = new Empleado[maxEmpleados];
    	
    	Scanner input = new Scanner(System.in);
    	System.out.println("Ingrese numero de empleados: ");
    	int numeroEmpleados = input.nextInt();
    	
    	if(numeroEmpleados > 20) {
    		System.out.println("No se puede leer mas de 20 empleados");
    		numeroEmpleados = 20;
    	}
    	
    	input.nextLine();
    	Empleado empleado ;
    	for(int i=0;i<numeroEmpleados;i++) {
    		empleado = new Empleado();
    		System.out.println("Ingrese DNI: ");
    		empleado.setDni(input.nextLine());
    		System.out.println("Ingrese Nombre: ");
    		empleado.setNombre(input.nextLine());
    		System.out.println("Ingrese Sueldo base: ");
    		empleado.setSueldo(input.nextDouble());
    		System.out.println("Ingrese horas extra: ");
    		empleado.setHorasExtra(input.nextInt());
    		System.out.println("Ingrese tipo IRPF: ");
    		empleado.setTipoIRPF(input.nextDouble());
    		System.out.println("Es casado (true/false): ");
    		empleado.setCasado(input.nextBoolean());
    		System.out.println("Ingrese numero de hijos: ");
    		empleado.setNumeroHijos(input.nextInt());
    		
    		input.nextLine();
    		arrayEmpleado[i] = empleado;
    	}
    	
    	System.out.println("Ingrese importe de horas extra: ");
    	Empleado.setImporteHorasExtra(
    		input.nextDouble()
    	);
    	
    	
    	empleadoPorMayorMenorSalario(arrayEmpleado,numeroEmpleados);
    	empleadoPorHoraExtra(arrayEmpleado,numeroEmpleados);
    	empleadoPorSalario(arrayEmpleado,numeroEmpleados);
    	
    	input.close();
	}
	
	private static void empleadoPorMayorMenorSalario(Empleado[] arrayEmpleado,int numeroEmpleados) {
		Arrays.sort(arrayEmpleado,0,numeroEmpleados,Comparator.comparingDouble(Empleado::getSueldo).reversed());
    	System.out.println("El empleado que mas cobra es: ");
    	System.out.println(arrayEmpleado[0]);
    	System.out.println("El empleado que menos cobra es: ");
    	System.out.println(arrayEmpleado[numeroEmpleados - 1]);
	}
	
	private static void empleadoPorHoraExtra(Empleado[] arrayEmpleado,int numeroEmpleados) {
		Arrays.sort(arrayEmpleado,0,numeroEmpleados, Comparator.comparingDouble(Empleado::getHorasExtra).reversed());
    	System.out.println("El empleado que mas horas extra hizo es: ");
    	System.out.println(arrayEmpleado[0]);
    	System.out.println("El empleado que menos horas extra hizo es: ");
    	System.out.println(arrayEmpleado[numeroEmpleados - 1]);
	}
	
	private static void empleadoPorSalario(Empleado[] arrayEmpleado,int numeroEmpleados) {
		Arrays.sort(arrayEmpleado,0,numeroEmpleados, Comparator.comparingDouble(Empleado::getSueldo));
    	System.out.println("Lista empleados ordenadas por sueldo: ");
    	
    	for (int i = 0; i < numeroEmpleados; i++) {
			System.out.println(arrayEmpleado[i]);
		}
	}
}
