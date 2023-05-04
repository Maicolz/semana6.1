package Reutilizacion;

public class Persona {
	private	String Nombres;
	private	String Apellidos;
	private	String Ciudad;
	private	int Dni, Edad, Telefono;
	
	public Persona(String nombre, String apellido, String ciudad, int dni, int edad, int telefono) {
		this.Nombres = nombre;
		this.Apellidos = apellido;
		this.Ciudad = ciudad;
		this.Dni = dni;
		this.Edad = edad;
		this.Telefono = telefono;
	}
	 
	 public String getNombres() {
		 return Nombres;	 
	 }
	 public void SetNombres ( String nombre) {
		 this.Nombres = nombre;	 
	 }
	 
	 public String getApellidos() {
		 return Apellidos;
	 }
	 public void SetApellidos (String apellido) {
		 this.Apellidos = apellido;
	 }
	 
	 public String getCiudad() {
		 return Ciudad;
	 }
	 public void SetCiudad (String ciudad) {
		 this.Ciudad = ciudad;
	 }
	 
	 public int getEdad() {
		 return Edad;
	 }
	 public void SetEdad (int edad) {
		 this.Edad = edad;
	 }
	 
	 public int getDni() {
		 return Dni;
	 }
	 public void SetDni (int dni) {
		 this.Dni = dni;
	 }
	 
	 public int getTelefono() {
		 return Telefono;
	 }
	 public void SetTelefono (int telefono) {
		 this.Telefono = telefono;
	 }
	

}
