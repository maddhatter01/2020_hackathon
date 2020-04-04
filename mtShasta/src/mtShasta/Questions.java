package mtShasta;

public class Questions {
	
private String opt1, opt2, opt3, opt4;
private String q1, q2, q3, q4, q5;
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
public void setQ(int i, String s) 
{
    if (i == 1) 
    {
        q1 = s;
    }
    if (i == 2) 
    {
        q2 = s;
    }
    if (i == 3) 
    {
        q3 = s;
    }
    if (i == 4) 
    {
        q4 = s;
    }
    if (i == 5) 
    {
        q5 = s;
    }
  
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
public String getQ(int i) 
{
    if (i == 1) 
    {
        return q1;
    }
    if (i == 2) 
    {
        return q2;
    }
    if (i == 3) 
    {
        return q3;       
    }
    if (i == 4) 
    {
        return q4;
    }
    if (i == 5) 
    {
        return q5;
    }
    return "Something went wrong, please try again later.";
	}
}
