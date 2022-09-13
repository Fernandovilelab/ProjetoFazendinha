package Cultivo;

public class Cultivo {

	private String produto; 
	private int quantidade; 
	private boolean controlePraga;
	private String irrigacao;
	private String colheita;
	
	public Cultivo (String produto, int quantidade, boolean controlePraga, String irrigacao, String colheita){
		this.produto = produto;
		this.quantidade = quantidade;
		this.controlePraga = controlePraga;
		this.irrigacao = irrigacao;
		this.colheita = colheita;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public int getQuantidade(){
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public boolean getControlePraga(){
		return controlePraga;
	}
	public void setControlePraga(boolean controlePraga) {
		this.controlePraga = controlePraga;
	}
	public String getIrrigacao(){
		return irrigacao;
	}
	public void setIrrigacao(String irrigacao) {
		this.irrigacao = irrigacao;
	}
	public String getColheita(){
		return colheita;
	}
	public void setColheita(String colheita) {
		this.colheita = colheita;
	}

}
