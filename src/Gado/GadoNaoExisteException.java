package Gado;

public class GadoNaoExisteException extends Exception {
	public GadoNaoExisteException() {
		super("Gado n�o encontrado!");
	}
}