package juego;

import java.awt.Color;

import entorno.Entorno;

public class Barra {
	private double x;
	private double y;
	private double alto;
	private double ancho;
	private double velocidad;

	public Barra(double x, double y, double alto, double ancho, double velocidad) {
		super();
		this.x = x;
		this.y = y;
		this.alto = alto;
		this.ancho = ancho;
		this.velocidad = velocidad;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getAlto() {
		return alto;
	}

	public double getAncho() {
		return ancho;
	}

	public double getVelocidad() {
		return velocidad;
	}
	public void dibujar(Entorno entorno) {
		entorno.dibujarRectangulo(x, y, ancho, alto, 0, Color.BLUE);
	}
	public void moverDerecha() {
		x+=this.velocidad;
	}
	public void moverIzquierda() {
		x-=this.velocidad;
	}
}
