package carta;

public class Carta {
	/* irep
	 * (numero>=1 and numero<=7) or (numero>=10 and numero<=12)
	 * and
	 * (palo>=1 && palo<=4)
	 * */
	
	int palo; // 1 = espada, 2 = copa, 3 = basto, 4= oro
	int numero;
	
	Carta(int p, int n){
		this.numero=n;
		this.palo=p;
	}
	
	void mostrar() {
		String[] palos = {"espada", "copa", "basto", "oro"};
		System.out.println(this.numero + " " + palos[this.palo-1]);
	}
	
	boolean CartaEsValida() {
		boolean numVal = (this.numero>=1 && this.numero<=7) || (this.numero>=10 && this.numero<=12);
		boolean paloVal = this.palo>=1 && this.palo<=4;
		return numVal && paloVal;
	}
	
}
