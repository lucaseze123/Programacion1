package listas_modelo_parcial;

public class Lista_int {
	Nodo_int primero;

	public void imprimir() {
		System.out.print("[");
		Nodo_int actual = this.primero;
		while (actual != null) {
			System.out.print(actual.elemento + " ");
			actual = actual.siguiente;
		}
		System.out.println("]");
	}

	public void descomponerPares() {
		if (this.primero == null)
			return;

		Nodo_int actual = this.primero;
		Nodo_int nuevo;

		while (actual != null) {
			if (actual.elemento % 2 == 0) {
				int valor=actual.elemento;
				actual.elemento =  valor / 2;
				nuevo = new Nodo_int();
				nuevo.elemento = valor * 2;
				nuevo.siguiente = actual.siguiente;
				actual.siguiente = nuevo;
				actual = actual.siguiente.siguiente;
			} else
				actual = actual.siguiente;
		}
	}

	public void filtrarElementosEnRango(int k, int m) {
		if (this.primero == null || k > m)
			return;
		
		while(this.primero != null && (primero.elemento <= k || primero.elemento >= m)) {
			this.primero = this.primero.siguiente;
		}
		
		Nodo_int actual = this.primero;
		
		while (actual != null && actual.siguiente != null) {
			if (actual.siguiente.elemento <= k || actual.siguiente.elemento >= m) {
				actual.siguiente = actual.siguiente.siguiente;
			} else {
				actual = actual.siguiente;
			}
		}

	}
	
	public void agregarLargoMesetas() {
		if(this.primero == null)
			return;
		Nodo_int actual = this.primero;
		int cont = 1;
		Nodo_int nuevo ;
		while(actual != null) {
			if(actual.siguiente == null || actual.elemento != actual.siguiente.elemento) {
				nuevo = new Nodo_int();
				nuevo.elemento=cont;
				nuevo.siguiente = actual.siguiente;
				actual.siguiente = nuevo;
				actual = actual.siguiente.siguiente;
				cont = 1;
			}
			else {
				actual = actual.siguiente;
				cont++;
			}
			
		}
		}
	
	public static void main(String[] args) {
		Lista_int lista = new Lista_int();
		Nodo_int nodo1 = new Nodo_int();
		Nodo_int nodo2 = new Nodo_int();
		Nodo_int nodo3 = new Nodo_int();
		Nodo_int nodo4 = new Nodo_int();
		Nodo_int nodo5 = new Nodo_int();
		Nodo_int nodo6 = new Nodo_int();
		lista.primero = nodo1;
		nodo1.elemento = 1;
		nodo1.siguiente = nodo2;
		nodo2.elemento = 2;
		nodo2.siguiente = nodo3;
		nodo3.elemento = 3;
		nodo3.siguiente = nodo4;
		nodo4.elemento = 4;
		nodo4.siguiente = nodo5;
		nodo5.elemento = 5;
		nodo5.siguiente = nodo6;
		nodo6.elemento = 6;
		nodo6.siguiente = null;
		
		lista.imprimir();
		//lista.descomponerPares();
		lista.agregarLargoMesetas();
		lista.imprimir();
		

	}

}
