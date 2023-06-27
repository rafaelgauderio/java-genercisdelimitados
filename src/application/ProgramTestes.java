package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import services.ServicoRegrasDeNegocio;

public class ProgramTestes {

	public static void main(String[] args) {

		double x = 0.95;

		ServicoRegrasDeNegocio func = new ServicoRegrasDeNegocio(x);

		System.out.println(func);
		System.out.println("Seno do argumento: " + String.format("%.2f", func.funcaoSeno(x)));
		System.out.println("Cosseno do argumento: " + String.format("%.2f", func.funcaoCosseno(x)));
		System.out.println("--------------------------------------------");

		List<Integer> lista = new ArrayList<Integer>();
		String caminho = "c:\\temp\\generics.txt";

		try {
			BufferedReader br = new BufferedReader(new FileReader(caminho));

			// vai ler cada linha do arquivo
			String linha = br.readLine();
			while (linha != null) {
				lista.add(Integer.parseInt(linha));
				linha = br.readLine();

			}
			for (Integer apelido : lista) {
				System.out.println("[" + apelido + "]");

			}
			// funcao estática não precisa ser instãnciada
			Integer maiorDaLista = ServicoRegrasDeNegocio.maiorValor(lista);

			System.out.println("O maior valor da lista é " + maiorDaLista);

			System.out.println("-------------------------------------------");

		} // fim do bloco try

		catch (IOException erro) {
			System.out.println("Deu erro" + erro.getMessage());

		}

	}

}
