package listas_enlazadas;

public class ListaInt {
	NodoInt primero;

	public void imprimir() {
		System.out.print("[");
		NodoInt actual = this.primero;
		while (actual != null) {
			System.out.print(actual.elemento + " ");
			actual = actual.siguiente;
		}
		System.out.println("]");
	}

	public int maximo() {
		if(this.primero==null) {
			return 0;
		}
		int max = this.primero.elemento;
		NodoInt actual = this.primero;
		while (actual != null) {
			if (max < actual.elemento) {
				max = actual.elemento;
			}
			actual = actual.siguiente;
		}
		return max;
	}

	public boolean pertenece(int e) {
		if (primero != null) {
			if (primero.elemento == e) {
				return true;
			}
		}
		NodoInt actual = primero;
		while (actual != null) {
			if (actual.elemento == e) {
				return true;
			}
			actual = actual.siguiente;
		}
		return false;
	}

	public void quitar(int elem) {
		if (this.primero == null) {
			return;
		}
		if (this.primero.elemento == elem) {
			this.primero = this.primero.siguiente;
		}

		NodoInt actual = this.primero;

		while (actual.siguiente != null && actual.siguiente.elemento != elem) {
			actual = actual.siguiente;
		}

		if (actual.siguiente != null && actual.siguiente.elemento == elem) {
			actual.siguiente = actual.siguiente.siguiente;
		}
	}

	public int iesimo(int i) {
		int posicion = 0;
		int cont = 0;
		if (cont == i) {
			posicion = this.primero.elemento;
		}
		else {
			posicion=-1;
		}
		NodoInt actual = this.primero;
		while (actual != null) {
			cont++;
			actual = actual.siguiente;
			if (cont == i) {
				posicion = actual.elemento;
			}
		}

		return posicion;
	}

	public void quitarPorIndice(int i) {
		int cont = 0;
		if (cont == i) {
			this.primero = this.primero.siguiente;
		}
		NodoInt actual = this.primero;
		while (actual != null) {
			cont++;
			if (cont == i) {
				actual.siguiente = actual.siguiente.siguiente;
			}
			actual = actual.siguiente;
		}

	}

	public static void main(String[] args) {
		ListaInt lista = new ListaInt();
		NodoInt nodo1 = new NodoInt();
		NodoInt nodo2 = new NodoInt();
		NodoInt nodo3 = new NodoInt();
		NodoInt nodo4 = new NodoInt();
		NodoInt nodo5 = new NodoInt();
		NodoInt nodo6 = new NodoInt();
		lista.primero = nodo1;
		lista.primero.siguiente = nodo2;
		nodo1.elemento = 7;
		nodo2.elemento = 77;
		nodo2.siguiente = nodo3;
		nodo3.elemento = 8;
		nodo3.siguiente = nodo4;
		nodo4.elemento = 9;
		nodo4.siguiente = nodo5;
		nodo5.elemento = 10;
		nodo5.siguiente = nodo6;
		nodo6.elemento = 27;
		nodo6.siguiente = null;
		lista.imprimir();
		lista.quitarPorIndice(5);
		lista.imprimir();
	}

}
