import java.util.Scanner;

/********************************************************************************
** @file ElegirForOWhile.java
**  
** @brief Este ejercicio crea un procedimiento para  elegir entre imprimir 
**        números del 0 al 10 usando bucle FOR o bucle WHILE.  
*********************************************************************************
**
** @author AdrianTeso
** @date 11 de oct. de 2015
** @version 00_00
**
 ********************************************************************************/


public class ElegirForOWhile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanEntrada = new Scanner(System.in);
		
		System.out.println("Por favor, elija como imprimir por pantalla"
				+ " los números del 0 al 10");
		System.out.println("0: Para hacerlo mediante WHILE");
		System.out.println("1: Para hacerlo mediante FOR");
		
		Elegir(scanEntrada.nextInt());
		scanEntrada.close();
	}
	
	private static void Elegir(int iParametro)
	{
		int iContador = 0;
		
		switch (iParametro)
		{
		case 0:
			while(iContador < 11)
			{
				System.out.println(iContador);
				iContador++;
			}
			break;
		case 1:
			for(iContador = 0; iContador < 11; iContador++)
			{
				System.out.println(iContador);
			}
			break;
		default:
			System.out.println("Por favor introduzca 0 o 1.");	
		}
	}

}
