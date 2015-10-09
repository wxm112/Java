public class GameLauncher {

	public static void main (String [] orgs) {

		int numOfGuesses = 0;

		GameHelper helper = new GameHelper();

		SimpleDotCom theDotCom = new SimpleDotCom();

		int startNum = (int) (Math.random() * 5);

		int [] locations = {startNum, startNum+1, startNum+2};

		theDotCom.setLocationCells(locations);

		boolean isAlive = true;

		while (isAlive == true) {
			String guess = helper.getUserInput("enter a number");
			String result = theDotCom.checkYourself(guess);

			numOfGuesses ++;

			System.out.println(numOfGuesses);

			if (result.equals("kill")) {
				isAlive = false;
				System.out.println("You took " + numOfGuesses + " guesses.");
			}
		}

	}
}

