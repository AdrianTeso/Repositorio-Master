import java.util.Scanner;

/********************************************************************************
** @file SeleccionarMenu.java
**  
** @brief Procedimiento para mostrar un menú u otro dependiendo de un parámetro.
*********************************************************************************
**
** @author AdrianTeso
** @date 11 de oct. de 2015
** @version 00_00
**
 ********************************************************************************/


public class SeleccionarMenu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanEntrada = new Scanner(System.in);
		int iParametro;
		
		System.out.println("Por favor introduzca elija una de las siguientes opciones:");
		System.out.println("Menú 1");
		System.out.println("Menú 2");
		System.out.println("Menú 3");
		System.out.println("Menú 4");
		
		iParametro = scanEntrada.nextInt();
		seleccionMenu(iParametro);

	}
	private static void seleccionMenu(int iParametro)
	{
		if(iParametro <= 0 || iParametro > 4){
			System.out.println("Por favor, introduzca un número entre el 1 y el 4.");
		}
		else
		{
			switch (iParametro)
			{
			case 1:
				System.out.println("Este es el menú 1.");
				break;
			case 2:
				System.out.println("Este es el menú 2.");
				break;
			case 3:
				System.out.println("Este es el menú 3.");
				break;
			case 4:
				System.out.println("Este es el menú 4.");
				break;
			default:
				System.out.println("Selección erronea.");
			}
		}
	}

}
