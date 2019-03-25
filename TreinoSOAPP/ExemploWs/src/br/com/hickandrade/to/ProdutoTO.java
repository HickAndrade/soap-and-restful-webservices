package br.com.hickandrade.to;

import java.io.Serializable;

public class ProdutoTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private int codigo;
	private String nome;
	private double preço;

	public ProdutoTO(int codigo, String nome, double preço) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.preço = preço;
	}

	public ProdutoTO() {
		super();
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreço() {
		return preço;
	}

	public void setPreço(double preço) {
		this.preço = preço;
	}

}
