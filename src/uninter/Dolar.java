package uninter;

public class Dolar extends Moeda{

	public Dolar(double valor) {
		this.valor = valor;
	}
	
	@Override
	public void info() {
		System.out.println("Dolar - " + valor);
	}

	@Override
	public double converter() {
		return this.valor * 5.38; //data cotaçao 18/11/22
	}
	
	@Override
	public boolean equals(Object object) {
		if(this.getClass() != object.getClass()) {
			return false;
		}
		
		Dolar objectDolar = (Dolar) object;
		
		if(this.valor != objectDolar.valor) {
			return false;
			
		}
		
		return true;
		
	}

}
