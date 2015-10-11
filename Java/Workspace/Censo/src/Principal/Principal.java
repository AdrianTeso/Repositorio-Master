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

import Elementos.Persona;

/**
 * @author Adrían
 *
 */
public class Principal {
	
	private static Persona pSujeto;
	private static Scanner scanEntrada;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		scanEntrada = new Scanner(System.in);
		pSujeto = new Persona();
		
		System.out.println("Introduzca los siguientes datos:");
		System.out.print("Nombre: ");
		pSujeto.setNombre(scanEntrada.nextLine());
		System.out.print("Apellidos: ");
		pSujeto.setApellidos(scanEntrada.nextLine());
		System.out.print("Edad: ");
		pSujeto.setEdad(scanEntrada.nextInt());
		
		System.out.println("Los datos introducidos son: ");
		System.out.println("Nombre:\t\t" + pSujeto.getNombre());
		System.out.println("Apellidos:\t" + pSujeto.getApellidos());
		System.out.println("Edad:\t\t" + pSujeto.getEdad());
	}

}
