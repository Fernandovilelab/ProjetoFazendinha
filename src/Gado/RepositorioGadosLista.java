package Gado;

public class RepositorioGadosLista implements RepositorioGados {
	private Gado gado;
	private RepositorioGadosLista proximo;

	public RepositorioGadosLista() {
		this.gado = null;
		this.proximo = null;
	}

	public void inserirGado(Gado gado) {
		if (this.proximo == null) {
			this.gado = gado;
			this.proximo = new RepositorioGadosLista();
		} else {
			this.proximo.inserirGado(gado);
		}
	}

	public void removerGado(String brinco) {
		if (this.gado != null && this.gado.getBrinco().equals(brinco)) {
			this.gado = this.proximo.gado;
			this.proximo = this.proximo.proximo;

		} else if (this.gado != null) {
			this.proximo.removerGado(brinco);
		}

	}

	public Gado procurarGado(String brinco) {
		if (this.gado != null && this.gado.getBrinco().equals(brinco)) {
			return this.gado;
		} else
			return this.proximo.procurarGado(brinco);

	}

	public void atualizarGado(Gado gado) {
		if (this.gado != null && this.gado.getBrinco().equals(gado.getBrinco())) {
			this.gado = gado;

		} else if (this.gado != null) {
			this.proximo.atualizarGado(gado);
		}

	}

	public boolean existeGado(String brinco) {
		boolean achou = false;
		if (this.gado != null && this.gado.getBrinco().equals(brinco))
			achou = true;
		else if (this.gado != null)
			return this.proximo.existeGado(brinco);

		return achou;

	}

}
