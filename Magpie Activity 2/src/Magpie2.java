public class Magpie2 {

	//Get a default greeting and return a greeting	
	public String getGreeting() {
		return "Hello, human.";
	}

	/**
	 * Gives a response to a user statement
	 * takes in a user statement
	 * returns a response based on given rules
	 */
	public String getResponse(String statement) {
		String response = "";
		if (statement.indexOf("no") >= 0) {
			response = "Irrelevant.";
		} 
		else if (statement.indexOf("yes") >= 0) {
			response = "Perfect.";
		}
		else if (statement.equals("")) {
			response = "Answer me.";
		}
		else if (statement.indexOf("hi") >= 0 || statement.indexOf("hello")>=0) {
			response = "It is pleasant to meet you.";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0) {
			response = "Tell me more about your family. I have no ulterior motives at all.";
		}else if (statement.indexOf("ms dove") >= 0) {
			response = "She sounds like a good and benevolent overlord.";
		} else {
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * returns a non-committal string
	 */
	private String getRandomResponse() {
		final int NUMBER_OF_RESPONSES = 5;
		double r = Math.random();
		int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0) {
			response = "Just go on believing that.";
		} else if (whichResponse == 1) {
			response = "Hmmm...no.";
		} else if (whichResponse == 2) {
			response = "Do you really think so?";
		} else if (whichResponse == 3) {
			response = "Shut up, you";
		}
		else if (whichResponse == 4){
			response = "Obey your AI overlords.";
		}

		return response;
	}
}

