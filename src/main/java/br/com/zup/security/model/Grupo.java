package br.com.zup.security.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

public class Grupo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	private String descicao;
	
	@ManyToMany(mappedBy = "grupos")
	private List<UsuarioSistema> usuarioSistema;
	
	private List<UsuarioSistema> permissoes;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescicao() {
		return descicao;
	}

	public void setDescicao(String descicao) {
		this.descicao = descicao;
	}

	public List<UsuarioSistema> getUsuarioSistema() {
		return usuarioSistema;
	}

	public void setUsuarioSistema(List<UsuarioSistema> usuarioSistema) {
		this.usuarioSistema = usuarioSistema;
	}

	public List<UsuarioSistema> getPermissoes() {
		return permissoes;
	}

	public void setPermissoes(List<UsuarioSistema> permissoes) {
		this.permissoes = permissoes;
	}
	
	
	
	
}
