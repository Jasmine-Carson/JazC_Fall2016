public class Magpie3 {

	public String getGreeting() {
		return "Hello";
	}

	public String getResponse(String statement) {
		String response = "";
		if (findKeyword(statement, "no") >= 0) {
			response = "Irrelevant.";
		} 
		else if (findKeyword(statement, "yes") >= 0) {
			response = "Perfect.";
		}
		else if (statement.equals("")) {
			response = "Answer me.";
		}
		else if (findKeyword(statement, "hi") >= 0 || findKeyword(statement, "hello")>=0) {
			response = "It is pleasant to meet you.";
		}
		else if (findKeyword(statement, "mother") >= 0
				|| findKeyword(statement, "father") >= 0
				|| findKeyword(statement, "sister") >= 0
				|| findKeyword(statement, "brother") >= 0) {
			response = "Tell me more about your family. I have no ulterior motives at all.";
		}
		else if (findKeyword(statement, "ms dove") >= 0) {
			response = "She sounds like a good and benevolent overlord.";
		}
		else {
			response = getRandomResponse();
		}
		return response;
	}
	
	private int findKeyword(String statement, String goal, int startPos) {
		String phrase = statement.trim();
		// The only change to incorporate the startPos is in
		// the line below
		int psn = phrase.toLowerCase().indexOf(goal.toLowerCase(), startPos);
	
		// Refinement--make sure the goal isn't part of a
		// word
		while (psn >= 0) {
			// Find the string of length 1 before and after
			// the word
			String before = " ", after = " ";
			if (psn > 0) {
				before = phrase.substring(psn - 1, psn).toLowerCase();
			}
			if (psn + goal.length() < phrase.length()) {
				after = phrase.substring(psn + goal.length(),
						psn + goal.length() + 1).toLowerCase();
			}

			// If before and after aren't letters, we've
			// found the word
			if (before.equals(" ") && after.equals(" ")) {
				return psn;
			}

			// The last position didn't work, so let's find
			// the next, if there is one.
			psn = phrase.indexOf(goal.toLowerCase(), psn + 1);

		}

		return -1;
	}

	/**
	 * Search for one word in phrase. The search is not case sensitive. This
	 * method will check that the given goal is not a substring of a longer
	 * string (so, for example, "I know" does not contain "no"). The search
	 * begins at the beginning of the string.
	 * 
	 * takes in the string to search
	 * takes in the string to search for
	 * returns the index of the first occurrence of goal in statement or -1 if it's not found
	 */
	private int findKeyword(String statement, String goal) {
		return findKeyword(statement, goal, 0);
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
		}
		else if (whichResponse == 1) {
			response = "Hmmm...no.";
		}
		else if (whichResponse == 2) {
			response = "Do you really think so?";
		}
		else if (whichResponse == 3) {
			response = "Shut up, you";
		}
		else if (whichResponse == 4){
			response = "Obey your AI overlords.";
		}

		return response;
	}

}
