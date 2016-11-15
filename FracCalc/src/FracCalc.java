import java.util.Scanner;

public class FracCalc {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String statement = input.nextLine();
		System.out.println(produceAnswer(statement));
	}
	
	public static String produceAnswer(String str){
		if(str.indexOf("+")>0){
			str = str.substring(str.indexOf(" + ")+3);
		}
		else if(str.indexOf(" - ")>0){
			str = str.substring(str.indexOf(" - ")+3);
		}
		else if(str.indexOf("*")>0){
			str = str.substring(str.indexOf(" * ")+3);
		}
		else if(str.indexOf(" / ")>0){
			str = str.substring(str.indexOf(" / ")+3);
		}
		return str;
	}
}