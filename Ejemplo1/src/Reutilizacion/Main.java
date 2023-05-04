package Reutilizacion;

public class Main {

	public static void main(String[] args) {
		
		Alumno Alum1 = new Alumno(19306229, "Dania", "Salvatierra", "Programación", "Lima", 72949078, 20, 951469411);
		
		System.out.println("\n\tDatos Alumnos");
		System.out.println("\t-----------------------");
		System.out.println("\tCodigo :" + Alum1.codAlumno + "\n"+
				"\tCurso :" + Alum1.Curso + "\n"+
				"\tNombre :" + Alum1.getNombres() + "\n"+
				"\tApellido : " + Alum1.getApellidos() + "\n"+
				"\tCiudad : " + Alum1.getCiudad() + "\n" +
				"\tDni : " + Alum1.getDni() + "\n"+
				"\tEdad : " + Alum1.getEdad() + "\n"+
				"\tTeléfono : " + Alum1.getTelefono());
		System.out.println("\t----------------------- ");
	}

}
