package Insumos;

import Insumos.*;

public class RepositorioInsumosLista implements RepositorioInsumos {
	private Insumo insumo = new Insumo(null, 0); // puxando a classe insumo (gets e sets)
	private RepositorioInsumosLista proximo;

	public RepositorioInsumosLista() // Lista padrão
	{
		this.insumo = null;
		this.proximo = null;
	}

	public void inserirInsumo(Insumo insumo) // Metodo Inserindo Item
	{
		if (this.insumo == null) {
			this.insumo = insumo;
			this.proximo = new RepositorioInsumosLista();
		} else {
			this.proximo.inserirInsumo(insumo);
		}
	}

	public String removerInsumo(Insumo insumo) // Removendo e Enviando resposta sobre a operacao
	{
		String resposta = "Remover o Item Não Existe";
		if (this.proximo != null && this.insumo.equals(insumo)) {
			this.insumo = this.proximo.insumo;
			this.proximo = this.proximo.proximo;

			resposta = "Insumo Removido com Sucesso";
		} else {
			this.proximo.removerInsumo(insumo);
		}
		return resposta;
	}

	public String alterarInsumo(Insumo insumo) // Alterando e enviando mensagem sobre o procedimento
	{
		String resposta = "Insumo Não Encontrado";
		if (this.insumo.getNome() == insumo.getNome()) {
			this.insumo = insumo;
			resposta = "Insumo Alterado Com Sucesso";
		} else {
			this.proximo.alterarInsumo(insumo);
		}
		return resposta;
	}

	public boolean existeInsumo(String item) // Verificando se item existe e eviando boolean como resposta
	{
		boolean resposta = false;
		if (this.insumo != null && this.proximo != null && this.insumo.getNome() == item) {
			resposta = true;
		} else if (this.proximo != null) {
			this.proximo.existeInsumo(item);
		}

		return resposta;

	}

	public Insumo procurarInsumo(String item) // Procurando elemento da lista
	{
		Insumo elemento = null;
		if (this.insumo != null) {
			elemento = this.insumo;
		} else {
			this.proximo.procurarInsumo(item);
		}
		return elemento;
	}

}
