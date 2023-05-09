package com.rvalencia.masterobjects.objetos;

public class Humano {
	
	protected int strength = 3;
	protected int stealth = 3;
	protected int intelligence = 3;
	protected int salud = 100;
	
	public void atacar(Humano persona) {
		persona.salud -= this.strength;
	}
	
	public void displayHumano() {
		System.out.println("Nivel de salud humano es: " + salud);
	}
}
