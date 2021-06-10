package br.com.zup.security.model;

import java.io.Serializable;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;

public class UsuarioSistema implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = -7276444318065023554L;
	private Long idUsuarioSistema;
	private String usuario;
	private String senha;
	private boolean ativo;

	
	public UsuarioSistema(Long idUsuarioSistema, String usuario, String senha, boolean ativo) {
		super();
		this.idUsuarioSistema = idUsuarioSistema;
		this.usuario = usuario;
		this.senha = senha;
		this.ativo = ativo;
	}


	public UsuarioSistema(String string, String string2, String string3) {
		// TODO Auto-generated constructor stub
	}
	
	
	

	public UsuarioSistema(String nome, String usuario2, String senha2,
			Collection<? extends GrantedAuthority> authorities) {
		// TODO Auto-generated constructor stub
	}


	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}


	public Long getIdUsuarioSistema() {
		return idUsuarioSistema;
	}


	public void setIdUsuarioSistema(Long idUsuarioSistema) {
		this.idUsuarioSistema = idUsuarioSistema;
	}


	public boolean isAtivo() {
		return ativo;
	}


	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

}
