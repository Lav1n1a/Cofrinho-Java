package uninter;

import java.util.Objects;

public class Dolar extends Moeda {
	
	double valor;

	public Dolar(double valor) {
		super();
		this.valor = valor;
	}
	@Override
	void info() {
		System.out.println("Dolar - " + valor);
	}
	@Override
	double converter() {
		return this.valor * 5.3;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(valor);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dolar other = (Dolar) obj;
		return Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}
	

}
