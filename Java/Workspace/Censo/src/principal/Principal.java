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

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import elementos.Alumno;
import elementos.Escuela;
import elementos.Profesor;

/**
 * @author Adrían
 *
 */
public class Principal {
	
	
	private static Scanner scanEntrada;
	private static Escuela escuela;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Alumno aSujeto = new Alumno();
		Profesor profe = new Profesor();
		StringBuffer entrada;
		int iContador;
		int iden;
		boolean numOK = false;
		
		escuela = new Escuela();
		scanEntrada = new Scanner(System.in);
		do{
			System.out.println("Introduzca los siguientes datos del profesor:");
			System.out.println("Nombre: ");
			entrada = new StringBuffer();
			entrada.append(scanEntrada.nextLine());
			if(!entrada.toString().contains("salir")) {
				iden = escuela.addAula();
				profe.setNombre(entrada.toString().trim());
				System.out.println("Apellidos: ");
				profe.setApellidos(scanEntrada.nextLine().trim());
				do {
					System.out.println("Edad: ");
					try {
						profe.setEdad(scanEntrada.nextInt());
						numOK= true;
					}
					catch (InputMismatchException w) {
						System.out.println("¡¡¡No es un número!!!");
						numOK = false;
						scanEntrada.nextLine();
					}
					catch (Exception e) {
						System.err.println(e.getMessage());
						System.exit(-9);
					}
				}while(!numOK);
				numOK= false;
				entrada = null;
				scanEntrada.nextLine();
				do{
					System.out.println("Introduzca los siguientes datos del alumno:");
					System.out.println("Nombre: ");
					entrada = new StringBuffer();
					entrada.append(scanEntrada.nextLine());
					if(!entrada.toString().contains("salir")) {
						aSujeto.setNombre(entrada.toString().trim());
						System.out.println("Apellidos: ");
						aSujeto.setApellidos(scanEntrada.nextLine().trim());
						do{
							System.out.println("Edad: ");
							try {
								aSujeto.setEdad(scanEntrada.nextInt());
								numOK = true;
							}
							catch(InputMismatchException w) {
								System.out.println("¡¡¡No es un número!!!");
								numOK = false;
								scanEntrada.nextLine();
							}
							catch (Exception e) {
								System.err.println(e.getMessage());
								System.exit(-9);
							}
						}while(!numOK);
						
						
						aSujeto.setCurso(iden);
						profe.asignarAlumno(aSujeto);
						entrada = null;
						scanEntrada.nextLine();
					}
					else {
						break;
					}
				}while(true);
				escuela.setProfesorToAula(profe, iden);
			}
			else {
				break;
			}
		}while(true);
		System.out.println("El número de aulas introducido es de: " + escuela.getnumAulas());
		for(iContador = 0; iContador <escuela.getnumAulas(); iContador++)
		{
			profe = escuela.getProfesorFromAula(iContador+1);
			System.out.println("Aula: "+ iContador + 1);
			System.out.println("Profesor: " + profe.getNombre() + " " + profe.getApellidos());
			System.out.println("Nº de alumnos: " + profe.contarAlumnos());
		}
		
		scanEntrada.close();
	}

}
