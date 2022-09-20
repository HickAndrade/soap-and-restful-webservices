package br.com.fiap.TO;

import java.io.Serializable;

public class TenisTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private int codigo;
	private String marca;
	private int tamanho;

	public TenisTO(int codigo, String marca, int tamanho) {
		super();
		this.codigo = codigo;
		this.marca = marca;
		this.tamanho = tamanho;
	}

	public TenisTO() {
		super();

	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

}
