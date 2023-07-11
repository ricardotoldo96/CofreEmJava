package trabalho;

public class Real extends Moeda{

	public Real(double valorinicial) {
		this.valor = valorinicial;
	}
	
	
	
	@Override
	public void info() {
		System.out.println("Real - " + valor);
		
	}

	@Override
	public double converter() {
		return this.valor;
	}

	@Override
	public boolean equals(Object objeto) {
		if(this.getClass() != objeto.getClass()) {
			return false;
		}
		
		Real ObjetoReal = (Real) objeto;
		
		if(this.valor != ObjetoReal.valor) {
			return false;
		}
		return true;
		}
		
	}
	
	
