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
