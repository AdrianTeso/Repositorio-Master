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
package principal;

import java.util.Scanner;

import elementos.Alumno;
import elementos.BaseDeDatos;

/**
 * @author Adrían
 *
 */
public class Principal {
	
	
	private static Scanner scanEntrada;
	private static BaseDeDatos bddAlumnos;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Alumno aSujeto = new Alumno();
		StringBuffer entrada;
	
		scanEntrada = new Scanner(System.in);
		bddAlumnos = new BaseDeDatos();
		
		do{
			System.out.println("Introduzca los siguientes datos:");
			System.out.println("Nombre: ");
			entrada = new StringBuffer();
			entrada.append(scanEntrada.next());
			if(!entrada.toString().contains("salir")) {
				aSujeto.setNombre(entrada.toString().trim());
				System.out.println("Apellidos: ");
				aSujeto.setApellidos(scanEntrada.next().trim());
				System.out.println("Edad: ");
				scanEntrada.nextLine();
				aSujeto.setEdad(scanEntrada.nextInt());
				System.out.println("Curso: ");
				aSujeto.setCurso(scanEntrada.nextInt());
				bddAlumnos.insertarAlumno(aSujeto);
				entrada = null;

			}
			else {
				break;
			}
		}while(true);
		
		System.out.println("El número de alumnos introducido es de: " + bddAlumnos.contarAlumnos());
		
		scanEntrada.close();
	}

}
