package br.com.hickandrade.bo;

import org.apache.axis2.AxisFault;

import br.com.hickandrade.to.ProdutoTO;

public class ProdutoBO {
	public static ProdutoTO ConsultarProd(int codigo) throws AxisFault{
		if (codigo == 1) {
			return new ProdutoTO(codigo, "banana", 1.00);
		}else if (codigo == 2) {
			return new ProdutoTO(codigo, "Uva", 2.00);
		}else if (codigo == 3) {
			return new ProdutoTO(codigo, "Maça", 3.00);
		}else if (codigo == 4) {
			return new ProdutoTO(codigo, "pera", 4.00);
		}else {
			throw new AxisFault("Deu ruim");
		}
		
		
	}
}
