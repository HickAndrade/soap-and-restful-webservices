package br.com.fiap.main;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import br.com.fiap.TO.TenisTO;

public class MainGet {
	public static void main(String[] args) {
		Client client = Client.create();
		WebResource resource = client.resource("http://localhost:8080/restTest/rest/tenis");
		ClientResponse response = resource.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
	
		
		if (response.getStatus() == 200) {
			TenisTO[] tenisinho = response.getEntity(TenisTO[].class);
			for (TenisTO tenis : tenisinho) {
				System.out.println(tenis.getMarca() + " | TAM: " + tenis.getTamanho());
			
			}
		} else {
			System.out.println("Erro - HTTP Status: " + response.getStatus());
		}
	}
}
