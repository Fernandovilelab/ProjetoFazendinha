package Funcionarios;

public class CadastroFuncionario {
	private RepositorioFuncionarios funcionarios;
	
	public int quantidadeFuncionarios = 0;

	public  CadastroFuncionario(RepositorioFuncionarios repositorioFuncionarios) {
		this.funcionarios = repositorioFuncionarios;
	}

	public void inserirFuncionario(Funcionario funcionario) throws FuncionarioJaCadastradoException, SalarioInvalidoException {
		if (this.funcionarios.existeFuncionario(funcionario.getNome())) {
			throw new FuncionarioJaCadastradoException();
		} else {
			if(funcionario.getSalario() <= 0) {
				throw new SalarioInvalidoException();
			}
			else {
				funcionarios.inserirFuncionario(funcionario);
				quantidadeFuncionarios++;
			}
		}
	}

	public void atualizarFuncionario(Funcionario funcionario) throws FuncionarioNaoEncontradoException {
		if (this.funcionarios.existeFuncionario(funcionario.getNome())) {
			funcionarios.atualizarFuncionario(funcionario);
		} else {
			throw new FuncionarioNaoEncontradoException();
		}
	}

	public void removerFuncionario(String nome) throws FuncionarioNaoEncontradoException {
		if (this.funcionarios.existeFuncionario(nome)) {
			funcionarios.removerFuncionario(nome);
			quantidadeFuncionarios--;
		} else {
			throw new FuncionarioNaoEncontradoException();
		}
	}

	public Funcionario procurarFuncionario(String nome) throws FuncionarioNaoEncontradoException {
		if (this.funcionarios.existeFuncionario(nome)) {
			return funcionarios.procurarFuncionario(nome);
		} else {
			throw new FuncionarioNaoEncontradoException();
		}

	}

}
