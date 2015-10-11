/********************************************************************************
** @file BaseDeDatos.java
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

import java.util.Vector;

/**
 * @author Adrían
 *
 */
public class BaseDeDatos {
	
	private Vector<Alumno> alumnos;

	/**
	 * 
	 */
	public BaseDeDatos() {
		alumnos  = new Vector<Alumno>();
	}
	
	public void insertarAlumno(Alumno alum) {
		
		alumnos.add(alum);
	}
	
	public void insertarAlumno(String nombre, String apellidos, int edad, int curso) {
		
		Alumno al = new Alumno(nombre, apellidos, edad, curso);
		alumnos.add(al);
	}
	
	public int contarAlumnos()
	{
		return alumnos.size();
	}
	

}
