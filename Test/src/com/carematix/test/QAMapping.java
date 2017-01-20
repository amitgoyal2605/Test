package com.carematix.test;

import java.io.File;
import java.io.PrintStream;

public class QAMapping {
	
	int ID ;
	int QUESTION_ID;
	int ANSWER_ID;
	String NEXT_QUESTION_ID;
	int SCORE;
	static PrintStream printStream = null;	
	static int id = 9500;//startId	
	
	public void myMethod(int questionId, int startAnswerID, int nextQId, int noOfAnswers) {
		
		if(nextQId > 0) {
			this.NEXT_QUESTION_ID = String.valueOf(nextQId);
		} else {
			this.NEXT_QUESTION_ID = "NULL";
		}
		
		int score = 0;
		int answerID = startAnswerID;
		
		for(int i = 0; i < noOfAnswers; i++) {
			
			printStream.println("INSERT INTO SRV_QUESTION_ANSWERS (ID, QUESTION_ID, ANSWER_ID, NEXT_QUESTION_ID, SCORE) values ("+ id + ", "+ questionId+ ", "+ answerID+ ", " + NEXT_QUESTION_ID + ", " + score + ")");
			printStream.println("/");
			id += 5;
			score++;
			answerID += 5;
		}
	}
	
	/*public static void main(String args[]) {
		int questionId = 595;
		
		while(questionId != 840) {
			System.out.print(questionId+", ");
			questionId += 5;
		}
		
	}*/
	

	public static void main(String args[]) {
		try {

			QAMapping class1 = new QAMapping();
			
			printStream = new PrintStream(new File("D:/SRV_QUESTION_ANSWERS.sql"));			
			
			int [] questionIds =     {595, 600, 605, 610, 615, 620, 625, 630, 635, 640, 645, 650, 655, 660, 665, 670, 675, 680, 685, 690, 695, 700, 705, 710, 715, 720, 725, 730, 735, 740, 745, 750, 755, 760, 765, 770, 775, 780, 785, 790, 795, 800, 805, 810, 815, 820, 825, 830, 835 };			
			int [] nextQuestionIds = {600, 605, 610, 615, 620, 625, 630, 635, 640, 645, 650, 655, 660, 665, 670, 675, 680, 685, 690, 695, 700, 705, 710, 715, 720, 725, 730, 735, 740, 745, 750, 755, 760, 765, 770, 775, 780, 785, 790, 795, 800, 805, 810, 815, 820, 825, 830, 835, 0 };			
			int [] noOfAnswers =  {5,5,5,5,5,6,6,6,6,5,5,6,6,6,5,5,5,5,5,5,5,5,5,5,5,5,6,5,5,5,5,5,5,5,5,5,5,5,5,6,6,6,5,5,6,6,6,6,6};			
			int [] lastAnswerIds =   {1000, 850, 850, 850, 850, 850, 850, 850, 850, 850, 1000, 1000, 1000, 1000, 1000, 1000};			
			int [] scores = {0,1,2,3,4,5};
			//int questionId = 145;
			int firstAnswerId = 410;
			int lastAnswerId = 430;
			int lastAnswerId1 = 435;			
			
			for(int i = 0; i < questionIds.length; i++) {
				class1.myMethod(questionIds[i], firstAnswerId, nextQuestionIds[i], noOfAnswers[i]);				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}


