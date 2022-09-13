package Gado;

public class CadastroGado {
	private RepositorioGados gados;
	
	public int quantidadeGados = 0;
	
	public  CadastroGado(RepositorioGados repositorioGados) {
		this.gados= repositorioGados;
	}
	
	public void inserirGado(Gado gado) throws GadoJaCadastradoException {
		if (!this.gados.existeGado(gado.getBrinco())) {
			gados.inserirGado(gado);
			quantidadeGados++;
		} else {
			throw new GadoJaCadastradoException();
		}
	}

	public void removerGado(String brinco) throws GadoNaoExisteException {
		if (this.gados.existeGado(brinco)) {
			gados.removerGado(brinco);
			quantidadeGados--;
		} else {
			throw new GadoNaoExisteException();
		}
	}

	public Gado procurarGado(String brinco) throws GadoNaoExisteException {
		if (this.gados.existeGado(brinco)) {
			return gados.procurarGado(brinco);
		} else {
			throw new GadoNaoExisteException();
		}

	}

	public void atualizarGado(Gado gado) throws GadoNaoExisteException {
		if (this.gados.existeGado(gado.getBrinco())) {
			gados.atualizarGado(gado);
		} else {
			throw new GadoNaoExisteException();
		}

	}

}
