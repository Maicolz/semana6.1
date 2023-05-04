package Reutilizacion;

public class Docente extends Persona{
	int codDocente;
	String Especialidad;
	
	public Docente(int c_docente,String nombre, String apellido, String especialidad, String ciudad, int dni, int edad, int telefono) {
		super(nombre, apellido, ciudad, dni, edad, telefono);
		
		this.codDocente = c_docente;
		this.Especialidad = especialidad;
	}
	
	 public int getcodDocente() {
		 return codDocente;
	 }
	 public void SetcodDocente (int c_docente) {
		 this.codDocente = c_docente;
	 }
	 
	 public String getEspecialidad() {
		 return Especialidad;	 
	 } 
	 public void SetEspecialidad ( String especialidad) {
		 this.Especialidad = especialidad;	 
	 }
}
