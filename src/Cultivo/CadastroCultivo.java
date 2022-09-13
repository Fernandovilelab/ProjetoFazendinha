package Cultivo;

import Cultivo.*;

public class CadastroCultivo {
	private RepositorioCultivos cultivos;

	public CadastroCultivo(RepositorioCultivos repositorioCultivos)
	{
		this.cultivos = repositorioCultivos;
	}

	public void inserirCultivo(Cultivo cultivo) throws CultivoJaCadastradoException {
		if (this.cultivos.existeCultivo(cultivo.getProduto())) {
			throw new CultivoJaCadastradoException();
		} else {
			cultivos.inserirCultivo(cultivo);
		}
	}

	public void removerCultivo(Cultivo cultivo) throws CultivoJaCadastradoException {
		if (this.cultivos.existeCultivo(cultivo.getProduto())) {
			cultivos.removerCultivo(cultivo);
		} else {
			throw new CultivoJaCadastradoException();
		}
	}

	public Cultivo procurarCultivo(String produto) throws CultivoJaCadastradoException {
		if (this.cultivos.existeCultivo(produto)) {
			return cultivos.procurarCultivo(produto);
		} else {
			throw new CultivoJaCadastradoException();
		}
	}

	public String alterarCultivo(Cultivo cultivo) throws CultivoJaCadastradoException {
		String a = "produto nao alterado";
		if (this.cultivos.existeCultivo(cultivo.getProduto())) {
			cultivos.alterarCultivo(cultivo);
		} else {
			throw new CultivoJaCadastradoException();
		}
		return a;
	}
}
