package objeto_fecha;

public class Fecha {
	int dia;
	int mes;
	int anio;

	public Fecha(int dia, int mes, int anio) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}

	public boolean esVerano() {
		if (this.mes == 1 || this.mes == 2) {
			return true;
		}
		if (this.mes == 12 && this.dia > 20 && this.dia < 32) {
			return true;
		}
		if (this.mes == 3 && this.dia < 22) {
			return true;
		}
		return false;
	}

	static boolean bisiesto(int anio) {
		if (anio % 4 == 0 && anio % 100 != 0)
			return true;
		else if (anio % 400 == 0)
			return true;
		else
			return false;
	}

	public static int diasDelMes(int mes, int anio) {
		if (mes == 2) {
			if (bisiesto(anio)) {
				return 29;
			}
			return 28;

		} else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			return 30;

		}
		return 31;
	}

	public boolean esValida() {
		if (this.mes == 2) {
			if (bisiesto(anio)) {
				if (this.dia > 0 && this.dia < 30) {
					return true;
				}
				if (this.dia > 0 && this.dia < 29) {
					return true;
				}
			}
		} else if ((this.dia > 0 && this.dia < diasDelMes(mes, anio)) && (this.mes > 0 && this.mes < 13)) {
			return true;
		}
		return false;
	}

	public void avanzarDia() {
		boolean ultimoDiaDelMes = this.dia == diasDelMes(this.mes, this.anio);
		if (ultimoDiaDelMes && this.mes != 12) {
			this.dia = 1;
			this.mes += 1;
		} else if (this.mes == 12 && ultimoDiaDelMes) {
			this.anio += 1;
			this.mes = 1;
			this.dia = 1;
		} else
			this.dia += 1;
	}


	public void imprimir() {
		System.out.println(this.dia+"/"+this.mes+"/"+this.anio);
	}

}
