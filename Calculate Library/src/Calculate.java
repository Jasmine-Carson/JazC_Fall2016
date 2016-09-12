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
		double answer = (b*b) - (4*a*c);
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
			return x;
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
			return x;
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
			return x;
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
		if(a<0){
			a=a*-1;
		}
		boolean prime=true;
		for(int i=2; i<a; i++){
			if(Calculate.isDivisibleBy(a, i)==false){
				prime=false;
			}
		}
		return prime;
	}
//greatest common factor
	public static int gcf(int a, int b){
		int i=Calculate.min(a,b);
		while(a%i!=0 && b%i!=0){
			i--;
		}
		return i;
	}
//square root
	public static double sqrt(double x){
		if (x<0){
			return x;
		}
		double a = 1.0;
		while(a*a>(x+.1) || a*a<(x-.1)){
			while(a*a<x){
				a=a+.01;
			}
			if (a*a>x){
				a=a-.01;
			}
		}
		return Calculate.round2(a);
	}	
//quadratic formula
	public static String quadForm(int a, int b, int c){
		if(Calculate.discriminant(a,b,c)<0){
			return "no real roots";
		}
		else if(Calculate.discriminant(a,b,c)==0){
			double answer = -b/(2*a);
			answer = Calculate.round2(answer);
			return(answer + "");
		}
		else{
			double root1=Calculate.sqrt(Calculate.discriminant(a, b, c));
			root1=-b+root1;
			root1=Calculate.round2(root1/(2*a));
			double root2=Calculate.sqrt(Calculate.discriminant(a, b, c));
			root2=-b-root1;
			root2=Calculate.round2(root2/(2*a));
			if (root1<root2){
				return (root1 + " and " + root2);
			}
			else if (root1 == root2){
				return (root1+"");
			}
			else{
				return (root1 + " and " + root2);
			}
		}
	}
}