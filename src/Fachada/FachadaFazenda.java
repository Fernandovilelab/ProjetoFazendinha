package Fachada;

import Fachada.*;
import Gado.*;
import Cultivo.*;
import Funcionarios.*;
import Insumos.*;


public class FachadaFazenda {
	private CadastroGado gados;
	private CadastroFuncionario funcionarios;
	private CadastroInsumo insumos;
	private CadastroCultivo cultivos;

	public FachadaFazenda(RepositorioGados respositorioGado, RepositorioFuncionarios repositorioFuncionario,
			RepositorioInsumos repositorioInsumo, RepositorioCultivos repositorioCultivo) {
		this.gados = new CadastroGado(respositorioGado);
		this.funcionarios = new CadastroFuncionario(repositorioFuncionario);
		this.insumos = new CadastroInsumo(repositorioInsumo);
		this.cultivos = new CadastroCultivo(repositorioCultivo);

	}

	// GADO
	public void cadastrarGado(Gado gado) throws GadoJaCadastradoException, ExcessodeGadoException {
		if(funcionarios.quantidadeFuncionarios*10>gados.quantidadeGados)
		gados.inserirGado(gado);
		else {
			throw new ExcessodeGadoException();
		}
		
	}

	public void removerGado(String brinco) throws GadoNaoExisteException {
		gados.removerGado(brinco);
	}

	public Gado procurarGado(String brinco) throws GadoNaoExisteException {
		return gados.procurarGado(brinco);
	}

	public void atualizarGado(Gado gado) throws GadoNaoExisteException {
		gados.atualizarGado(gado);
	}

	// INSUMO
	public void inserirInsumo(Insumo insumo) throws InsumoJaCadastradoException {
		insumos.inserirInsumo(insumo);
	}

	public void removerInsumo(Insumo insumo) throws InsumoNaoCadastradoException {
		insumos.removerInsumo(insumo);
	}

	public Insumo procurarInsumo(String item) throws InsumoNaoCadastradoException {
		return insumos.procurarInsumo(item);
	}

	public void alterarInsumo(Insumo insumo) throws InsumoNaoCadastradoException {
		insumos.alterarInsumo(insumo);
	}

	// FUNCIONARIO
	public void inserirFuncionario(Funcionario funcionario) throws FuncionarioJaCadastradoException, SalarioInvalidoException {
		funcionarios.inserirFuncionario(funcionario);
	}

	public void atualizarFuncionario(Funcionario funcionario) throws FuncionarioNaoEncontradoException {
		funcionarios.atualizarFuncionario(funcionario);
	}

	public void removerFuncionario(String nome) throws FuncionarioNaoEncontradoException {
		funcionarios.removerFuncionario(nome);
	}

	public Funcionario procurarFuncionario(String nome) throws FuncionarioNaoEncontradoException {
		return funcionarios.procurarFuncionario(nome);
	}

	// CULTIVO
	public void inserirCultivo(Cultivo cultivo) throws CultivoJaCadastradoException {
		cultivos.inserirCultivo(cultivo);
	}

	public void removerCultivo(Cultivo cultivo) throws CultivoJaCadastradoException {
		cultivos.removerCultivo(cultivo);
	}

	public Cultivo procurarCultivo(String produto) throws CultivoJaCadastradoException {
		return cultivos.procurarCultivo(produto);
	}

	public String alterarCultivo(Cultivo cultivo) throws CultivoJaCadastradoException {
		return cultivos.alterarCultivo(cultivo);
	}

}
