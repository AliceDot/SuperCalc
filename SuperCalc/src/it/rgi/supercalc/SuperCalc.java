/**
 * 
 */
package it.rgi.supercalc;

/**
 * @author Alice
 * @version 1.0
 *
 */
public class SuperCalc {
	private int ret;

	/**
	 * Constructor of SuperCalc class
	 * <p>
	 * Description
	 */
	public SuperCalc() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * sum
	 * <p>
	 * @param op1 first param
	 * @param op2 second param
	 * @return sum of op1 and op2
	 */
	
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
