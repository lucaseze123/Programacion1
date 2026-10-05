package primer_parcial;

public class Biblioteca {
	 Libro[] libros;
	
	  public Biblioteca(Libro[] libros) {
	        this.libros = libros;
	    }
	
	 public  int cantPrestamos(Socio unSocio) {
		 int cont=0;
		 for (int i = 0; i < libros.length; i++) {
			if(libros[i].prestadoA!=null) {
				for (int j = 0; j < libros[i].prestadoA.length; j++) {
					if(libros[i].prestadoA[j]==unSocio) {
						cont++;

					}
				}
				
			}
			
				}
		 return cont;
	 }
}
