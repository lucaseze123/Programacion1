package modelo_2_Parcial;

import java.util.Arrays;

public class PC {
	@Override
	public String toString() {
		return "PC [serial=" + serial + ", modelo=" + modelo + ", OS=" + OS + ", componentes="
				+ Arrays.toString(componentes) + "]";
	}
	String serial;
	String modelo;
	String OS;
	Componente[] componentes;
}
