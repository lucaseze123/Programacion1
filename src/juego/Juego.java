package juego;

import java.awt.Color;

import entorno.Entorno;
import entorno.InterfaceJuego;

public class Juego extends InterfaceJuego {
	// El objeto Entorno que controla el tiempo y otros
	private Entorno entorno;
	private Pelotita[] pelota;
	private Pelotita pelotita;
	private Barra barra;
	boolean bandera = true;
	// Variables y métodos propios de cada grupo
	// ...

	Juego() {
		// Inicializa el objeto entorno
		this.entorno = new Entorno(this, "Proyecto para TP", 800, 600);
		this.pelota = new Pelotita[4];
		this.pelota[0] = new Pelotita(300, 100, 15, 2);
		this.pelota[1] = new Pelotita(220, 100, 15, 2);
		this.pelota[2] = new Pelotita(200, 100, 15, 2);
		this.pelota[3] = new Pelotita(170, 100, 15, 2);
		this.pelotita = new Pelotita(600, 100, 15, 2);
		this.barra = new Barra(400, 500, 25, 100, 2);
		// Inicializar lo que haga falta para el juego
		// ...

		// Inicia el juego!
		this.entorno.iniciar();
	}

	/**
	 * Durante el juego, el método tick() será ejecutado en cada instante y por lo
	 * tanto es el método más importante de esta clase. Aquí se debe actualizar el
	 * estado interno del juego para simular el paso del tiempo (ver el enunciado
	 * del TP para mayor detalle).
	 */
	public void tick() {

		if (this.pelota != null) {
			for (int i = 0; i < pelota.length; i++) {
				this.pelota[i].dibujar(entorno);
				if (bandera)
					this.pelota[i].caer();
			}
		}
		this.pelotita.dibujar(entorno);
		this.pelotita.caer();
		this.barra.dibujar(entorno);
		if (this.entorno.estaPresionada(entorno.TECLA_DERECHA)
				&& (this.barra.getX() + this.barra.getAncho() / 2) < 800) {
			this.barra.moverDerecha();
		}
		if (this.entorno.estaPresionada(entorno.TECLA_IZQUIERDA)
				&& (this.barra.getX() - this.barra.getAncho() / 2) > 0) {
			this.barra.moverIzquierda();
		}
		if (pelotita.getY() + pelotita.getRadio() > this.barra.getY() - this.barra.getAlto() / 2) {
			this.pelotita.rebotar();

		}
		// Procesamiento de un instante de tiempo
		// ...

	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Juego juego = new Juego();
	}
}
