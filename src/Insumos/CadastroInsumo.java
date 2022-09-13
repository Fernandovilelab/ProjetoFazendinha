package Insumos;

import Insumos.*;


public class CadastroInsumo {// classse de regra de negocio

	private RepositorioInsumos insumos;

	public CadastroInsumo(RepositorioInsumos repositorioInsumos) {
		this.insumos = repositorioInsumos;
	}

	public void inserirInsumo(Insumo insumo) throws InsumoJaCadastradoException {
		if (this.insumos.existeInsumo(insumo.getNome())) {
			throw new InsumoJaCadastradoException();
		} else {
			insumos.inserirInsumo(insumo);
		}
	}

	public void removerInsumo(Insumo insumo) throws InsumoNaoCadastradoException {
		if (this.insumos.existeInsumo(insumo.getNome())) {
			insumos.removerInsumo(insumo);
		} else {
			throw new InsumoNaoCadastradoException();
		}
	}

	public Insumo procurarInsumo(String item) throws InsumoNaoCadastradoException {
		if (this.insumos.existeInsumo(item)) {
			return insumos.procurarInsumo(item);
		} else {
			throw new InsumoNaoCadastradoException();
		}
	}

	public void alterarInsumo(Insumo insumo) throws InsumoNaoCadastradoException {
		if (this.insumos.existeInsumo(insumo.getNome())) {
			insumos.alterarInsumo(insumo);
		} else {
			throw new InsumoNaoCadastradoException();
		}
	}
}
