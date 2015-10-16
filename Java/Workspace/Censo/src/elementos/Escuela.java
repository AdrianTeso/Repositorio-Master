/********************************************************************************
** @file Escuela.java
**  
** @brief 
*********************************************************************************
**
** @author AdrianTeso
** @date 16 de oct. de 2015
** @version 00_00
**
 ********************************************************************************/
package elementos;

import java.util.ArrayList;

/**
 * @author Adrían
 *
 */
public class Escuela {
	
	private ArrayList<Aula> aulas;

	/**
	 * Standard constructor of Escuela.
	 */
	public Escuela() {
		super();
		aulas = new ArrayList<Aula>();
	}
	/**
	 * Method to create and add a new Aula to the aulas list.
	 * @return the Identifier of the Aula.
	 */
	
	public int addAula() {
		
		Aula al = new Aula(aulas.size()+1);
		aulas.add(al);
		return aulas.size();
	}
	
	public int addAula(Profesor profe) {
		Aula al = new Aula(aulas.size()+1, profe);
		aulas.add(al);
		return aulas.size();
	}
	public int getnumAulas() {
		return aulas.size();
	}
	
	public boolean setProfesorToAula(Profesor profe, int iIdentifier)
	{
		if(iIdentifier > 0 && iIdentifier <= aulas.size()) {
			aulas.get(iIdentifier - 1).setProfe(profe);
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public Profesor getProfesorFromAula(int iIdentifier) {
		if(iIdentifier > 0 && iIdentifier <= aulas.size()) {
			return aulas.get(iIdentifier - 1).getProfe();
		}
		else {
			return null;
		}			
	}
	
	public  ArrayList<Aula> getAulasOfProfesor(String nombreProfe, String apellidosProfe) {
		int iContador;
		 ArrayList<Aula> al = new  ArrayList<Aula>();
		for(iContador = 0; iContador < aulas.size(); iContador++) {
			if(aulas.get(iContador).getProfe().getNombre().matches(nombreProfe) &&
			   aulas.get(iContador).getProfe().getApellidos().matches(apellidosProfe)) {
				al.add(aulas.get(iContador));
			}
		}
		return al;
	}
	
}
