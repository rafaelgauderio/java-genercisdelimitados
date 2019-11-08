package entities;

public class Produto implements Comparable<Produto>{

	private Double preco;
	private String nome;

	public Produto(String nome, Double preco) {
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
		return "Produto [nome=" + nome + ", preco=R$ " + String.format("%.2f", preco) + "]";
	}

	@Override
	public int compareTo(Produto outro) {
	//Nese caso ele compara os preços e retorna o maior	
		return preco.compareTo(outro.getPreco());
	}

}
