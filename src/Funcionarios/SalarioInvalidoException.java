package Funcionarios;

public class SalarioInvalidoException extends Exception {
	public SalarioInvalidoException() {
		super("Salario s� assume valores positivos");
	}

}
