package br.com.zup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tarcisio.resources.FipeResource;
import com.tarcisio.services.ModeloService;

import br.com.zup.model.Veiculo;
import br.com.zup.service.VeiculoService;

@RestController
public class VeiculoController {

	@Autowired
	private ModeloService modeloService;
	
	private VeiculoService veiculoService;
	
	
	/*
	 * import com.tarcisio.services.ModeloService;
	 * 
	 * Nesta classe foi utilizada uma API externa,
	 * de outro projeto para poder realizar buscas de carros
	 * para um determinado usuario no sistema.
	 * 
	 */
	
	
	@RequestMapping(path = "/veiculo" , method = RequestMethod.POST)
	public ResponseEntity<Object> cadastrarVeiculo(@PathVariable Veiculo veiculo,
			BindingResult brVeiculo){
		if(brVeiculo.hasErrors()) {
			return new ResponseEntity<>(brVeiculo, HttpStatus.BAD_REQUEST);
		}else {
			veiculoService.cadastroVeiculo(veiculo);
			return new ResponseEntity<>(brVeiculo, HttpStatus.ACCEPTED);
		}
	}
	
	@RequestMapping(path = "/veiculo/{marca}", method = RequestMethod.GET)
	public ResponseEntity<Veiculo> encontrarCarroPorMarca(@PathVariable String marca){
		modeloService.findById(marca);
		return ResponseEntity.ok().build();
	}
	
	@RequestMapping(path = "/veiculo/{marca}/{modelo}")
	public ResponseEntity<Veiculo> encontrarCarroPorModelo(String marca,String modelo){
		modeloService.findByModeloId(modelo, marca);
		return ResponseEntity.ok().build();
	}

}
