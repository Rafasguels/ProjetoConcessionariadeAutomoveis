package entities;

public class Cliente {
	
	private String nome;
	private double  cpf;
	
	public Cliente() {
		
	}

	public Cliente(String nome, double cpf) {
		super();
		this.nome = nome;
		cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getCpf() {
		return cpf;
	}

	public void setCpf(double cpf) {
		this.cpf = cpf;
	}
	
	

}
