/**
 * A program demonstrating the power of annotations
 * @author Nafis Iqbal
 * @since 10-29-2018
 * @version 1.0
 */
public class Annote {
	/**this is a function
	 *which adds two inegers 
	 * @param a is a given integer
	 * @param b is the other integer
	 * @return a+b sum of the two integers
	 */
	public int add(int a,int b)
	{
		return a+b;
	}
	/**this is a function
	 *which returns products of two integers 
	 * @param a is a given integer
	 * @param b is the other integer
	 * @return a*b product of the two integers
	 */
	public int multiply(int a,int b)
	{
		return a*b;
	}
	/**this is a function
	 *which returns division of two integers 
	 * @param a is a given integer
	 * @param b is the other integer
	 * @return a/b division of the two integers
	 */
	public int divide(int a,int b)
	{
		return a/b;
	}
	/**this is a function
	 *which returns products of two integers 
	 * @param a is a given integer
	 * @param b is the other integer
	 * @return a-b difference of the two integers
	 */
	public int subtract(int a,int b)
	{
		return a-b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Annote ob=new Annote();
		int valAdd=ob.add(10,10);
		int valMultiply=ob.multiply(10,5);
		int valSubtract=ob.subtract(20,12);
		int valDivide=ob.divide(50,5);
		System.out.println(valAdd);
		System.out.println(valMultiply);
		System.out.println(valSubtract);
		System.out.println(valDivide);
	}

}
