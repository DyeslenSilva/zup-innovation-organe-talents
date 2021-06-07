package br.com.zup.others;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class ConsultaDeVeiculos {

	
	
	public Response fipeModelos() throws IOException {
		OkHttpClient client = new OkHttpClient().newBuilder()
				  .build();
				Request request = new Request.Builder()
				  .url("https://parallelum.com.br/fipe/api/v1/carros/marcas/23/modelos")
				  .method("GET", null)
				  .build();
				Response response = client.newCall(request).execute();
				return response;
	}
	
	
	public Response fipeAnos() throws IOException {
		OkHttpClient client = new OkHttpClient().newBuilder()
				  .build();
				Request request = new Request.Builder()
				  .url("https://parallelum.com.br/fipe/api/v1/carros/marcas/23/modelos/5975/anos")
				  .method("GET", null)
				  .build();
				Response responseCarroAno = client.newCall(request).execute();
				return responseCarroAno;
	}
	
	
	public Response fipeCarros() throws IOException {
		OkHttpClient client = new OkHttpClient().newBuilder()
				  .build();
				Request request = new Request.Builder()
				  .url("https://parallelum.com.br/fipe/api/v1/carros/marcas/23/modelos/5975/anos/2016-1")
				  .method("GET", null)
				  .build();
				Response responseCarros = client.newCall(request).execute();
				return responseCarros;
	}
	
	
}
