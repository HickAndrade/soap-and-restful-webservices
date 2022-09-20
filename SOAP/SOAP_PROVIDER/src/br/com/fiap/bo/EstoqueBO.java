package br.com.fiap.bo;

import org.apache.axis2.AxisFault;

import br.com.fiap.to.ProdutoTO;

public class EstoqueBO {

	public static ProdutoTO ConsultaBO(int codProd) throws AxisFault{
		if (codProd == 401) {
			return new ProdutoTO(codProd,2.99,2,"yeezy");
		}if (codProd == 402) {
			return new ProdutoTO(codProd,2.99,2,"Nike");
		}if (codProd == 403) {
			return new ProdutoTO(codProd,2.99,2,"jordan");
		}else {
			 throw new AxisFault("Produto não encontrado");
		}
	}
}
