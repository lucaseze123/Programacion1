package primer_parcial;

public class Libro {
	String titulo;
	String autor;
	String sucursal; // indica en que sucursal se encuentra este libro
	String estante; // c ́odigo de 8 caracteres
	int[] numerosInventario; // cada uno es un c ́odigo de 5 cifras
	Socio[] prestadoA;

	public Libro(String titulo, String autor, String sucursal, String estante, int[] numerosInventario,
			Socio[] prestadoA) {
		this.titulo = titulo;
		this.autor = autor;
		this.sucursal = sucursal;
		this.estante = estante;
		this.numerosInventario = numerosInventario;
		this.prestadoA = prestadoA;
	}

	public boolean registrarPrestamo(Socio unSocio) {
		if (this.prestadoA == null) {
			return false;
		}
		for (int i = 0; i < prestadoA.length; i++) {
			if (prestadoA[i] == null) {
				prestadoA[i] = unSocio;
				return true;
			}
		}
		return false;
	}
}
