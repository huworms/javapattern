package com.example.demo.Builder;

public class ConstructorDocumentacionVehiculoHtml extends ConstructorDocumentacionVehiculo {

	ConstructorDocumentacionVehiculoHtml(){
		documentacion=new DocumentacionHtml();
	}
	
	@Override
	public void construyeSolicitudPedido(String nombreCliente) {
		String documento;
		documento="<HTML> Solicitud de pedido "
				+ "Cliente: "+ nombreCliente +"</HTML>";
		documentacion.agregaDocumento(documento);

	}

	@Override
	public void construyeSolicitudMatriculacion(String nombreSolicitante) {
		String documento;
		documento="<HTML> Solicitud de matriculacion Solicitante: "+
		nombreSolicitante+"</HTML>";
		documentacion.agregaDocumento(documento);
	}

}
