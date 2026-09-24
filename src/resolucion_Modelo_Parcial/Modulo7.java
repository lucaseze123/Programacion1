package resolucion_Modelo_Parcial;

public class Modulo7 {
	Laboratorio[] labos;

	public boolean pcGamaAlta() {
		for (int i = 0; i < labos.length; i++) {
			Laboratorio lab = labos[i];
			if (lab != null && lab.computadoras != null) {
				for (int j = 0; j < lab.computadoras.length; j++) {
					PC compu = lab.computadoras[j];
					if (compu != null && compu.tieneTodosLosComponentesDeGamaAlta()) {
						return true;
					}
				}
			}
		}
		return false;
	}

}
