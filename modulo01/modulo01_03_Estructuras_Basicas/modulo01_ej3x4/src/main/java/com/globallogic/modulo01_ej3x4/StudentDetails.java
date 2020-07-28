package com.globallogic.modulo01_ej3x4;

public class StudentDetails {
	
	public static void main(String[] args) {
		StudenDetailsClass estudiante = new StudenDetailsClass();
		estudiante.studentAge(10);
	}
}

class StudenDetailsClass{
	public void studentAge(int numero) {
		int age = 0;
		age = age+5;
		System.out.println("La edad del estudiante es: "+numero);
	}
}
