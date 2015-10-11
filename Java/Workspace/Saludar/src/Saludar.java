import java.io.IOException;

/********************************************************************************
** @file Saludar.java
**  
** @brief Esta clase principal pide al usuario su nombre
**        y le devuelve el saludo.
*********************************************************************************
**
** @author AdrianTeso
** @date 11 de oct. de 2015
** @version 00_00
**
 ********************************************************************************/

public class Saludar {

	/**
	 * @param args Los argumentos del sistema.
	 */
	public static void main(String[] args) {
		String sNombre;
	    byte[] b = new byte[31];
	    
	    System.out.println("Por favor, introduzca su nombre "+
	    "(le agradecería que fuera menora 30 carácteres): ");
		try {
			System.in.read(b);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		sNombre = new String(b);
		sNombre = sNombre.trim();
		
		System.out.println("¡Bienvenido " + sNombre + "!");

	}

}
