package Cultivo;

public class CultivoNaoExisteException extends Exception{
	public CultivoNaoExisteException() {
		super("Cultivo n�o existe");
	}
}
