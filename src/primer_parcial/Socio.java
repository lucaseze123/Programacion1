package primer_parcial;

public class Socio {
	String nombre;
	String nroSocio; //10 caracteres
	boolean activo;
	Fecha fechaBaja;
	
	 public Socio(String nombre, String nroSocio, boolean activo, Fecha fechaBaja) {
	        this.nombre = nombre;
	        this.nroSocio = nroSocio;
	        this.activo = activo;
	        this.fechaBaja = fechaBaja;
	    }
}
