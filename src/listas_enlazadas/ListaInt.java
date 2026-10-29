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
		if (this.primero == null) {
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

	public int iesimo(int i) {
		int posicion = 0;
		int cont = 0;
		if (cont == i) {
			posicion = this.primero.elemento;
		} else {
			posicion = -1;
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

	void agregarAtras(int x) {

		NodoInt nuevo = new NodoInt();
		nuevo.elemento = x;
		if (this.primero == null)
			this.primero = nuevo;
		else {
			NodoInt n = this.primero;
			while (n.siguiente != null)
				n = n.siguiente;
			n.siguiente = nuevo;
		}
	}

	public void quitar(int elem) {
		if (this.primero == null) {
			return;
		}
		if (this.primero.elemento == elem) {
			this.primero = this.primero.siguiente;
		} else {
			NodoInt actual = this.primero;

			while (actual.siguiente != null && actual.siguiente.elemento != elem) {
				actual = actual.siguiente;
			}

			if (actual.siguiente != null && actual.siguiente.elemento == elem) {
				actual.siguiente = actual.siguiente.siguiente;
			}
		}
	}

	void quitarTodos(int elem) {
		if (this.primero == null) {
			return;
		}
		while (this.primero.elemento == elem) {
			this.primero = this.primero.siguiente;
		}
		NodoInt actual = this.primero;

		while (actual.siguiente != null && actual.siguiente.elemento != elem) {
			actual = actual.siguiente;
		}

		while (actual.siguiente != null && actual.siguiente.elemento == elem) {
			actual.siguiente = actual.siguiente.siguiente;
		}

	}

	void recortarDesde(int k) {
		int cont = 0;
		if (cont == k) {
			this.primero = null;
		}
		NodoInt actual = this.primero;
		while (actual != null) {
			cont++;
			if (cont == k) {
				actual.siguiente = null;
			}
			actual = actual.siguiente;
		}

	}

	void recortarHasta(int k) {
		if (k <= 0) {
			return;
		}
		int cont = 1;
		NodoInt actual = this.primero;
		while (actual != null && cont < k) {
			actual = actual.siguiente;
			cont++;
		}
		this.primero = actual.siguiente;
	}

	ListaInt sublista(int desde, int hasta) {
		NodoInt actual = this.primero;
		int cont = 0;
		ListaInt nuevaLista = new ListaInt();
		while (actual != null && desde > cont) {
			actual = actual.siguiente;
			cont++;
		}
		while (actual != null && cont <= hasta) {
			nuevaLista.agregarAtras(actual.elemento);
			actual = actual.siguiente;
			cont++;
		}

		return nuevaLista;
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
		nodo1.elemento = 2;
		nodo2.elemento = 2;
		nodo2.siguiente = nodo3;
		nodo3.elemento = 8;
		nodo3.siguiente = nodo4;
		nodo4.elemento = 2;
		nodo4.siguiente = nodo5;
		nodo5.elemento = 10;
		nodo5.siguiente = nodo6;
		nodo6.elemento = 17;
		nodo6.siguiente = null;
		lista.imprimir();
		// lista.recortarHasta(3);
		lista.quitar(2);
		// ListaInt nueva = new ListaInt();
		// nueva=lista.sublista(0, 4);
		// nueva.imprimir();
		// lista.recortarHasta(4);
		lista.imprimir();
	}

}
