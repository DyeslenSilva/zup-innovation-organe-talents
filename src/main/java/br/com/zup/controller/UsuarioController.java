package br.com.zup.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.zup.model.Usuario;
import br.com.zup.service.UsuarioService;

@Controller
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;

	
	@RequestMapping(path = "/saveUsuario", method = RequestMethod.POST)
	public ResponseEntity<Object> cadastro(@RequestBody  Usuario usuario, 
			BindingResult brUsuario){
		if(brUsuario.hasErrors()) {
			return new ResponseEntity<>(brUsuario, HttpStatus.BAD_REQUEST);
		}else {
			usuarioService.salvarUsuario(usuario);
			return new ResponseEntity<Object>(brUsuario, HttpStatus.ACCEPTED);
		}
	}
	
	
	@RequestMapping(path = "/usuarios", method =  RequestMethod.GET)
	public ResponseEntity<Object> getUsusarios(){
		return ResponseEntity.ok(usuarioService.getUsuarios());
		
	}
	
	@RequestMapping(path = "/usuario/{cpf}", method = RequestMethod.GET)
	public ResponseEntity<Object> getUsuario(@PathVariable String cpf){
		usuarioService.getUsuario(cpf);
		return ResponseEntity.ok().build();
	}
}
