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
	public static double average(double var1, double var2){
		double answer = (var1 + var2)/2;
		return answer;
	}
//average 3
	public static double average(double var1, double var2, double var3){
		double answer = (var1 + var2 + var3)/3;
		return answer;
	}
//radians to degrees
	public static double toDegrees(double rad){
		double answer = 180 * rad / 3.14159;
		return answer;
	}
//degrees to radians
	public static double toRadians(double deg){
		double answer = 3.14159 * deg / 180;
		return answer;
	}
//discriminant
	public static double discriminant(double a, double b, double c){
		double answer = (b*b) - (4*a*c);
		return answer;
	}
//mixed number to improper fraction
	public static String toImproperFrac(int whole, int numerator, int denominator){
		if (denominator==0) throw new IllegalArgumentException("you can't divide by 0 has math class taught you nothing");
		numerator = whole*denominator + numerator;
		String answer = numerator+"/"+denominator;
		return answer;
	}
//improper fraction to mixed number
	public static String toMixedNum(int numerator, int denominator){
		if (denominator==0) throw new IllegalArgumentException("you can't divide by 0 has math class taught you nothing");
		int wholeNumber = numerator/denominator;
		int frac = numerator % denominator;
		String answer = wholeNumber+"_"+frac+"/"+denominator;
		return answer;
	}
//makes a quadratic
	public static String foil(int a, int b, int c, int d, String x){
		//(ax+b)(cx+d)
		int first = a * c;
		int second = a *d + b * c;
		int third = b * d;
		return(first+x+"^2 + "+second+x+" + "+third);
	}
//checks divisibility
	public static boolean isDivisibleBy(int dividend, int divisor){
		if(divisor==0) throw new IllegalArgumentException("you can't divide by 0 has math class taught you nothing");
		boolean div;
		if (dividend%divisor==0){
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
	public static int max(int var1, int var2){
		if(var1==var2) throw new IllegalArgumentException("those numbers are the same, stop being a jerk");
		if (var1>var2){
			return var1;
		}
		else{
			return var2;
		}
	}
//biggest of 3
	public static double max(double num1, double num2, double num3){
		if (num1==num2 && num1==num3) throw new IllegalArgumentException("those numbers are all the same, stop being a jerk");
		if (num1>num2 && num1>num3){
			return num1;
		}
		else if (num2>num1 && num2>num3){
			return num2;
		}
		else if (num3>num1 && num3>num2){
			return num3;
		}
		else{
			return num1;
		}
	}
//smaller of 2
	public static int min(int num1, int num2){
		if(num1==num2) throw new IllegalArgumentException("those numbers are the same, stop being a jerk");
		if (num1<num2){
			return num1;
		}
		else if (num2<num1){
			return num2;
		}
		else{
			return num1;
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
	public static double exponent(double base, int power){
		if(power<0) throw new IllegalArgumentException("positive exponents only, don't be rude");
		int repeat=0;
		double answer =1;
		while(repeat<power){
			answer = answer*base;
		}
		return answer;
	}
//find the factorial!
	public static int factorial(int num){
		if (num<0) throw new IllegalArgumentException("oh come on don't be rude, positive integers only");
		int answer =1;
		for (int i=1; i<=num; i++){
			answer = answer*i;
		}
		return answer;
	}
//is it prime?
	public static boolean isPrime(int num){
		if(num<2) throw new IllegalArgumentException("it's not prime or not-prime if it's less than 2 and you should know that already");
		boolean prime=true;
		for(int i=2; i<num; i++){
			if(Calculate.isDivisibleBy(num, i)==false){
				prime=false;
			}
		}
		if(num==2){
			prime=true;
		}
		return prime;
	}
//greatest common factor
	public static int gcf(int num1, int num2){
		if(num1<0 || num2<0) throw new IllegalArgumentException("positive ints only, do you WANT to break the program? rude.");
		int i=Calculate.min(num1,num2);
		while(num1%i!=0 && num2%i!=0){
			i--;
		}
		return i;
	}
//square root
	public static double sqrt(double x){
		if (x<0) throw new IllegalArgumentException("input is less than 0 and we don't work with imaginaries here");
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