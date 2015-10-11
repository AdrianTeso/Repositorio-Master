import java.util.Scanner;

/********************************************************************************
** @file Operaciones.java
**  
** @brief Esta clase principal solicita dos números alusuario y realiza
**        Operaciones con ellos.
*********************************************************************************
**
** @author AdrianTeso
** @date 11 de oct. de 2015
** @version 00_00
**
 ********************************************************************************/

public class Operaciones {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Creamos el escaneador de la entrada de línea de comandos.
		Scanner scanEntrada = new Scanner(System.in);
		int iNumEntero1, iNumEntero2;
		float fNumFlotante1, fNumFlotante2;
		String sCadena1, sCadena2;
		
		System.out.println("Introduzca dos números por favor:");
		
		sCadena1 = scanEntrada.nextLine();
		iNumEntero1 = Integer.parseInt(sCadena1);
		
		do{
			//Con esto evitamos que el segundo número sea 0.
			System.out.println("Ahora introduzca el segundo (0 no es valido): ");
			sCadena2 = scanEntrada.nextLine();
			iNumEntero2 = Integer.parseInt(sCadena2);
		}while(iNumEntero2 == 0);

		System.out.println("Los resultados son los siguientes");
		System.out.print("Suma: ");
		System.out.println(iNumEntero1 + iNumEntero2);
		System.out.print("Resta: ");
		System.out.println(iNumEntero1 - iNumEntero2);
		fNumFlotante1 = (float)iNumEntero1 * (float)iNumEntero2;
		System.out.print("Multiplicación: ");
		System.out.println(fNumFlotante1);
		fNumFlotante2 = (float)iNumEntero1 / (float)iNumEntero2;
		System.out.print("Division: ");
		System.out.println(fNumFlotante2);
		System.out.println(iNumEntero1 + " es " + (fNumFlotante2 * 100.0) 
				           + "% de " + iNumEntero2);
		
		
		
		

	}

}
