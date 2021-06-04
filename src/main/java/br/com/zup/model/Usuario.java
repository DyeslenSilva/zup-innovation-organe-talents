package br.com.zup.model;

import javax.persistence.Column;
import javax.persistence.Table;

@Table
public class Usuario {
	
	@Column
	private String nome;
	
	@Column(unique = true)
	private String email;
	@Column
	private String dataDeNascimento;
	
	@Column(unique = true)
	private String cpf;
	
	
	public boolean desativado;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public boolean isDesativado() {
		return desativado;
	}
	public void setDesativado(boolean desativado) {
		this.desativado = desativado;
	}
}
