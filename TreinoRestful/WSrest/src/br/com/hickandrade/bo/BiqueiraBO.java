package br.com.hickandrade.bo;

import java.util.ArrayList;
import java.util.List;

import br.com.hickandrade.to.BiqueiraTO;

public class BiqueiraBO {
	private static BiqueiraBO biqueiraBo;
	private static List<BiqueiraTO>lista = new ArrayList<BiqueiraTO>();
	
	public static BiqueiraBO getInstance() {
		if (biqueiraBo == null) {
			biqueiraBo = new BiqueiraBO();
		}
		return biqueiraBo;
	}
	
	public BiqueiraBO() {
		lista.add(new BiqueiraTO(1, "crack", 4.00));
		lista.add(new BiqueiraTO(2, "pó", 1.00));
		lista.add(new BiqueiraTO(3, "coca", 2.00));
		lista.add(new BiqueiraTO(4, "maconha", 4.20));
		System.out.println("S: "+ lista.size());
	
	}
	public List<BiqueiraTO> lista() {
		return lista;
	}

	public BiqueiraTO consultar(int codigo) {
		for (BiqueiraTO biqueira : lista) {
			if (biqueira.getCodigo() == codigo) {
				return biqueira;
			}
		}
		return null;
	}

	public void cadastrar(BiqueiraTO biqueira) {
		lista.add(biqueira);
	}

	public void atualizar(BiqueiraTO biqueira) {
		for (BiqueiraTO biq : lista) {
			if (biq.getCodigo() == biqueira.getCodigo()) {
				biq.setCodigo(biqueira.getCodigo());
				biq.setNome(biqueira.getNome());
				biq.setValor(biqueira.getValor());
				break;
			}
		}
	}

	public Object deletar(int codigo) {
		for (BiqueiraTO biqueira : lista) {
			if (biqueira.getCodigo() == codigo) {
				lista.remove(codigo);
			}
		}
		
		return null;
	}


	
	
	
	
}
