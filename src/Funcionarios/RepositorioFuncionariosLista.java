package Funcionarios;

public class RepositorioFuncionariosLista implements RepositorioFuncionarios {
	private Funcionario funcionario = new Funcionario();
	private RepositorioFuncionariosLista proximo;
	
	public RepositorioFuncionariosLista() {
		this.funcionario = null;
		this.proximo = null;
	}
	
	@Override
	public void inserirFuncionario(Funcionario funcionario) {

		if (this.proximo == null) {
			this.funcionario = funcionario;
			this.proximo = new RepositorioFuncionariosLista();
		} 
		else {
			this.proximo.inserirFuncionario(funcionario);
		}

	}

	@Override
	public void atualizarFuncionario(Funcionario funcionario) {
		
		if(this.funcionario.getNome().equals(funcionario.getNome())) {
			this.funcionario = funcionario;
		}
		else {
			this.proximo.atualizarFuncionario(funcionario);
		}
		
	}
	
	@Override
	public void removerFuncionario(String nome) {

		if(existeFuncionario(nome)) {
			if (this.funcionario.getNome().equals(nome)) {
				this.funcionario = this.proximo.funcionario;
				this.proximo = this.proximo.proximo;
			} 
			else {
				this.proximo.removerFuncionario(nome);
			}
		}

	}
	
	
	@Override
	public boolean existeFuncionario(String nome) {

		if (this.proximo != null && this.funcionario.getNome().equals(nome)) {
			return true;
		} 
		else if (this.proximo != null) {
			return this.proximo.existeFuncionario(nome);
		} 
		else {
			return false;
		}

	}


	@Override
	public Funcionario procurarFuncionario(String nome) {
		Funcionario resposta = null;
		
		if(existeFuncionario(nome)) {
			if(this.funcionario != null && this.funcionario.getNome().equals(nome)) {
				resposta = funcionario;
			}
			else {
				resposta = this.proximo.procurarFuncionario(nome);
			}
		}
		
		return resposta;
	}	
	
}
