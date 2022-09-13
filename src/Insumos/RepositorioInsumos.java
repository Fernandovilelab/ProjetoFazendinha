package Insumos;

import Insumos.*;

public interface RepositorioInsumos {
	// Metodos a serem implementados em "InsumoLIsta" e "InsumoArray"
	void inserirInsumo(Insumo insumo); // Metodo para Inserir

	String removerInsumo(Insumo insumo); // Metodo para Remover e enviar uma mensagem sobre a executacao do comando

	String alterarInsumo(Insumo insumo); // Metodo para Alterar dados de insumoLista e InsumoArray

	boolean existeInsumo(String item); // Metodo Procurando A existencia de um Item da classe Insumo

	Insumo procurarInsumo(String item); // Metodo Procurando item

	//Insumo listarInsumo(); // Metodo para imprimir todos os Insumos de InsumoLista e InsumoArray
}
