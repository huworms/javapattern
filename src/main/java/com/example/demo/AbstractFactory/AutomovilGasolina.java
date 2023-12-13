package com.example.demo.AbstractFactory;

public class AutomovilGasolina extends Automovil {

	public AutomovilGasolina(String modelo, String color,
			int potencia, double espacio) {
		super(modelo, color, potencia, espacio);
	}
	
	@Override
	public void mostrarCaracteristicas() {
		System.out.println(
			"Automovil de gasolina de modelo: "+modelo+
			" de color: "+color+" de potencia: "+potencia 
			+" de espacio: "+espacio
				);

	}

}
