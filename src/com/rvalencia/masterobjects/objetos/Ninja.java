package com.rvalencia.masterobjects.objetos;

public class Ninja extends Humano{
	
	public Ninja() {
		stealth = 10;
	}
	
	public void robar(Humano persona) {
		persona.salud -= stealth;
		this.salud += this.stealth;
	}
}
