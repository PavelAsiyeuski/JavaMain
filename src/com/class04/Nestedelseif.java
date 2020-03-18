package com.class04;

public class Nestedelseif {

	public static void main(String[] args) {
		/*if student completed the quiz we will check a score
		*if score >90 - great job
		**if score>80 - well done
		*if score >70 - you couldve done better
		*if student didn't complete the quiz - not good. please do homework
		*/
		boolean quizCompleted=true;
		int score=46;
		
		if (quizCompleted)
		{System.out.println("Let's check your score");}
			if (score>90) {
				System.out.println("Great job, you study a lot");
			}else if (score>80) {
					System.out.println("Well done");
				}else if(score>70) {
					System.out.println("You could have done better");
				}else if (score<70) {
					System.out.println("You failed it");}
			
else {System.out.println("Please do HW online");
}
	}
}
	
