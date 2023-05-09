package com.rvalencia.masterobjects.objetos;

public class Wizard extends Humano{

	public Wizard() {

		salud = 50;
		intelligence = 8;
	}
	
	public Wizard(int inteligencia) {
		salud = 50;
		intelligence = inteligencia;
	}
	
	public void fireBall(Humano persona) {
		persona.salud -= this.intelligence*3;
	}
	
	public void displayMago() {
		System.out.println("Nivel de salud mago es: " + salud);
	}
		
}
