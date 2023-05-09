package com.rvalencia.masterobject.main;

import com.rvalencia.masterobjects.objetos.Humano;
import com.rvalencia.masterobjects.objetos.Ninja;
import com.rvalencia.masterobjects.objetos.Wizard;

public class HumanTest {

	public static void main(String[] args) {

		Humano persona1 = new Humano();
		Wizard mago = new Wizard();
		Wizard mago2 = new Wizard(5);
		Ninja ninja1 = new Ninja();
		mago.displayMago();
		mago.displayHumano();
		persona1.displayHumano();
		
		mago2.fireBall(persona1);
		persona1.displayHumano();
		
		Humano persona2 = new Humano();
		persona2.displayHumano();
		
		ninja1.robar(persona1);
		persona1.displayHumano();
		ninja1.displayHumano();
		
}
}