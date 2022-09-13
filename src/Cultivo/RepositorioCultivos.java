package Cultivo;
import Cultivo.*;

public interface RepositorioCultivos {
	public void inserirCultivo (Cultivo cultivo);
	public void removerCultivo (Cultivo cultivo);
	public String alterarCultivo (Cultivo cultivo);
	public boolean existeCultivo (String produto);
	public Cultivo procurarCultivo (String produto);
}
