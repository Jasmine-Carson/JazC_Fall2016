//Jasmine Carson
//1st Period

//Player object
public class Player {
	private int location;
	private boolean atEnd;
	
	//constructor, always blank
	public Player(){
		this.location = 0;
		this.atEnd=false;
	}
	//move player
	public void addLocation(int roll){
		if (roll==4 || roll==6){
			location = location-roll;
		}
		else{
			roll = location+roll;
		}
		if(location<0){
			location=0;
		}
		if(location>=40){
			atEnd=true;
		}
	}
	//bump player to start
	public void moveBack(){
		this.location=0;
	}
	//has it reached the end?
	public boolean getEnd(){
		return atEnd;
	}
	//where is it?
	public int getLocation(){
		return location;
	}
}
