package com.example.demo.AbstractFactory;

public class AutomovilElectricidad extends Automovil {

	
	public AutomovilElectricidad(String modelo, String color,
			int potencia, double espacio) {
		super(modelo, color, potencia, espacio);
	}
	
	@Override
	public void mostrarCaracteristicas() {
		System.out.println(
			"Automovil electrico de modelo: "+modelo+
			" de color: "+color+" de potencia: "+
			potencia + " de espacio: "+espacio);

	}

}
