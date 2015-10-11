/********************************************************************************
** @file Principal.java
**  
** @brief Este programa pide los datos de una persona, los almacena 
**        y los muestra por pantalla.
*********************************************************************************
**
** @author AdrianTeso
** @date 11 de oct. de 2015
** @version 00_00
**
 ********************************************************************************/
package Principal;

import java.util.Scanner;

import Elementos.Alumno;

/**
 * @author Adrían
 *
 */
public class Principal {
	
	private static Alumno aSujeto;
	private static Scanner scanEntrada;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		scanEntrada = new Scanner(System.in);
		aSujeto = new Alumno();
		
		System.out.println("Introduzca los siguientes datos:");
		System.out.print("Nombre: ");
		aSujeto.setNombre(scanEntrada.nextLine());
		System.out.print("Apellidos: ");
		aSujeto.setApellidos(scanEntrada.nextLine());
		System.out.print("Edad: ");
		aSujeto.setEdad(scanEntrada.nextInt());
		System.out.println("Curso: ");
		aSujeto.setCurso(scanEntrada.nextInt());
		
		System.out.println("Los datos introducidos son: ");
		System.out.println("Nombre:\t\t" + aSujeto.getNombre());
		System.out.println("Apellidos:\t" + aSujeto.getApellidos());
		System.out.println("Edad:\t\t" + aSujeto.getEdad());
		System.out.println("Curso:\t\t" + aSujeto.getCurso());
		
		scanEntrada.close();
	}

}
