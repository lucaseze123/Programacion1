package resolucion_Modelo_Parcial;

public class PC {
	String serial;
	String modelo;
	String OS;
	Componente[] componentes;
	
	public boolean tieneTodosLosComponentesDeGamaAlta() {
		for (int i = 0; i < componentes.length; i++) {
			if(componentes[i].marca.calidad >= 4) {
				return true;
			}
		}
		return false;
	}

}
