package Reutilizacion;

public class Alumno extends Persona{
	int codAlumno;
	String Curso;
	
	public Alumno(int c_alumno,String nombre, String apellido, String curso, String ciudad, int dni, int edad, int telefono) {
		super(nombre, apellido, ciudad, dni, edad, telefono);
		
		this.codAlumno = c_alumno;
		this.Curso = curso;
	}
	
	
	 public int getcodAlumno() {
		 return codAlumno;
	 }
	 public void SetcodAlumno (int c_alumno) {
		 this.codAlumno = c_alumno;
	 }
	 
	 public String getCurso() {
		 return Curso;	 
	 }
	 public void SetCurso ( String curso) {
		 this.Curso = curso;	 
	 }

}
