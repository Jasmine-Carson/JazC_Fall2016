/**
 * @author Jasmine Carson 1st Period
 *
 */
public class DoMath {
	/** @param args*/
	public static void main(String[] args) {
		
		String answer;
		boolean t_or_f;
		double result = Calculate.exponent(2.0,5);
		System.out.println(result);
		answer = Calculate.quadForm(1,-5,6);
		System.out.println(answer);
		t_or_f = Calculate.isDivisibleBy(10,5);
		System.out.println(t_or_f);
	}
}