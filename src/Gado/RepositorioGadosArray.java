package Gado;

public class RepositorioGadosArray implements RepositorioGados {
	private Gado[] gados;
	private int indice;

	public RepositorioGadosArray(int tamanho) {
		gados = new Gado[1];
		this.indice = 0;
	}

	public void inserirGado(Gado gado) {
		if (indice == gados.length) {
			Gado[] arrayArmazenar = new Gado[indice + 1];
			for (int i = 0; i < gados.length; i++) {
				arrayArmazenar[i] = gados[i];
			}
			this.gados = arrayArmazenar;
		}
		this.gados[indice] = gado;
		indice++;
	}

	public void removerGado(String brinco) {
		for (int a = 0; a < gados.length; a++) {
			if (gados[a] != null) {
				if (gados[a].getBrinco().equals(brinco)) {
					gados[a] = null;
					a = gados.length + 1;
				}
			}
		}

	}

	public Gado procurarGado(String brinco) {
		Gado g = null;
		for (int a = 0; a < gados.length; a++) {
			if (gados[a] != null) {
				if (gados[a].getBrinco().equals(brinco)) {
					g = gados[a];
				}
			}
		}
		return g;

	}

	public void atualizarGado(Gado gado) {
		for (int a = 0; a < gados.length; a++) {
			if (gados[a] != null) {
				if (gados[a].getBrinco().equals(gado.getBrinco())) {
					gados[a] = gado;
					a = gados.length + 1;
				}
			}
		}

	}

	public boolean existeGado(String brinco) {
		boolean achou = false;
		for (int a = 0; a < gados.length && gados[a] != null; a++) {
			if (gados[a] != null) {
				if (gados[a].getBrinco().equals(brinco)) {
					achou = true;
					a = gados.length + 1;
				}
			}
		}
		return achou;
	}

}
