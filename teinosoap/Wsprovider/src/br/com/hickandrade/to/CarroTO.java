package br.com.hickandrade.to;

import java.io.Serializable;

public class CarroTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private int codigo;
	private String marca;
	private double preço;

	public CarroTO(int codigo, String marca, double preço) {
		super();
		this.codigo = codigo;
		this.marca = marca;
		this.preço = preço;
	}

	public CarroTO() {
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

	public double getPreço() {
		return preço;
	}

	public void setPreço(double preço) {
		this.preço = preço;
	}

}
