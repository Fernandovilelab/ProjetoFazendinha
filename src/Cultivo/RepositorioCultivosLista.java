package Cultivo;
import Cultivo.*;

public class RepositorioCultivosLista implements RepositorioCultivos {
	
	private Cultivo cultivo ;
	private RepositorioCultivosLista next;
	
	public  RepositorioCultivosLista (){
		this.cultivo = null;
		this.next = null;
	}
	
	public void inserirCultivo (Cultivo cultivo) {
		
		if(this.next == null) {
			this.cultivo = cultivo;
			this.next = new RepositorioCultivosLista();
		}
		else {
			this.next.inserirCultivo(cultivo);
		}
	}
	public void removerCultivo (Cultivo cultivo) {
		if (this.cultivo != null && this.cultivo.getProduto().equals(cultivo)) {
			this.cultivo = this.next.cultivo;
			this.next = this.next.next;
		}
		else if (this.cultivo != null) {
			this.next.removerCultivo(cultivo);
		}
	}
	public String alterarCultivo(Cultivo cultivo) {
		String resposta = "Produto nao alterado!";
		if (this.cultivo != null && this.cultivo.getProduto().equals(cultivo)) {
			this.cultivo = cultivo;
			resposta = "Produto alterado";
		}
		else if (this.cultivo != null) {
			this.next.alterarCultivo(cultivo);
		}
		return resposta;
		
	}
	public boolean existeCultivo (String produto) {
		boolean existe = false;
		if (this.cultivo != null && this.cultivo.getProduto().equals(produto)) {
			existe = true;
		}
		else if (this.cultivo != null) {
			return this.next.existeCultivo (produto);
		}
		return existe;
	}
	public Cultivo procurarCultivo(String produto) {
	
		//String resposta = "Produto nao encontrado";
		if (this.cultivo != null && this.cultivo.getProduto().equals(produto)) {
			return this.cultivo;
		}
		else{
			return this.next.procurarCultivo(produto);
		}

	}
}

