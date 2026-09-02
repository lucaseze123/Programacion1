package objetos;

import java.awt.Point;
import java.awt.Rectangle;
import java.math.*;

public class Punto {

	static Point calcularCentro(Rectangle caja) {
		int x = caja.x + caja.width / 2;
		int y = caja.y + caja.height / 2;
		Point p = new Point(x, y);
		return p;
	}

	public static double distancia(Point p1, Point p2) {
		int dx = p1.x - p2.x;
		int dy = p1.y - p2.y;
		return Math.sqrt(dx * dx + dy * dy);
	}

	public static double diagonal(Rectangle r) {
		Point a = new Point(r.x, r.y);
		Point b = new Point(r.x + r.width, r.y + r.height);
		return distancia(a, b);
	}

	public static boolean estaDentro(Point p, Rectangle r) {
		boolean estaEnX = p.x >= r.x && p.x <= r.x + r.width;
		boolean estaEnY = p.y >= r.y && p.y <= r.y + r.height;
		return estaEnX && estaEnY;
	}

	public static Point puntoMedio(Point p1, Point p2) {
		int promX = (p1.x + p2.x) / 2;
		int promY = (p1.y + p2.y) / 2;
		Point p = new Point(promX, promY);
		return p;
	}
public static boolean puntoEsMasChico(Point p1,Point p2) {
	int minX=Math.min(p1.x, p2.x);
	int minY=Math.min(p1.y, p2.y);
	Point pMin=new Point(minX, minY);
	return p1.equals(pMin);
}
	
	public static boolean estaContenido(Rectangle r1, Rectangle r2) {
		 Point r2xy= new Point(r2.x,r2.y);
		 Point r1xy= new Point(r1.x,r1.y);
		 Point r2A= new Point(r2.x + r2.width , r2.y + r2.height);
		 Point r1A= new Point(r1.x + r1.width , r1.y + r1.height);
		return puntoEsMasChico(r2xy, r1xy) && puntoEsMasChico(r1A, r2A);
	 }
}
