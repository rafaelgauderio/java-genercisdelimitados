package entities;

public class Produto {

	private Double preco;
	private String nome;

	public Produto(Double preco, String nome) {
		this.preco = preco;
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Produto [nome= " + nome + ", preco= " + String.format("%.2f", preco) + "]";
	}

}
