package Insumos;

public class Insumo {
	private String nome; // Nome do item a ser Utilizado
	private int quantidade; // quantidade de Itens

	// Contrutor de Insumo
	public Insumo(String nome, int quantidade) {
		this.nome = nome;
		this.quantidade = quantidade;
	}

	// Definindo Gets e Sets para atributos recebido da classe Main
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}
