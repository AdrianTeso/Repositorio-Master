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
import java.util.Scanner;

import elementos.Alumno;
import elementos.Profesor;

/**
 * @author Adrían
 *
 */
public class Principal {
	
	
	private static Scanner scanEntrada;
	private static ArrayList<Profesor> bddProfesores;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Alumno aSujeto = new Alumno();
		Profesor profe = new Profesor();
		StringBuffer entrada;
		int iContador;
		
		bddProfesores = new ArrayList<Profesor>();
		scanEntrada = new Scanner(System.in);
		do{
			System.out.println("Introduzca los siguientes datos del profesor:");
			System.out.println("Nombre: ");
			entrada = new StringBuffer();
			entrada.append(scanEntrada.nextLine());
			if(!entrada.toString().contains("salir")) {
				profe.setNombre(entrada.toString().trim());
				System.out.println("Apellidos: ");
				profe.setApellidos(scanEntrada.nextLine().trim());
				System.out.println("Edad: ");
				profe.setEdad(scanEntrada.nextInt());
				
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
						System.out.println("Edad: ");
						aSujeto.setEdad(scanEntrada.nextInt());
						System.out.println("Curso: ");
						aSujeto.setCurso(scanEntrada.nextInt());
						profe.asignarAlumno(aSujeto);
						entrada = null;
						scanEntrada.nextLine();
					}
					else {
						break;
					}
				}while(true);
				bddProfesores.add(profe);
			}
			else {
				break;
			}
		}while(true);
		
		System.out.println("El número de profesores introducido es de: " + bddProfesores.size());
		for(iContador = 0; iContador < bddProfesores.size(); iContador++)
		{
			//bddProfesores.get(iContador)
			System.out.println("Profesor: " + bddProfesores.get(iContador).getNombre());
			System.out.println("Nº de alumnos: " + bddProfesores.get(iContador).contarAlumnos());
		}
		
		scanEntrada.close();
	}

}
