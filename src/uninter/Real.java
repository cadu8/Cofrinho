package uninter;

public class Real extends Moeda{
	
	public Real(double valor) {
		this.valor = valor;
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
	public boolean equals(Object object) {
		if(this.getClass() != object.getClass()) {
			return false;
		}
		
		Real objectReal = (Real) object;
		
		if(this.valor != objectReal.valor) {
			return false;
			
		}
		
		return true;
		
	}

}
