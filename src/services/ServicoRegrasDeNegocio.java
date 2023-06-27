package services;

import java.util.List;

public class ServicoRegrasDeNegocio {

	private Double argumento;

	public ServicoRegrasDeNegocio(Double argumento) {
		this.argumento = argumento;
	}

	public double getArgumento() {
		return argumento;
	}

	public void setArgumento(double argumento) {
		this.argumento = argumento;
	}

	public double funcaoSeno(double argumento) {
		return Math.sin(argumento);

	}

	public double funcaoCosseno(double argumento) {
		return Math.cos(argumento);

	}

	public static Integer maiorValor(List<Integer> lista) {
		if (lista.isEmpty() == true) {
			throw new IllegalStateException("A Lista de inteiros não pode ser vazia");
		}
		Integer maior = lista.get(0);
		for (Integer apelido : lista) {
			if (apelido.compareTo(maior) > 0) {
				maior = apelido;
			}
		}
		return maior;
	}

	// falar que é o Tipo é um do tipo comparable
	public static <Tipo extends Comparable<Tipo>> Tipo maiorValorProduto(List<Tipo> lista) {
		if (lista.isEmpty()) {
			throw new IllegalStateException("A lista nãopode ser vazia");
		}

		Tipo maior = lista.get(0);
		for (Tipo apelido : lista) {
			if (apelido.compareTo(maior) > 0) {
				maior = apelido;
			}

		}
		return maior;
	}

	@Override
	public String toString() {
		return "[argumento " + getArgumento() + "]";
	}

}
