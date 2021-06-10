package br.com.zup.security.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

public class Permissao implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4736643043988658708L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPermissao;
	
	
	private String nome;
	
	@ManyToMany(mappedBy = "permissoes")
	private List<UsuarioSistema> usuarioSistema;
	
	@ManyToMany(mappedBy = "permissoes")
	public List<Grupo> grupos;

	public Long getIdPermissao() {
		return idPermissao;
	}

	public void setIdPermissao(Long idPermissao) {
		this.idPermissao = idPermissao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<UsuarioSistema> getUsuarioSistema() {
		return usuarioSistema;
	}

	public void setUsuarioSistema(List<UsuarioSistema> usuarioSistema) {
		this.usuarioSistema = usuarioSistema;
	}

	public List<Grupo> getGrupos() {
		return grupos;
	}

	public void setGrupos(List<Grupo> grupos) {
		this.grupos = grupos;
	}




}
