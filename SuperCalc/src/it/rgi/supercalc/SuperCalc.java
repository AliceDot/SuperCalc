/**
 * 
 */
package it.rgi.supercalc;

/**
 * @author academy1419r.01
 *
 */
public class SuperCalc {
	private int ret;

	/**
	 * 
	 */
	public SuperCalc() {
		// TODO Auto-generated constructor stub
	}
	
	//Metodo per fare l'addizione tra due numeri
	public int sum(int op1, int op2) {
		ret=op1+op2;
		return ret;
	}
	
	//Metodo per fare la sottrazione tra due numeri
	public int sub(int op1, int op2) {
		ret=op1-op2;
		return ret;
	}
	
	//Metodo per fare la moltiplicazione tra due numeri
	public int mol(int op1, int op2) {
		ret=op1*op2;
		return ret;
	}

}
