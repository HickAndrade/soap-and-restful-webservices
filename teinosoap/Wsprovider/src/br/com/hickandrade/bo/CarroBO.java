package br.com.hickandrade.bo;

import org.apache.axis2.AxisFault;

import br.com.hickandrade.to.CarroTO;

public class CarroBO {
	
	public static CarroTO consulta(int codigo) throws AxisFault{
		if (codigo == 1) {
			return new CarroTO(codigo, "Citroen", 40.000);
		}else if (codigo == 1) {
			return new CarroTO(codigo, "BMW", 400.000);
		}else if (codigo == 1) {
			return new CarroTO(codigo, "Chevrolet", 34.000);
		}else {
			throw new AxisFault("Carro não encontrado");
		}
		
		
	}
}
