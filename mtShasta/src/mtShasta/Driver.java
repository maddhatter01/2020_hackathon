package mtShasta;

import java.util.Scanner;

public class Driver extends Questions{
	public static void main(String[] args) {
		int score = 0;
		int qNum = 1;
		Object question;
		
		Scanner scan = new Scanner(System.in);
		
		Questions q1,q2,q3,q4,q5;
		
		// Question 1. Enter the question, and all possible answer, and the correct answer
	    q1 = new Questions();
	    q1.setQ(1, "What is the elevation of Mt. Shasta?");
	    q1.setO(1, "14,180 ft");
	    q1.setO(2, "23,152 ft");
	    q1.setO(3, "9,122 ft");
	    q1.setO(4, "7,628 ft");
	    q1.setAnswer(1);
	   
	    // Question 2. Enter the question, and all possible answer, and the correct answer
	    q2 = new Questions();
	    q2.setQ(2, "Which mountain range is Mt. Shasta located in?");
	    q2.setO(1, "Rocky Mountain");
	    q2.setO(2, "Sierra");
	    q2.setO(3, "Cascade");
	    q2.setO(4, "Siskiyou");
	    q2.setAnswer(3);
	    
	    // Question 3. Enter the question, and all possible answer, and the correct answer
	    q3 = new Questions();
	    q3.setQ(3, "What type of volcano is Mt. Shasta?");
	    q3.setO(1, "Shield volcano");
	    q3.setO(2, "Stratovolcano");
	    q3.setO(3, "Pyroclastic cone");
	    q3.setO(4, "Pyroclastic shield");
	    q3.setAnswer(2);

	    // Question 4. Enter the question, and all possible answer, and the correct answer
	    q4 = new Questions();
	    q4.setQ(4, "When did Mt. Shasta last erupt?");
	    q4.setO(1, "1902");
	    q4.setO(2, "1786");
	    q4.setO(3, "1593");
	    q4.setO(4, "1894");
	    q4.setAnswer(2);

	    // Question 5. Enter the question, and all possible answer, and the correct answer
	    q5 = new Questions();
	    q5.setQ(5, "What year was Mt. Shasta designated a US national natural landmark?");
	    q5.setO(1, "1938");
	    q5.setO(2, "1952");
	    q5.setO(3, "1898");
	    q5.setO(4, "1976");
	    q5.setAnswer(4);
	   
	    // Set object variable equal to the first question
	    question = q1;
	    
	    // Loop 5 times for all five questions, incrementing the gNum var to move to the next question.
	    while(qNum<=5) {
	    	((Questions) question).showQ(qNum);
	    	System.out.println("\nEnter 1, 2, 3, or 4 -> ");
	    	int userAnswer = scan.nextInt();
	    	
	    	// If correct, increment the score, and display Correct!
	    	if(((Questions) question).getAnswer()==userAnswer) {
	    		score++;
	    		System.out.println("Correct!\n");
	    	}
	    	// If incorrect display Nope!
	    	else{
	    		System.out.println("Nope!\n");
	    	}
	    	// increment qNum
	    	qNum++;
	    	// Change the reference of the object in the question var to move on to the next question, based on qNum
	    	if(qNum == 2) {
	    		question = q2;
	    	}
	    	// Change the reference of the object in the question var to move on to the next question, based on qNum
	    	if(qNum == 3) {
	    		question = q3;
	    	}
	    	// Change the reference of the object in the question var to move on to the next question, based on qNum
	    	if(qNum == 4) {
	    		question = q4;
	    	}
	    	// Change the reference of the object in the question var to move on to the next question, based on qNum
	    	if(qNum == 5) {
	    		question = q5;
	    	}
	  
	    }
	    // Print out the score, and close the scanner
	    System.out.println("Your score is: " + score);
	    scan.close();
	}
}
		

