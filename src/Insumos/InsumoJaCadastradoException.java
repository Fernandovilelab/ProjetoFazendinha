package Insumos;

public class InsumoJaCadastradoException extends Exception {
	public InsumoJaCadastradoException() {
		super("Esse insumo já está cadastrado");
	}
}