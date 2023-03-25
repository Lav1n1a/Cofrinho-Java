package uninter;

import java.util.Objects;

public class Euro extends Moeda{
	
	double valor;

	public Euro(double valor) {
		super();
		this.valor = valor;
	}

	@Override
	void info() {
		System.out.println("Euro - " + valor);
	}

	@Override
	double converter() {
		return this.valor * 5.7;
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
		Euro other = (Euro) obj;
		return Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}
	
	

}
