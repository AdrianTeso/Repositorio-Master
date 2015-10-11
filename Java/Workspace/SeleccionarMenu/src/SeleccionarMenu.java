import java.util.Scanner;

/********************************************************************************
** @file SeleccionarMenu.java
**  
** @brief Procedimiento para mostrar un men� u otro dependiendo de un par�metro.
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
		System.out.println("Men� 1");
		System.out.println("Men� 2");
		System.out.println("Men� 3");
		System.out.println("Men� 4");
		
		iParametro = scanEntrada.nextInt();
		seleccionMenu(iParametro);

	}
	private static void seleccionMenu(int iParametro)
	{
		if(iParametro <= 0 || iParametro > 4){
			System.out.println("Por favor, introduzca un n�mero entre el 1 y el 4.");
		}
		else
		{
			switch (iParametro)
			{
			case 1:
				System.out.println("Este es el men� 1.");
				break;
			case 2:
				System.out.println("Este es el men� 2.");
				break;
			case 3:
				System.out.println("Este es el men� 3.");
				break;
			case 4:
				System.out.println("Este es el men� 4.");
				break;
			default:
				System.out.println("Selecci�n erronea.");
			}
		}
	}

}
