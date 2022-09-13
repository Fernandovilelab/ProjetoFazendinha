package Gado;

public class GadoCorte extends Gado {
	public GadoCorte(String brinco, char genero, String raca, boolean vacina, int anoNascimento) {
		super(brinco, genero, raca, vacina, anoNascimento);
	}

	private double peso;

	public double getPeso() {
		return this.peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

}
