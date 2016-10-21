import java.util.Arrays;

public class Split {
	public static void main(String[] args) 
	{
		//String.split();
		//It's a method that acts on a string, <StringName>.split(<String sp>);
		//Where sp is the string where the string splits
		//And it returns an array
		// Example: "I like apples!".split(" "); 
		//		it will split at spaces and return an array of ["I","like","apples!"]
		// Example 2: "I really like really red apples"split("really")
		//		it will split at the word "really" and return an array of ["I "," like "," apples!"]
		
		System.out.println(Arrays.toString("I reallyreally like apples".split("really")));
		sandwichSplit("applespineapplesbreadlettustomatobaconmayohambreadcheese");
		sandwichSplit("breadcheesetomatobreadmayomeatbread");
	}
		
		//Your task:
		/*Write a method that take in a string like "applespineapplesbreadlettustomatobaconmayohambreadcheese" describing a sandwich
		 * use String.split to split up the sandwich by the word "bread" and return what's in the middle of the sandwich and ignores what's on the outside
		 * What if it's a fancy sandwich with multiple pieces of bread?
		*/
	public static void sandwichSplit(String sandwich){
		String breadfinder= sandwich.substring(sandwich.indexOf("bread")+5);
		sandwich=breadfinder;
		while(breadfinder.indexOf("bread")>=0){
			breadfinder = breadfinder.substring(breadfinder.indexOf("bread")+5);
		}
		String[] filling = sandwich.split("bread");
		System.out.println(Arrays.toString(filling));
		if ((breadfinder.trim()).equals("")){
			for (int i=0; i<filling.length; i++){
				System.out.print(filling[i]);
			}
		}
		else{
			for(int i = 0; i<filling.length-1; i++){
				System.out.print(filling[i]);
			}
		}
		System.out.println();
	}
		
		//Your task pt 2:
		/*Write a method that take in a string like "apples pineapples bread lettus tomato bacon mayo ham bread cheese" describing a sandwich
		 * use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of the sandwich and ignores what's on the outside
		 * Again, what if it's a fancy sandwich with multiple pieces of bread?
		*/

		

	

}
