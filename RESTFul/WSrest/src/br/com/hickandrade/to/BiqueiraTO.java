package br.com.hickandrade.to;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class BiqueiraTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private int codigo;
	private String nome;
	private double valor;

	public BiqueiraTO(int codigo, String nome, double valor) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.valor = valor;
	}

	public BiqueiraTO() {
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

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
