package complejidad;

public class Complejidad {

	public static int calculo(int[] a) {
		int res = 0;
		for (int i = 0; i < a.length; i++) {
			int x = 0;
			for (int j = 0; j < a.length; j++) {
				int y = 0;
				for (int k = 0; k < 100; k++) {
					y++;
				}
				x += a[j] * y;
			}
			res += x;
		}
		return res;
	}

	public static int calculo2(int[] a) {
		int res = 0;
		
		// Lo movimos por fuera para calcularlo una sola vez
		int x = 0;
		for (int j = 0; j < a.length; j++) {
			int y = 100;
			/* y = 100
			for (int k = 0; k < 100; k++) {
				y++;
			}*/
			x = x + a[j] * y;
		}
		
		/* x * a.length
		for (int i = 0; i < a.length; i++) {
			res = res + x; // x * a.length
		} */
		
		res = x*a.length;
		
		return res;
	}

	public static void main(String[] args) {
		int[] ejemplo = {1,2,3,4,5};
		System.out.println(calculo(ejemplo));
		System.out.println(calculo2(ejemplo));

	}

}
