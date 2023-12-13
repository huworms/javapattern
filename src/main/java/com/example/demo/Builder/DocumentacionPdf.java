package com.example.demo.Builder;

public class DocumentacionPdf extends Documentacion {

	@Override
	public void agregaDocumento(String documento) {
		if(documento.startsWith("<PDF>"))
			contenido.add(documento);
	}

	@Override
	public void imprime() {
		System.out.println("Documentacion PDF");
		for(String s: contenido)
			System.out.println(s);
	}

}
