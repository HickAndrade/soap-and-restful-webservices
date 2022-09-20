package br.com.hickandrade.bo;

import java.util.ArrayList;
import java.util.List;

import br.com.hickandrade.to.TenisTO;

public class EstoqueBO {

	private static EstoqueBO estoqueBo;
	private static ArrayList<TenisTO> lista = new ArrayList<TenisTO>();

	public static EstoqueBO getInstance() {
		if (estoqueBo == null) {
			estoqueBo = new EstoqueBO();
		}
		return estoqueBo;
	}

	public EstoqueBO() {
		lista.add(new TenisTO(1, "Nike SB", 45));
	}

	public List<TenisTO> lista() {
		return lista;
	}

	public void cadastrar(TenisTO tenis) {
		lista.add(tenis);

	}

	public TenisTO buscar(int codigo) {
		for (TenisTO tenis : lista) {
			if (tenis.getCodigo() == codigo) {
				return tenis;
			}
		}
		return null;
	}

	public void atualiza(TenisTO tenis) {
		for (TenisTO tenis2 : lista) {
			if (tenis2.getCodigo() == tenis.getCodigo()) {
				tenis2.setCodigo(tenis.getCodigo());
				tenis2.setMarca(tenis.getMarca());
				tenis2.setTamanho(tenis.getTamanho());
				break;
			}
		}

	}

	public void remover(int codigo) {
		for (TenisTO tenis : lista) {
			if (tenis.getCodigo() == codigo) {
				lista.remove(codigo);
			}
		}
	}

}
