package br.com.zup.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.zup.model.Usuario;
import br.com.zup.model.Veiculo;
import br.com.zup.repo.VeiculoRepo;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

@Service
public class VeiculoService {

	@Autowired
	private VeiculoRepo veiculoRepo;
	
	public void salvarVeiculos(@PathVariable Veiculo veiculo) {
		veiculoRepo.save(veiculo);
	}
	
	public Response getVeiculosModelo() throws IOException {
		OkHttpClient veiculoModelo = new OkHttpClient().newBuilder()
				  .build();
				Request request = new Request.Builder()
				  .url("https://parallelum.com.br/fipe/api/v1/carros/marcas/23/modelos")
				  .method("GET", null)
				  .build();
				Response response = veiculoModelo.newCall(request).execute();
				return response;
	}
	
	
	
}
