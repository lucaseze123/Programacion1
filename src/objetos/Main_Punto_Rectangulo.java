package objetos;

import java.awt.Point;
import java.awt.Rectangle;

public class Main_Punto_Rectangulo {

	public static void main(String[] args) {
		Rectangle cajaEjemplo = new Rectangle(0, 0, 100, 200);
		Point centro = Punto.calcularCentro(cajaEjemplo);
		//System.out.println("El centro del rectangulo es: " + centro);

		// Ejemplo grow alliasing
		// Rectangle caja1 = new Rectangle(0,0,100,200);
		// Rectangle caja2 = caja1;
		// System.out.println("El width antes de llamar a caja1 con grow:" +
		// caja2.width);
		// caja1.grow(50, 50);
		// System.out.println("El width despues de llamar a grow en caja 1: "+
		// caja2.width);

		// Ejemplo de distancia entre dos puntos
		Point p1 = new Point(0, 0);
		Point p2 = new Point(0, 100);
		Rectangle r2 = new Rectangle(-5000, 100, 1000, 2000);
		Rectangle r = new Rectangle(10, 50, 50, 40);
		//System.out.println("La distancia es:" + Punto.distancia(p1, p2));
		//System.out.println("La diagonal es:" + Punto.diagonal(r));
		// System.out.println("La distancia entre los puntos p1 y p2 es: " +
		// Punto.distancia(p1, p2));
		// System.out.println("El punto medio entre los puntos p1 y p2 es: "+
		// Punto.puntoMedio(p1, p2));
		System.out.println(Punto.estaContenido(r, r2));
	}

}
