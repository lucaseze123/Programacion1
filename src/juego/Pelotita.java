package juego;

import java.awt.Color;

import entorno.Entorno;

public class Pelotita {
	private double x;
	private double y;
	private double radio;
	private double velocidad;
	
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getRadio() {
		return radio;
	}

	public double getVelocidad() {
		return velocidad;
	}

	public Pelotita(double x, double y, double radio, double velocidad) {
		this.x = x;
		this.y = y;
		this.radio = radio;
		this.velocidad = velocidad;
	}
	public void dibujar(Entorno entorno) {
		entorno.dibujarCirculo(x, y, radio, Color.RED);
	}
	
	public void caer () {
		y+=this.velocidad;
	}
	public void rebotar() {
		this.velocidad = this.velocidad * (-1);

	}

}
