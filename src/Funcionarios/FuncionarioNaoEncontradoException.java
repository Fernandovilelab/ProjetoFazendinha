package Funcionarios;

public class FuncionarioNaoEncontradoException extends Exception{

	public FuncionarioNaoEncontradoException() {
		super("Funcionario n�o existe");
	}
	
}