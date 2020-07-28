package com.globallogic.modulo01_ej6;

public class Empleado extends Persona{
		private int id;
		private double sueldo;
		private int horasExtra;
		private double tipoIRPF;
		private boolean casado;
		private int numeroHijos;
		static double importeHorasExtra;

		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		
		public int getNumeroHijos() {
			return numeroHijos;
		}
		
		public void setNumeroHijos(int numeroHijos) {
			this.numeroHijos = numeroHijos;
		}

		public double getSueldo() {
			return sueldo;
		}
		
		public void setSueldo(double sueldo) {
			this.sueldo = sueldo;
		}

		public int getHorasExtra() {
			return horasExtra;
		}
		public void setHorasExtra(int horasExtra) {
			this.horasExtra = horasExtra;
		}
		
		public boolean isCasado() {
			return casado;
		}
		public void setCasado(boolean casado) {
			this.casado = casado;
		}

		public static double getImporteHorasExtra() {
			return importeHorasExtra;
		}
		public static void setImporteHorasExtra(double importeHorasExtra) {
			Empleado.importeHorasExtra = importeHorasExtra;
		}

		public double getTipoIRPF() {
			return tipoIRPF;
		}
		public void setTipoIRPF(double tipoIRPF) {
			this.tipoIRPF = tipoIRPF;
		}
		
		public Empleado(String dni) {
			this.setDni(dni);
		}
		
		public Empleado() {
			
		}
		
		public String toString() {
			return this.getId() + " " + this.getNombre() + "\n" +
			  "Sueldo: " + this.getSueldo() + "\n" +   
			  "Horas Extras: " + this.getHorasExtra() + "\n" +
			  "Tipo IRPF: " + this. getTipoIRPF() + "\n" + 
			  "Casado: " + this.isCasado() + "\n" +
			  "Número de Hijos: " + this.getNumeroHijos() + "\n"+
			  "Sueldo Total: "+ getSalario();
		}

		public double totalPorHorasExtra() {
			return Empleado.getImporteHorasExtra() * this.getHorasExtra();
		}
		
		public double sueldoBruto() {
			return this.getSueldo() + this.totalPorHorasExtra();
		}
		
		public double retencionIRPF() {
			if(this.isCasado()) {
				return this.getTipoIRPF() - 0.02 - this.getNumeroHijos();
			}
			else
			{
				return this.getTipoIRPF() - this.getNumeroHijos();
			}
		}
		
		public double getSalario() {
			return this.sueldoBruto() * (1 - this.retencionIRPF()) + this.totalPorHorasExtra();
		}
}
