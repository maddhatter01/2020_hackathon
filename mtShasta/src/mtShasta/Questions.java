package mtShasta;

public class Questions {
	
	private String opt1, opt2, opt3, opt4;
	private String question;
	private int answer;
	
	// Set the multiple choice options for a question, all question have 4 possible answers
	public void setO(int i, String s) 
	{
	    if (i == 1) 
	    {
	        opt1 = s;
	    }
	    if (i == 2) 
	    {
	        opt2 = s;
	    }
	    if (i == 3) 
	    {
	        opt3 = s;
	    }
	    if (i == 4) {
	        opt4 = s;
	    }
	}
	
	// Set the question
	public void setQ(String s) 
	{
		question = s;
	}
	
	// Set the answer for the question, all answers are indicated by the option # associated with them. 
	public void setAnswer(int i) 
	{
	    answer = i;
	}
	
	// Display the question with each possible answer
	public void showQ(int i) 
	{
	    System.out.println(getQ(i));
	    System.out.println("1. " + opt1 + "\n2. " + opt2 + "\n3. " + opt3 + "\n4. " + opt4);
	}
	
	// Get the answer for a specific question
	public int getAnswer() 
	{
	    return answer;
	}
	
	// Get what the question is
	private String getQ(int i) 
	{
		return question;
	}
}
