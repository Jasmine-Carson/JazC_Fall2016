import java.util.Scanner;

public class Checkpoint2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String statement = input.nextLine();
		while (!statement.equals("quit")){
			System.out.println(produceAnswer(statement));
			statement = input.nextLine();
		}	
	}
	
	public static String produceAnswer(String str){
		String numerator = "0";
		String denominator = "1";
		String whole = "0";
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
		if (str.indexOf("_")>0){
			whole = str.substring(0, str.indexOf("_"));
			if(str.indexOf("/")>0){
				numerator = str.substring(str.indexOf("_")+1, str.indexOf("/"));
				denominator = str.substring(str.indexOf("/")+1);
			}
			else{
				numerator = "0";
				denominator = "1";
				whole = str.substring(0);
			}
		}
		else{
			if(str.indexOf("/")>0){
				numerator = str.substring(0, str.indexOf("/"));
				denominator = str.substring(str.indexOf("/")+1);
			}
			else{
				whole = str;
			}
		}
		return ("whole:"+whole+" numerator:"+numerator+" denominator:"+denominator);
	}
}
