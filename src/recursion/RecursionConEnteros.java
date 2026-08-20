package recursion;

public class RecursionConEnteros {

	public class Ejercicios {
		static int f(int n) {
			if (n == 1) {
				return 1;
			} else {
				return n + f(n - 1);
			}
		}

		static void imprimirHasta(int n) {
			if (n == 1) {
				System.out.println(1);
			} else {
				imprimirHasta(n - 1);
				System.out.println(n);
			}
		}

		static void imprimirDesde(int n) {
			if (n == 1) {
				System.out.println(1);
			} else {
				System.out.println(n);
				imprimirDesde(n - 1);
			}
		}

		public static int potencia(int base, int exp) {
			if (exp == 0) {
				return 1;
			} else {
				return base * potencia(base, exp - 1);
			}
		}

		public static int sumaEntre(int n, int m) {
			if (n > m) {
				return 0;
			} else if (n == m) {
				return n;
			} else {
				return m + sumaEntre(n, m - 1);
			}
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub

		}

	}
}
