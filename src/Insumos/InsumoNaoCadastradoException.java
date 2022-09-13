package Insumos;

public class InsumoNaoCadastradoException extends Exception {
	public InsumoNaoCadastradoException() {
		super("Insumo já cadasstrado");
	}

}