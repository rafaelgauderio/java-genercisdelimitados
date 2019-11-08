package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Funcoes;
import entities.Produto;

public class Genericis {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Produto> lista = new ArrayList<Produto>();
		String caminho = "c:\\temp\\genericsdelimitados.txt";

		try {
			BufferedReader br = new BufferedReader(new FileReader(caminho));
			
			String linha = br.readLine();
			while (linha != null) {
				//Fazer o arquivo csv ser splitado por um determinado caracter;
				String [] campos= linha.split(",");
				lista.add(new Produto(campos[0],Double.parseDouble(campos[1])));
				linha = br.readLine();

			}
			for (Produto apelido : lista) {
				System.out.println("[" + apelido + "]");

			}
			
			Produto maiorDaLista = Funcoes.maiorValorProduto(lista);
			System.out.println("\nO maior valor da lista é " + maiorDaLista);


		} 
		catch (IOException erro) {
			System.out.println("Deu erro" + erro.getMessage());

		}


	}

}
