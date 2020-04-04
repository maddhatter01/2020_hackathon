package mtShasta;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		int score = 0;
		int questionNum = 1;
		Object question;
		
		Scanner scan = new Scanner(System.in);
		
		Questions q1,q2,q3,q4,q5;
		
		// Question 1. Enter the question, and all possible answer, and the correct answer
	    q1 = new Questions();
	    q1.setQ("What is the elevation of Mt. Shasta?");
	    q1.setO(1, "14,180 ft");
	    q1.setO(2, "23,152 ft");
	    q1.setO(3, "9,122 ft");
	    q1.setO(4, "7,628 ft");
	    q1.setAnswer(1);
	   
	    // Question 2. Enter the question, and all possible answer, and the correct answer
	    q2 = new Questions();
	    q2.setQ("Which mountain range is Mt. Shasta located in?");
	    q2.setO(1, "Rocky Mountain");
	    q2.setO(2, "Sierra");
	    q2.setO(3, "Cascade");
	    q2.setO(4, "Siskiyou");
	    q2.setAnswer(3);
	    
	    // Question 3. Enter the question, and all possible answer, and the correct answer
	    q3 = new Questions();
	    q3.setQ("What type of volcano is Mt. Shasta?");
	    q3.setO(1, "Shield volcano");
	    q3.setO(2, "Stratovolcano");
	    q3.setO(3, "Pyroclastic cone");
	    q3.setO(4, "Pyroclastic shield");
	    q3.setAnswer(2);

	    // Question 4. Enter the question, and all possible answer, and the correct answer
	    q4 = new Questions();
	    q4.setQ("When did Mt. Shasta last erupt?");
	    q4.setO(1, "1902");
	    q4.setO(2, "1786");
	    q4.setO(3, "1593");
	    q4.setO(4, "1894");
	    q4.setAnswer(2);

	    // Question 5. Enter the question, and all possible answer, and the correct answer
	    q5 = new Questions();
	    q5.setQ("What year was Mt. Shasta designated a US national natural landmark?");
	    q5.setO(1, "1938");
	    q5.setO(2, "1952");
	    q5.setO(3, "1898");
	    q5.setO(4, "1976");
	    q5.setAnswer(4);
	   
	    // Set object variable equal to the first question
	    question = q1;
	    
	    // Loop 5 times for all five questions, incrementing the gNum var to move to the next question.
	    while(questionNum<=5) {
	    	((Questions) question).showQ(questionNum);
	    	System.out.println("\nEnter 1, 2, 3, or 4 -> ");
	    	int userAnswer = scan.nextInt();
	    	
	    	// If correct, increment the score, and display Correct!
	    	if(((Questions) question).getAnswer()==userAnswer) {
	    		score++;
	    		System.out.println("--------------\nCorrect!\n--------------");
	    	}
	    	// If incorrect display Nope!
	    	else{
	    		System.out.println("--------------\nNope!\n--------------");
	    	}
	    	// increment qNum
	    	questionNum++;
	    	// Change the reference of the object in the question var to move on to the next question, based on qNum
	    	if(questionNum == 2) {
	    		question = q2;
	    	}
	    	// Change the reference of the object in the question var to move on to the next question, based on qNum
	    	if(questionNum == 3) {
	    		question = q3;
	    	}
	    	// Change the reference of the object in the question var to move on to the next question, based on qNum
	    	if(questionNum == 4) {
	    		question = q4;
	    	}
	    	// Change the reference of the object in the question var to move on to the next question, based on qNum
	    	if(questionNum == 5) {
	    		question = q5;
	    	}
	    }
	    // Print out the results, and close the scanner
	    if(score==5) {
	    	System.out.println("\nWell Done!! Perfect Score!!!");
	    }
	    else {
	    	System.out.println("\nYou got " + score + " out of 5 correct");
	    }
	    scan.close();
	}
}
		

