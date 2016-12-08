//Jasmine Carson
//APCS Period 1
//Frac Calc

import java.util.Scanner;

public class Checkpoint3 {
	public static void main(String[] args) {
		//scanner, get input, call, loop till "quit"
		Scanner input = new Scanner(System.in);
		String statement = input.nextLine();
		while (!statement.equals("quit")){
			System.out.println(produceAnswer(statement));
			statement = input.nextLine();
		}	
	}
	
	
	public static String produceAnswer(String str){
//get operands		
		String op1 = str.substring(0, str.indexOf(" "));
		String op2 = str;	
		int[] answerparts = new int[2]; //for the improper fraction answer I get later
		String answer = "";
		op2 = str.substring(str.indexOf(" ")+3);
//get numbers and improper fractions		
		int[] firstOp = parseOperand(op1);
		int[] secondOp = parseOperand(op2);
		String improp1 = Calculate.toImproperFrac(firstOp[0], firstOp[1], firstOp[2]);
		String improp2 = Calculate.toImproperFrac(secondOp[0], secondOp[1], secondOp[2]);
//get numerators and denominators		
		int num1 = Integer.parseInt(improp1.substring(0, improp1.indexOf("/")));
		int denom1 = Integer.parseInt(improp1.substring(improp1.indexOf("/")+1));
		int num2 = Integer.parseInt(improp2.substring(0, improp2.indexOf("/")));
		int denom2 = Integer.parseInt(improp2.substring(improp2.indexOf("/")+1));
//do operations	
		if(str.indexOf("+")>0){
			answerparts = add(num1, denom1, num2, denom2);
		}
		else if(str.indexOf(" - ")>0){
			answerparts = subtract(num1, denom1, num2, denom2);
			//subtracting negatives
			if (num2<0){				
				num2 = -num2;
				answerparts = add(num1, denom1, num2, denom2);
			}
			
		}
		else if(str.indexOf("*")>0){
			answerparts = multiply(num1, denom1, num2, denom2);
		}
		else if(str.indexOf(" / ")>0){
			answerparts = divide(num1, denom1, num2, denom2);
		}
//formatting answer		
		if(answerparts[0] == 0){
			answer = ("0");
		}
		else if(Calculate.isDivisibleBy(answerparts[0], answerparts[1])==true){
			int ans = answerparts[0] / answerparts[1];
			answer = ans+"";
		}
//for stuff that's not 0 or a whole number
		else{
			//reduce fraction
			int [] mixednum = reduce(answerparts[0], answerparts[1]);
			//if numerator is positive AND smaller than denominator
			if (mixednum[0]>0 && mixednum[0]<mixednum[1]){
				answer = mixednum[0] + "/" + mixednum[1];
			}
			//negative AND smaller than denominator
			else if (mixednum[0]<0 && -mixednum[0]<mixednum[1]){
				answer = mixednum[0] + "/" + mixednum[1];
			}
			else{
			//numerator is greater than denominator
				//absolute values
				if(mixednum[0]<0){
					mixednum[0]=-mixednum[0];
					if (mixednum[1]<0){
						mixednum[1]=-mixednum[1];
						//double negative is positive
						answer = Calculate.toMixedNum(mixednum[0], mixednum[1]);
					}
					else{
						//one negative
						answer = "-"+Calculate.toMixedNum(mixednum[0], mixednum[1]);
					}
				}
				else if (mixednum[1]<0){
					mixednum[1]=-mixednum[1];
					//one negative
					answer = "-"+Calculate.toMixedNum(mixednum[0], mixednum[1]);
				}
				else{
					//numerator bigger than denominator
					answer = Calculate.toMixedNum(mixednum[0], mixednum[1]);
					}
				}
				if (answer.charAt(0)==0){
					answer = answer.substring(answer.indexOf("_")+1);
				}
				else if (answer.substring(0,2).equals("-0")){
					answer = "-"+answer.substring(answer.indexOf("_")+1);
				}
			}
	//in case it has a 0 as the first number because the other stuff didn't catch it
		
		return answer;
	}
	
	public static int[] parseOperand(String op1){
		//defaults
		String numerator1 = "0";
		String denominator1 = "1";
		String whole1 = "0";
		String[] operand = new String[3];
		if (op1.indexOf("_")>0){
			//if mixed number
			whole1 = op1.substring(0, op1.indexOf("_"));
			if(op1.indexOf("/")>0){
				numerator1 = op1.substring(op1.indexOf("_")+1, op1.indexOf("/"));
				denominator1 = op1.substring(op1.indexOf("/")+1);
			}
			else{
				//if whole
				numerator1 = "0";
				denominator1 = "1";
				whole1 = op1.substring(0);
			}
		}
		else{
			//if just fraction or whole
			if(op1.indexOf("/")>0){
				numerator1 = op1.substring(0, op1.indexOf("/"));
				denominator1 = op1.substring(op1.indexOf("/")+1);
			}
			else{
				//if whole
				whole1 = op1;
			}
		}
		//put into array
		operand[0] = whole1;
		operand[1] = numerator1;
		operand[2] = denominator1;
		int[] opnum = new int[3];
		//parse
		for (int i = 0; i<3; i++){
			opnum[i] = Integer.parseInt(operand[i]);
		}
		//negatives
		if (opnum[0]<0){
			opnum[1] = -1*opnum[1];
		}
		return opnum;
	}
	
	public static int[] add(int num1, int denom1, int num2, int denom2){
		int numerator;
		int denominator;
		//same denom
		if (denom2 == denom1){
			denominator = denom1;
			numerator = num1 + num2;
		}
		//diff denoms - find common denom
		else{
			denominator = denom1*denom2;
			numerator = (num1*denom2) + (num2 * denom1);
		}
		int [] answer = {numerator, denominator};
		return answer;
	}
	public static int[] subtract(int num1, int denom1, int num2, int denom2){
		int numerator;
		int denominator;
		//same denom
		if (denom2 == denom1){
			denominator = denom1;
			numerator = num1 - num2;
		}
		//diff denoms, find common denominator
		else{
			denominator = denom1*denom2;
			numerator = (num1*denom2) - (num2 * denom1);
		}
		int [] answer = {numerator, denominator};
		return answer;
	}
	public static int[] multiply(int num1, int denom1, int num2, int denom2){
		//multiply numerators and denominators
		int numerator = num1 * num2;
		int denominator = denom1 * denom2;
		int [] answer = {numerator, denominator};
		return answer;
	}
	public static int[] divide(int num1, int denom1, int num2, int denom2){
		//multiply by reciprocal, so num*denom
		int numerator = num1*denom2;
		int denominator = num2*denom1;
		int [] answer = {numerator, denominator};
		return answer;
	}
	
	public static int[] reduce(int num, int denom){
		//make positive
		int posnum = num;
		int posdenom = denom;
		if (num<0){
			posnum = -num;
		}
		if (denom<0){
			posdenom = -denom;
		}
		int gcf = 1;
		//go up to min, check divisibility
		for (int i = 1; i<=Calculate.min(posnum, posdenom); i++){
			if (posnum%i==0 && posdenom%i==0){
				//may be rewritten but highest one will stick
				gcf = i;
			}
		}
		//divide
		num = num/gcf;
		denom = denom/gcf;
		int[] answer = {num, denom};
		return answer;
	}
}