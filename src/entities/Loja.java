package entities;

import java.util.ArrayList;
import java.util.List;

import entities.enums.SituacaoDaLoja;

public class Loja {
	
	private SituacaoDaLoja status;
	
	private Cliente cliente;
	
	private List<Estoque> estoque = new ArrayList<Estoque>();
	
	public Loja () {
		
	}

	public Loja(SituacaoDaLoja status, Cliente cliente) {
		super();
		this.status = status;
		this.cliente = cliente;
	}

	public SituacaoDaLoja getStatus() {
		return status;
	}

	public void setStatus(SituacaoDaLoja status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	//Adicionar veiculos ao estoque
	public void comprarVeiculos(Estoque veiculos) {
		estoque.add(veiculos);
	}
	
	//Remover veiculos ao estoque
	public void venderVeiculos(Estoque veiculos) {
		estoque.remove(veiculos);
	}
	
	//Informaçao caso o estoque esteja cheio
	public void estoqueLotado() {
		if (estoque.size() > 10) {
			System.out.println ("estoque de veiculos esta cheio");
		}
	}
	
	
	
}
