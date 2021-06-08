package br.com.zup.model;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

@Table
public class Usuario {
	
	@Column
	@NotNull
	@Size(min = 3, max = 30)
	private String nome;
	
	@Column(unique = true)
	@NotNull
	@Size(min = 3, max = 50)
	@Email(message = "Email Incorreto")
	private String email;
	
	
	@Column
	@NotNull
	@Size(min = 3, max = 11)
	private String dataDeNascimento;
	
	@Column(unique = true)
	@NotNull
	@Size(min = 4,max = 20)
	private String cpf;
	

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

	
}
