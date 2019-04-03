package br.com.fiap.main;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import br.com.fiap.TO.TenisTO;

public class MainPost {
	public static void main(String[] args) {
		Client client = Client.create();
		WebResource webResource = client.resource("http://localhost:8080/restTest/rest/tenis/");
		TenisTO tenis = new TenisTO(2, "CARALHO", 10);
		ClientResponse response = webResource.type("application/json").post(ClientResponse.class, tenis);
		if (response.getStatus() == 201) {
			System.out.println("Sucesso! " + response.getLocation());
		} else {
			System.err.println("Erro: HTTP error code : " + response.getStatus());
		}
	}
}
