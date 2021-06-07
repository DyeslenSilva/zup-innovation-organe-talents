package br.com.zup.others;

import java.util.Scanner;

import org.springframework.stereotype.Service;

import br.com.zup.model.Veiculo;

@Service
public class VeiculoRodizio {
	
	
	Scanner scanner = new Scanner(System.in);
	
	
	public void rodozioDeCarros(String anoDoVeiculo) {
		anoDoVeiculo = scanner.nextLine();
		if(anoDoVeiculo.endsWith("0")&&anoDoVeiculo.endsWith("1")) {
			System.out.println("Segunda Feira");
		}else if (anoDoVeiculo.endsWith("2") && anoDoVeiculo.endsWith("3")) {
			System.out.println("Terça Feira");
		}else if(anoDoVeiculo.endsWith("4") && anoDoVeiculo.endsWith("5")) {
			System.out.println("Quarta Feira");
		}else if(anoDoVeiculo.endsWith("6") && anoDoVeiculo.endsWith("7")){
			System.out.println("Quinta Feira");
		}else if(anoDoVeiculo.endsWith("8") && anoDoVeiculo.endsWith("9")) {
			System.out.println("Sexta Feira");
		}else {
			System.out.println("Erro de Sistema");
		}
	}
	
	
	public boolean atributoDeRodizio(String diaDaSemana, String anoDoVeiculo) {
		if(diaDaSemana.equals("Segunda Feira") && anoDoVeiculo.endsWith("0")
				&& anoDoVeiculo.endsWith("1")) {
			return true;
		}else if(diaDaSemana.equals("Terca Feira ") && anoDoVeiculo.endsWith("2")
				&& anoDoVeiculo.endsWith("3")) {
			return true;
		}else if(diaDaSemana.equals("Quarta Feira") && anoDoVeiculo.endsWith("4") &&
				anoDoVeiculo.endsWith("5")) {
			return true;
		}else if(diaDaSemana.equals("Quinta Feira") && anoDoVeiculo.endsWith("6")&&
				anoDoVeiculo.endsWith("7")) {
			return true;
		}else if(diaDaSemana.equals("Sexta Feira") && anoDoVeiculo.endsWith("8") &&
				anoDoVeiculo.endsWith("9")) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
	

	
}
