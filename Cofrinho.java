package uninter;

import java.util.ArrayList;
import java.util.Objects;

public class Cofrinho {
	ArrayList<Moeda> ListaMoedas = new ArrayList<Moeda>();
	

	public void adicionar(Moeda moeda) {
		ListaMoedas.add(moeda);
	}
	
	public void remover(Moeda moeda) {
		ListaMoedas.remove(moeda);
	}
	
	public void listar() {
		
		for(Moeda moeda : ListaMoedas) {
			moeda.info();
		}
	}
	
	public double converter() {
		double valorTotal = 0;
		
		for(Moeda moeda : this.ListaMoedas) {
			valorTotal = valorTotal + moeda.converter();
		}
		return valorTotal;
		
	}
	
	
}
