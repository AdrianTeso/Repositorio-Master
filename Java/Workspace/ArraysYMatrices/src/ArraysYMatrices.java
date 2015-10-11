import java.util.Random;
import java.util.Scanner;

/********************************************************************************
** @file ArraysYMatrices.java
**  
** @brief Este ejercicio se ocupa de el uso de arrays y matrices.
*********************************************************************************
**
** @author AdrianTeso
** @date 11 de oct. de 2015
** @version 00_00
**
 ********************************************************************************/

/**
 * @author Adrían
 *
 */
public class ArraysYMatrices {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanEntrada = new Scanner(System.in);
		String[] asNombres = new String[3];

		int[][] aiMatriz = new int[5][4];
		Random rnd = new Random();

		int iContFila, iContColumna;

		for (iContFila = 0; iContFila < aiMatriz.length; iContFila++) {
			for (iContColumna = 0; iContColumna < aiMatriz[0].length; iContColumna++) {
				aiMatriz[iContFila][iContColumna] = rnd.nextInt(100);
			}
		}

		System.out.println("Introduzca 3 nombres:");
		asNombres[0] = scanEntrada.nextLine();
		asNombres[1] = scanEntrada.nextLine();
		asNombres[2] = scanEntrada.nextLine();

		System.out.println("Estos son los nombres que se eligieron:");

		publicarArrayNombres(asNombres);

		System.out.println("Esta es una matriz de " + aiMatriz.length * aiMatriz[0].length + " elementos.");
		publicarMatriz(aiMatriz);

		scanEntrada.close();

	}

	private static void publicarArrayNombres(String[] asNombres) {
		int iContador;

		iContador = 0;

		while (iContador < asNombres.length) {
			System.out.println("Nombre " + (iContador + 1) + " " + asNombres[iContador]);
			iContador++;
		}
	}

	private static void publicarMatriz(int[][] aiMatriz) {
		int iContColumna, iContFila;

		iContFila = 0;

		while (iContFila < aiMatriz.length) {
			for (iContColumna = 0; iContColumna < aiMatriz[0].length; iContColumna++) {
				if (iContColumna < aiMatriz[0].length - 1) {
					System.out.print(aiMatriz[iContFila][iContColumna] + "\t");
				} else {
					System.out.println(aiMatriz[iContFila][iContColumna]);
				}
			}
			iContFila++;
		}
	}

}
