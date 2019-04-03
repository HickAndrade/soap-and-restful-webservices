package br.com.fiap.main;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import br.com.fiap.TO.TenisTO;

public class MainPut {
	public static void main(String[] args) {
		Client client = Client.create();
		
		WebResource webResource = client.resource("http://localhost:8080/restTest/rest/tenis/2");
		
		TenisTO tenis = new TenisTO(50, "TENIS EXEMPLO", 30);
		
		ClientResponse response = webResource.type("application/json").put(ClientResponse.class, tenis);
		if (response.getStatus() == 200) {
			System.out.println("Sucesso! ");
		} else {
			System.err.println("Erro: HTTP error code : " + response.getStatus());
		}

	}
}
