package Gado;

public interface RepositorioGados {
	public void inserirGado(Gado gado);
	public void removerGado(String brinco) ;
	public Gado procurarGado(String brinco) ;
	public void atualizarGado(Gado gado) ;
	public boolean existeGado(String brinco) ;
	
}
