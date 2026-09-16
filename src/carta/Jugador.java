package carta;

public class Jugador {
	Carta[] mano;
	int proxPosLibre;
	
	//Constructor
	Jugador(){
		this.mano = new Carta[15];
		this.proxPosLibre = 0;
	}
	
	// cuando recibe una carta desde la banca
	// jugador.pedirCarta(objCarta);
	// banca.pedirCarta(objCarta);
	void pedirCarta (Carta cartaRecibida) {
		this.mano[this.proxPosLibre] = cartaRecibida;
		this.proxPosLibre++; //aumento a la próxima posición libre
	}
	
	// calcula los puntos de la mano
	// jugador.puntos();
	float puntos(){
		float suma = 0;
		
		for(int i=0; i<this.proxPosLibre; i++)
			if(this.mano[i].numero >= 1 && this.mano[i].numero <= 7)
				suma += this.mano[i].numero;
			else //la carta es 10, 11 o 12
				suma += 0.5;
		
		return suma;
	}
	
	// imprime por pantalla las cartas de la mano
	// jugador.imprimir();
	void imprimir() {
		for(int i=0; i<this.proxPosLibre; i++)
			this.mano[i].mostrar();		
	}
}