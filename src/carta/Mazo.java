package carta;

import java.util.Random;

public class Mazo {
	//variable de instancia
	Carta[] cartas;
	int posPrimCarta;

	Mazo() {
		this.cartas = new Carta[40];
		int t = 0;
		for (int p = 1; p <= 4; p++) {
			for (int n = 1; n <= 7; n++) {
				this.cartas[t]=new Carta(p,n);
				t++;
			}
			for (int n = 10; n <= 12; n++) {
				this.cartas[t]=new Carta(p,n);
				t++;
			}
		}
		this.posPrimCarta = 0;
	}

	
	void mostrar() {
		for (int i = this.posPrimCarta; i < this.cartas.length; i++) {
			this.cartas[i].mostrar();
		}
	}
	
	void mezclar() {
		//mezclar mazo
		Random r = new Random();
		for (int i = this.posPrimCarta; i < this.cartas.length; i++) {
			int p = r.nextInt(this.cartas.length-this.posPrimCarta)+this.posPrimCarta;
			Carta c = this.cartas[i];
			this.cartas[i] = this.cartas[p];
			this.cartas[p] = c;
		}				
	}
	
	Carta repartir() {
		Carta c = this.cartas[this.posPrimCarta];
		this.cartas[this.posPrimCarta] = null;
		this.posPrimCarta++;
		return c;
	}
	
	
	
}
