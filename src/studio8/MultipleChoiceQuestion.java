package studio8;

public class MultipleChoiceQuestion extends Question {
	private String [] choices;
	public MultipleChoiceQuestion(String prompt, String answer, int points, String[] choices) {
		//this takes the instance variables from parent class question
		super(prompt,answer, points);
		//this is the constructer line for the new instance variable
		this.choices = choices;
	}
	//overrides the parent class version of this method
	@Override

	public void displayPrompt() {
		//FIXME

		System.out.println(super.getPrompt() + "(" + super.getPoints()+ " points)");
		for(int i=0; i<choices.length; i++) {
			System.out.println(i+1+": "+ choices[i]);
		}
		
		/*
		 * Use the method from the base class to display the prompt,
		 * Then write more code to display all of the choices like so:
		 * 
		 * 1. Choice1
		 * 2. Choice2
		 * 3. Choice3
		 * ...
		 * N. ChoiceN
		 */
		//
	}

	public String[] getChoices() {
		return choices;
	}
	public void setChoices(String[] choices) {
		this.choices = choices;
	}
	public static void main(String[] args) {
		String[] choices = {"seven", "nine", "eight", "six"};
		Question multipleChoice = new MultipleChoiceQuestion("What studio is this?", "3", 1, choices);
		multipleChoice.displayPrompt();
		System.out.println(multipleChoice.checkAnswer("hi"));//wrong
		System.out.println(multipleChoice.checkAnswer("1"));//wrong
		System.out.println(multipleChoice.checkAnswer("3"));//right
	}

}
