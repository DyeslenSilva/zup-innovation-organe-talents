package br.com.zup.model;

import javax.persistence.Column;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Table
public class Veiculo {

	
	
	@Column
	@NotNull
	private String marca;
	
	@Column
	@NotNull
	private String modelo;
	
	@Column
	@NotNull
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
