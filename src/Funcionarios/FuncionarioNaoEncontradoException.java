package Funcionarios;

public class FuncionarioNaoEncontradoException extends Exception{

	public FuncionarioNaoEncontradoException() {
		super("Funcionario não existe");
	}
	
}