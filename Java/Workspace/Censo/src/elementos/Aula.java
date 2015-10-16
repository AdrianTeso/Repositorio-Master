/********************************************************************************
** @file Aula.java
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

public class Aula {
	
	private int iIdentifier;
	private Profesor profe;
	
	/**
	 * @param iIdentifier
	 * @param profe
	 */
	public Aula(int iIdentifier, Profesor profe) {
		super();
		this.iIdentifier = iIdentifier;
		this.profe = profe;
	}
	public Aula(int iIdentifier) {
		super();
		this.iIdentifier = iIdentifier;
	}

	/**
	 * @return the profe
	 */
	public Profesor getProfe() {
		return profe;
	}

	/**
	 * @param profe the profe to set
	 */
	public void setProfe(Profesor profe) {
		this.profe = profe;
	}

	/**
	 * @return the iIdentifier
	 */
	public int getiIdentifier() {
		return iIdentifier;
	}

}
