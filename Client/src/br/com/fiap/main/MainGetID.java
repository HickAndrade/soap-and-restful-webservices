package br.com.fiap.main;

import javax.swing.JOptionPane;
import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import br.com.fiap.TO.TenisTO;

public class MainGetID {
	public static void main(String[] args) {
		Client client = Client.create();
		WebResource resource = client.resource("http://localhost:8080/restTest/rest/tenis/"+JOptionPane.showInputDialog("Qual a ID?"));
		ClientResponse response = resource.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
	
		
		
		if (response.getStatus() == 200) {
			TenisTO tenisinho = response.getEntity(TenisTO.class);
				System.out.printf("ID : "+ tenisinho.getCodigo()+"| Marca: "+ tenisinho.getMarca() + " | TAM: " + tenisinho.getTamanho());
			
		} else {
			System.out.println("Erro - HTTP Status: " + response.getStatus());
		}
	}
}
