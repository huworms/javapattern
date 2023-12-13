package com.example.demo.Builder;

import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.JavaPatternApplication;

@SpringBootApplication
public class ClienteVehiculo implements CommandLineRunner{
	
	public static void main(String[] args) {
		SpringApplication.run(ClienteVehiculo.class, args);
	}
	
	@Override
    public void run(String... args) {
		Scanner reader= new Scanner(System.in);
		ConstructorDocumentacionVehiculo constructor;
		System.out.println("Desea generar "+
				"documentacion HTML (1) o PDF (2):");
		String seleccion= reader.next();
		if(seleccion.equals("1")) {
			constructor= new ConstructorDocumentacionVehiculoHtml();
		}else {
			constructor= new ConstructorDocumentacionVehiculoPdf();
		}
		
		Vendedor vendedor=new Vendedor(constructor);
		Documentacion documentacion=vendedor.construye("Martin");
		documentacion.imprime();
	}
	
	

}
