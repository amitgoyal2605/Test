package com.carematix.test;

import java.io.File;
import java.io.PrintStream;

public class MyClass {
	
	int ID ;
	int QUESTION_ID;
	int ANSWER_ID;
	String NEXT_QUESTION_ID;
	int SCORE;
	static PrintStream printStream = null;	
	static int id = 3000;//startId	
	
	public void myMethod(int questionId,int startAnswerID, int nextQId, int lastAnswerId) {
		
		if(nextQId > 0) {
			this.NEXT_QUESTION_ID = String.valueOf(nextQId);
		} else {
			this.NEXT_QUESTION_ID = "NULL";
		}
		
		int score = 0;
		
		for (int answerID = startAnswerID; answerID <= lastAnswerId; answerID += 5) {
			
			printStream.println("INSERT INTO SRV_QUESTION_ANSWERS (ID, QUESTION_ID, ANSWER_ID, NEXT_QUESTION_ID, SCORE) values ("+ id + ", "+ questionId+ ", "+ answerID+ ", " + NEXT_QUESTION_ID + ", " + score + ")");
			printStream.println("/");
			id += 5;
			score++;
		}
	}

	public static void main(String args[]) {
		try {
			MutabilityTest t = new MutabilityTest();
			

			MyClass class1 = new MyClass();
			
			printStream = new PrintStream(new File("D:/SRV_QUESTION_ANSWERS.sql"));			
			
			int [] questionIds =     {145,  150, 155, 160, 165, 170, 175, 180, 185, 190, 320,  325,  330,  335,  340,  345};			
			int [] nextQuestionIds = {0,    155, 160, 165, 170, 175, 180, 185, 190, 0,   325,  0,    335,  340,  345,  0  };			
			int [] firstAnswerIds =  {500,  550, 550, 550, 550, 550, 550, 550, 550, 550, 500,  500,  500,  500,  500,  500};			
			int [] lastAnswerIds =   {1000, 850, 850, 850, 850, 850, 850, 850, 850, 850, 1000, 1000, 1000, 1000, 1000, 1000};			
			
			//int questionId = 145;
			int firstAnswerId = 500;// 1 is 550
			int lastAnswerId = 1000;//7 is 850			
			int nextQId = 155;
			
			for(int i = 0; i < questionIds.length; i++) {
				class1.myMethod(questionIds[i], firstAnswerIds[i], nextQuestionIds[i], lastAnswerIds[i]);				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}


