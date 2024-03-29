//Jasmine Carson
//APCS 1st Period
import java.util.*;

//3,5,1,8,2,7,0 5,7,8,7,5,5,3,8,7,3,7,7,8,8,0 3,3,1,2,2,7,5,7,0 5,7,4,1,3,8,7,6,4,6,0 1,2,3,5,3,8,1,8,5,7,0

public class ACSLLand {
	public static void main(String[] args){
		//construct
		Scanner input = new Scanner(System.in);
		Player A = new Player();
		Player B = new Player();
		//5 lines of input
		for (int i = 1; i<=5; i++){
			int roll = input.nextInt();
			//run through line of input until 0 or end is reached
			while(roll!=0 && A.getEnd()==false && B.getEnd()==false){
				//FIX SO IT TERMINATES AT END BETTER
				//add to A
				A.addLocation(roll);
				//are they now on the same spot?
				if (A.getLocation()==B.getLocation()){
					B.moveBack();
				}
				//next roll
				roll = input.nextInt();
				//make sure it's not 0
				if(roll>0){
					B.addLocation(roll);
					//check if same spot
					if (A.getLocation()==B.getLocation()){
						A.moveBack();
					}
					//next roll only if not 0
					roll = input.nextInt();
				}
			}
			System.out.println("A-"+A.toString()+", B-"+B.toString());
		}
	}
}