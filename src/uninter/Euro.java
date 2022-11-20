package uninter;

public class Euro extends Moeda{

	public Euro(double valor) {
		this.valor = valor;
	}
	
	@Override
	public void info() {
		System.out.println("Euro - " + valor);
	}

	@Override
	public double converter() {
		return this.valor * 5.57; //data cotaçao 18/11/22
	}
	
	@Override
	public boolean equals(Object object) {
		if(this.getClass() != object.getClass()) {
			return false;
		}
		
		Euro objectEuro = (Euro) object;
		
		if(this.valor != objectEuro.valor) {
			return false;
			
		}
		
		return true;
		
	}
}
