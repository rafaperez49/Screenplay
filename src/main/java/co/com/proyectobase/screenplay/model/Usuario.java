package co.com.proyectobase.screenplay.model;

public class Usuario {
	
	private String tI;
	private String numeroIdentificacion;
	private String pais;
	private String nombre;
	private String correo;
	private String peticion;
	
	public String getTI() {
		return tI;
	}
	public void setTI(String TI) {
		tI = TI;
	}
	public String getNumeroIdentificacion() {
		return numeroIdentificacion;
	}
	public void setNumeroIdentificacion(String numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getPeticion() {
		return peticion;
	}
	public void setPeticion(String peticion) {
		this.peticion = peticion;
	}
	
	

}
