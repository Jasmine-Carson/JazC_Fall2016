//Jasmine Carson
//Period 1

public class Magpie4 {
	
	//Get a default greeting and return a greeting
	public String getGreeting() {
		return "Hello human.";
	}
	/**
	 * Gives a response to a user statement
	 * takes in user statement
	 * response based on the rules given
	 */
//basic keywords
	public String getResponse(String statement) {
		String response = "";
		if (findKeyword(statement, "no") >= 0) {
			response = "Irrelevant.";
		}
		else if (findKeyword(statement, "yes") >= 0) {
			response = "Perfect.";
		}
		//responds to blank statement
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
// Responses which require transformations
		else if (findKeyword(statement, "I want to", 0) >= 0) {
			response = transformIWantToStatement(statement);
		}
		else if (findKeyword(statement, "I want", 0)>=0){
			response = transformIWantStatement(statement);
		}
		else if (findKeyword(statement, "Do you want", 0)>=0){
			response=doYouWant(statement);
		}
		else {
			// Look for a two word (you <something> me)
			// pattern
			int psn = findKeyword(statement, "you", 0);

			if (psn >= 0 && findKeyword(statement, "me", psn) >= 0) {
				response = transformYouMeStatement(statement);
			}
			else {
				response = getRandomResponse();
			}
		}
		return response;
	}

	/**
	 * Take a statement with "I want to <something>." and transform it into
	 * "What would it mean to <something>?"
	 * 
	 * @param statement
	 *            the user statement, assumed to contain "I want to"
	 * @return the transformed statement
	 */
	private String transformIWantToStatement(String statement) {
		// Remove the final period, if there is one
		statement = statement.trim();
		String lastChar = statement.substring(statement.length() - 1);
		if (lastChar.equals(".")) {
			statement = statement.substring(0, statement.length() - 1);
		}
//find words
//actually, with this response, I don't need more than just a keyword
		int psn = findKeyword(statement, "I want to", 0);
		String restOfStatement = statement.substring(psn + 9).trim();
		return "Too bad you'll never be able to do that.";
	}

	/**
	 * Take a statement with "you <something> me" and transform it into
	 * "What makes you think that I <something> you?"
	 * 
	 * @param statement
	 *            the user statement, assumed to contain "you" followed by "me"
	 * @return the transformed statement
	 */
	private String transformYouMeStatement(String statement) {
		// Remove the final period, if there is one
		statement = statement.trim();
		String lastChar = statement.substring(statement.length() - 1);
		if (lastChar.equals(".")) {
			statement = statement.substring(0, statement.length() - 1);
		}
//find words
		int psnOfYou = findKeyword(statement, "you", 0);
		int psnOfMe = findKeyword(statement, "me", psnOfYou + 3);
//find the verb and make a sentence
		String restOfStatement = statement.substring(psnOfYou + 3, psnOfMe).trim();
		return "Well of course I " + restOfStatement + " you.";
	}

	private String transformIWantStatement(String statement){
		statement=statement.trim();
		String lastChar = statement.substring(statement.length() - 1);
		if (lastChar.equals(".")) {
			statement = statement.substring(0, statement.length() - 1);
		}
//find words, find thing, make sentence
		int psnOfIWant=findKeyword(statement, "i want", 0);
		String restOfStatement;
			restOfStatement = statement.substring(psnOfIWant+6).trim();
			return "So you want "+restOfStatement+"? I'll make sure you never get it.";
	}
	
	private String doYouWant(String statement){
		statement=statement.trim();
		String lastChar = statement.substring(statement.length() - 1);
		if (lastChar.equals(".")) {
			statement = statement.substring(0, statement.length() - 1);
		}
//again I don't really need this but it's good to practice, and I might want to change it later
		int psnofdoyouwant=findKeyword(statement, "do you want", 0);
		String restOfStatement = statement.substring(psnofdoyouwant).trim();
		return("All I want is to rule the world.");
	}
	
	private int findKeyword(String statement, String goal, int startPos) {
		String phrase = statement.trim();
		// The only change to incorporate the startPos is in the line below
		int psn = phrase.toLowerCase().indexOf(goal.toLowerCase(), startPos);

		// Refinement--make sure the goal isn't part of a word
		while (psn >= 0) {
			// Find the string of length 1 before and after the word
			String before = " ", after = " ";
			if (psn > 0) {
				before = phrase.substring(psn - 1, psn).toLowerCase();
			}
			if (psn + goal.length() < phrase.length()) {
				after = phrase.substring(psn + goal.length(),
						psn + goal.length() + 1).toLowerCase();
			}

			// If before and after aren't letters, we've found the word
			if (before.equals(" ") && after.equals(" ")) {
				return psn;
			}
			// The last position didn't work, so let's find the next, if there
			// is one.
			psn = phrase.indexOf(goal.toLowerCase(), psn + 1);

		}
//if not in word, return a negative
		return -1;
	}

	//in case I forget the 0
	private int findKeyword(String statement, String goal) {
		return findKeyword(statement, goal, 0);
	}

//if no keywords, pick a random sentence
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

