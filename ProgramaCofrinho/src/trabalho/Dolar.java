package trabalho;

public class Dolar extends Moeda{

	public Dolar(double valorinicial) {
		this.valor = valorinicial;
	}
	
	@Override
	public void info() {
		System.out.println("Dolar - " + valor);
	}

	@Override
	public double converter() {
		return this.valor * 0.35;
	}

	@Override
	public boolean equals(Object objeto) {
		if(this.getClass() != objeto.getClass()) {
			return false;
		}
		
		Dolar ObjetoDolar = (Dolar) objeto;
		
		if(this.valor != ObjetoDolar.valor) {
			return false;
		}
		return true;
		}
}
