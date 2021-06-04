package br.com.zup.model;

import javax.persistence.Column;
import javax.persistence.Table;

@Table
public class Veiculo {

	@Column
	private String marca;
	@Column
	private String modelo;
	@Column
	private int ano;

	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
}
