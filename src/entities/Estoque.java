package entities;

public class Estoque {
	
	private Integer quantidade;
	private double preco;
	
	private Carro carro;
	
	public Estoque() {
		
	}

	public Estoque(Integer quantidade, double preco) {
		super();
		this.quantidade = quantidade;
		this.preco = preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	

}
