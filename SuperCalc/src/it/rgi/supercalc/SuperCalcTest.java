/**
 * 
 */
package it.rgi.supercalc;

/**
 * @author academy1419r.01
 *
 */
public class SuperCalcTest {

	/**
	 * 
	 */
	public SuperCalcTest() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperCalc sc=new SuperCalc();
		int op1=20, op2=30;
		int sum = sc.sum(op1, op2);
		int sub = sc.sub(op1, op2);
		
		System.out.println("SuperCalc sum: " + op1 + " + " + op2 + " = " + sum);
		System.out.println("SuperCalc difference: " + op1 + " - " + op2 + " = " + sub);
		

	}

}
