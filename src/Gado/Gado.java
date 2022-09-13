package Gado;

public abstract class Gado {

	private String brinco;
	private char genero;
	private String raca;
	private boolean vacina;
	private int anoNascimento;
public Gado(String brinco, char genero, String raca,boolean vacina,int anoNascimento) {
	this.brinco=brinco;
	this.genero=genero;
	this.raca=raca;
	this.vacina=vacina;
	this.anoNascimento= anoNascimento;
}
	public String getBrinco() {
		return this.brinco;
	}

	public void setBrinco(String brinco) {
		this.brinco = brinco;
	}

	public char getGenero() {
		return this.genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public String getRaca() {
		return this.raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public boolean getVacina() {
		return this.vacina;
	}

	public void setVacina(boolean vacina) {
		this.vacina = vacina;
	}

	public int getAnoNascimento() {
		return this.anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

}
