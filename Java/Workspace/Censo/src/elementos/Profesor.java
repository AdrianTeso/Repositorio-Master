/********************************************************************************
** @file Profesor.java
**  
** @brief 
*********************************************************************************
**
** @author AdrianTeso
** @date 11 de oct. de 2015
** @version 00_00
**
 ********************************************************************************/
package elementos;

/**
 * @author Adrían
 *
 */
public class Profesor extends Persona{
	private BaseDeDatos bddAlumnos;
	
	public Profesor()
	{
		super();
		bddAlumnos = new BaseDeDatos();
	}

	/**
	 * @param nombre
	 * @param apellidos
	 * @param edad
	 */
	public Profesor(String nombre, String apellidos, int edad) {
		super(nombre, apellidos, edad);
		bddAlumnos = new BaseDeDatos();
	}
	
	public void asignarAlumno(Alumno alum) {
		
		bddAlumnos.insertarAlumno(alum);
	}
	
	public void asignarAlumno(String nombre, String apellidos, int edad, int curso) {
		
		bddAlumnos.insertarAlumno(nombre, apellidos, edad, curso);
	}
	
	public int contarAlumnos() {
		return bddAlumnos.contarAlumnos();
	}
	

}
