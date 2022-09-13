package Cultivo;
import Cultivo.*;

public class RepositorioCultivosArray implements RepositorioCultivos {
	
	private Cultivo[] array;
	private int indice;
	
	public void RepositorioCultivoArray(int tamanho) {
		this.array = new Cultivo[tamanho];
		this.indice = 0;
	}
	public void inserirCultivo (Cultivo cultivo) {
		for (int i=0; i < array.length; i++) {
			if(array[i] == null) {
				array[i] = cultivo;
				i = array.length + 1;
			}
		}
	}
	public void removerCultivo (Cultivo cultivo) {
		for (int i=0; i < array.length; i++) {
			if(array[i].getProduto().equals(cultivo)) {
				array[i] = null;
			}
			
		}
	}
	public String alterarCultivo (Cultivo cultivo) {
		String resposta = "Produto nao alterado!";
		for (int i=0; i < array.length; i++) {
			if(array[i].getProduto().equals(cultivo)) {
				array[i] = cultivo;
				resposta = "Produto alterado com sucesso!";
			}
		}
		return resposta;
	}
	public boolean existeCultivo (String produto) {
		boolean existe = false;
		for (int i=0; i < array.length; i++) {
			if(array[i].getProduto().equals(produto)) {
				existe = true;
			}
		}
		return existe;
	}
	public Cultivo procurarCultivo(String produto) {
		Cultivo prod = null;
		//String resposta = "Produto nao encontrado";
		for (int i=0; i < array.length; i++) {
			if(array[i].getProduto().equals(produto)) {
				array[i] = null;
				i = array.length + 1;
			}
		}
		return prod;
	}
}
