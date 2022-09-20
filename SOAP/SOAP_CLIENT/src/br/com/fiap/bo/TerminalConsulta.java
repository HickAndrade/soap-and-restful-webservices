package br.com.fiap.bo;

import java.rmi.RemoteException;
import java.util.Scanner;

import br.com.fiap.bo.EstoqueBOStub.ConsultaBO;
import br.com.fiap.bo.EstoqueBOStub.ConsultaBOResponse;
import br.com.fiap.bo.EstoqueBOStub.ProdutoTO;

public class TerminalConsulta {
	public static void main(String[] args) throws RemoteException {
		
		Scanner leia = new Scanner(System.in);
		int codigo = 0;
		
		System.out.println("Digite o codigo do produto Desejado: ");
		codigo = leia.nextInt();
		
		leia.close();
		
		//chamei o stub para complementar o metodo via web
		EstoqueBOStub stub = new EstoqueBOStub();
		
		// metodo que irá se complementar com o stub
		ConsultaBO consulta = new ConsultaBO();
		consulta.setCodProd(codigo);
		
		//agora preciso de uma resposta do server que está usando o metodo para referencia(Response)
		ConsultaBOResponse response = stub.consultaBO(consulta);
		ProdutoTO produto = response.get_return();
		
		System.out.println(produto.getDescricao());		
	}
}
