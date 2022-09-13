package Gado;

public class GadoReproducao extends Gado {
	public GadoReproducao(String brinco, char genero, String raca, boolean vacina, int anoNascimento) {
		super(brinco, genero, raca, vacina, anoNascimento);
		// TODO Auto-generated constructor stub
	}

	private String fertilidade;

	public String getFertilidade() {
		return this.fertilidade;
	}

	public void setFertilidade(String fertilidade) {
		this.fertilidade = fertilidade;
	}
}
