package br.com.zup.model;

public class UsuarioSistema {

	private String usuario;
	private String senha;
	private String usuarioPorlogin;
	private String permissaoUsuario;
	private String permissaoGrupo;
	private String prefixo;

	
	
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
	public String getPermissaoUsuario() {
		return permissaoUsuario;
	}
	public void setPermissaoUsuario(String administrador) {
		this.permissaoUsuario = administrador;
	}
	public String getPermissaoGrupo() {
		return permissaoGrupo;
	}
	public void setPermissaoGrupo(String permissaoGrupo) {
		this.permissaoGrupo = permissaoGrupo;
	}
	public String getPrefixo() {
		return prefixo;
	}
	public void setPrefixo(String prefixo) {
		this.prefixo = prefixo;
	}
	public String getUsuarioPorlogin() {
		return usuarioPorlogin;
	}
	public void setUsuarioPorlogin(String usuarioPorlogin) {
		this.usuarioPorlogin = usuarioPorlogin;
	}
}
