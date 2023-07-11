package trabalho;

import java.util.ArrayList;

public class Cofre {

	private ArrayList<Moeda>ListaMoedas;
	
	public Cofre() {
		this.ListaMoedas = new ArrayList<>();
		
	}
	
	public void add(Moeda moeda) {
		this.ListaMoedas.add(moeda);
	}
	
	public boolean Remover(Moeda moeda) {
		return this.ListaMoedas.remove(moeda);
	}
	
	public void ListagemMoedas() {
		
		if (this.ListaMoedas.isEmpty()) {
			System.out.println("Não Existe Nenhuma Moeda no seu cofre.");
			return;
		}
		
		
		for (Moeda moeda: this.ListaMoedas) {
			moeda.info();
		}
	}

	public double TotalConvertido() {
		if(this.ListaMoedas.isEmpty()) {
			return 0;
		}
		
		double acumulo =0;
		
		for (Moeda moeda: this.ListaMoedas) {
			acumulo = acumulo + moeda.converter();
		}
		return acumulo;
	}
}
