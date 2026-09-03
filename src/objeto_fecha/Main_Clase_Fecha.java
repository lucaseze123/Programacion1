package objeto_fecha;

public class Main_Clase_Fecha {

	public static void main(String[] args) {
		Fecha f = new Fecha(30, 11, 2000);
		f.imprimir();
		f.avanzarDia();
		f.imprimir();
		//System.out.println(Fecha.diasDelMes(2, 20010));
		//System.out.println(f.esValida());
	}

}
