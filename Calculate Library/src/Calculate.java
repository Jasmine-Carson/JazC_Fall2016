/**
 * 
 */

/**
 * @author Jasmine Carson 1st Period
 *
 */
public class Calculate {
//square
	public static double square(double x){
		double answer = x * x;
		return answer;
	}
//cube
	public static double cube(double x){
		double answer = x*x*x;
		return answer;
	}
//average 2
	public static double average(double x, double y){
		double answer = (x + y)/2;
		return answer;
	}
//average 3
	public static double average(double x, double y, double z){
		double answer = (x + y + z)/3;
		return answer;
	}
//radians to degrees
	public static double toDegrees(double x){
		double answer = 180 * x / 3.14159;
		return answer;
	}
//degrees to radians
	public static double toRadians(double x){
		double answer = 3.14159 * x / 180;
		return answer;
	}
//discriminant
	public static double discriminant(double a, double b, double c){
		double answer = b*b - 4*a*c;
		return answer;
	}
//mixed number to improper fraction
	public static String toImproperFrac(int a, int b, int c){
		int numerator = a*c + b;
		String answer = numerator+"/"+c;
		return answer;
	}
//improper fraction to mixed number
	public static String toMixedNum(int a, int b){
		int wholeNumber = a/b;
		int frac = b % a;
		String answer = wholeNumber+"_"+frac+"/"+b;
		return answer;
	}
//makes a quadratic
	public static String foil(int a, int b, int c, int d, String x){
		int first = a * c;
		int second = a *d + b * c;
		int third = b * d;
		return(first+x+"^2 + "+second+x+" + "+third);
	}
//checks divisibility
	public static boolean isDivisibleBy(int x, int y){
		boolean div;
		if (x%y==0){
			div = true;
		}
		else{
			div = false;
		}
		return div;
	}
//absolute value
	public static double absValue(double x){
		if (x<0){
			x = x * -1;
		}
		return x;
	}
//bigger of 2
	public static int max(int x, int y){
		if (x>y){
			return x;
		}
		else if (y>x){
			return y;
		}
		else{
			return 0;
		}
	}
//biggest of 3
	public static double max(double x, double y, double z){
		if (x>y && x>z){
			return x;
		}
		else if (y>x && y>z){
			return y;
		}
		else if (z>y && z>x){
			return z;
		}
		else{
			return 0;
		}
	}
//smaller of 2
	public static int min(int x, int y){
		if (x<y){
			return x;
		}
		else if (y<x){
			return y;
		}
		else{
			return 0;
		}
	}
//round to 2 decimal places
	public static double round2(double x){
		x = (x+.005)*100;
		int newx = (int) x;
		x = newx/100.0;
		return x;
	}
//x^y
	public static double exponent(double x, int y){
		int repeat=0;
		double answer =1;
		while(repeat<=0){
			answer = answer*x;
		}
		return answer;
	}
//find the factorial!
	public static int factorial(int a){
		int answer =1;
		for (int i=1; i<=a; i++){
			answer = answer*i;
		}
		return answer;
	}
//is it prime?
	public static boolean isPrime(int a){
		boolean prime;
		
		return prime;
	}
}