package trabalho;

public class Euro extends Moeda{
	
	public Euro(double valorinicial) {
		this.valor = valorinicial;
	}
	
	@Override
	public void info() {
		System.out.println("Euro - " + valor);
		
	}

	@Override
	public double converter() {
		return this.valor * 1.75;
	}
	
	@Override
	public boolean equals(Object objeto) {
		if(this.getClass() != objeto.getClass()) {
			return false;
		}
		
		
		Euro ObjetoEuro = (Euro) objeto;
		
		if(this.valor != ObjetoEuro.valor) {
			return false;
		}
		return true;
		}

}
