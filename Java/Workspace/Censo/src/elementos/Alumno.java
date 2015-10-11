/********************************************************************************
** @file Alumno.java
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
public class Alumno extends Persona {
	
	private int Curso;

	public Alumno() {
		super();
	}
	/**
	 * @param nombre	El nombre del alumno.
	 * @param apellidos	Los apellidos del alumno.
	 * @param edad 		La edad del alumno.
	 * @param curso 	El curso del alumno.
	 */
	public Alumno(String nombre, String apellidos, int edad, int curso) {
		super(nombre, apellidos, edad);
		Curso = curso;
	}

	/**
	 * @return Recoge el curso en el que se encuentra el alumno.
	 */
	public int getCurso() {
		return Curso;
	}

	/**
	 * @param curso Establece el curso del alumno.
	 */
	public void setCurso(int curso) {
		Curso = curso;
	}

}
