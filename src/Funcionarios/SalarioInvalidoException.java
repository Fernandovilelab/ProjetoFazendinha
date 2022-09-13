package Funcionarios;

public class SalarioInvalidoException extends Exception {
	public SalarioInvalidoException() {
		super("Salario só assume valores positivos");
	}

}
