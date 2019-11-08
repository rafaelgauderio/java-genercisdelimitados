package entities;

import java.util.List;

public class Funcoes {

	private Double argumento;

	public Funcoes(Double argumento) {
		this.argumento = argumento;
	}

	public double getArgumento() {
		return argumento;
	}

	public static Integer maiorValor(List<Integer> lista) {
		Integer maior = lista.get(0);
		for (Integer apelido : lista) {
			if (apelido.compareTo(maior) > 0) {
				maior = apelido;
			}

		}
		return maior;
	}
	//falar que é o Tipo é um do tipo comparable
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

	public void setArgumento(double argumento) {
		this.argumento = argumento;
	}

	public double funcaoSeno(double argumento) {
		return Math.sin(argumento);

	}

	public double funcaoCosseno(double argumento) {
		return Math.cos(argumento);

	}

	@Override
	public String toString() {
		return "[argumento " + getArgumento() + "]";
	}

}
