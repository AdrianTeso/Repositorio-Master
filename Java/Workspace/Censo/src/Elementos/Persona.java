/********************************************************************************
** @file Persona.java
**  
** @brief Esta clase almacena los datos de una persona.
*********************************************************************************
**
** @author AdrianTeso
** @date 11 de oct. de 2015
** @version 00_00
**
 ********************************************************************************/
package Elementos;

/**
 * @author Adrían
 *
 */
public class Persona {
	private String Nombre;
	private String Apellidos;
	private int Edad;
	
	public Persona()
	{
		
	}
	
	/**
	 * @param nombre El nombre de la persona.
	 * @param apellidos Los apellidos de la persona.
	 * @param edad La edad de la persona.
	 */
	public Persona(String nombre, String apellidos, int edad) {
		Nombre = nombre;
		Apellidos = apellidos;
		Edad = edad;
	}
	/**
	 * @return Devuelve el nombre de la Persona.
	 */
	public String getNombre() {
		return Nombre;
	}
	/**
	 * @param nombre Establece el nombre de la persona.
	 */
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	/**
	 * @return Devuelve los apellidos de la persona.
	 */
	public String getApellidos() {
		return Apellidos;
	}
	/**
	 * @param apellidos Establece los apellidos de la persona.
	 */
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	/**
	 * @return Devuelve la Edad de la persona.
	 */
	public int getEdad() {
		return Edad;
	}
	/**
	 * @param Edad Establece la Edad de la persona.
	 */
	public void setEdad(int edad) {
		Edad = edad;
	}
	
	

}
