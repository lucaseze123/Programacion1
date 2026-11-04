package modelo_2_Parcial;

import java.util.Arrays;

public class Laboratorio {
	@Override
	public String toString() {
		return "Laboratorio [numero=" + numero + ", capacidad=" + capacidad + ", computadoras="
				+ Arrays.toString(computadoras) + "]";
	}
	int numero;
	int capacidad;
	PC[] computadoras;
}
