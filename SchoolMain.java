import java.util.Scanner;
public class SchoolMain {

	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		GradedActivity lab=new GradedActivity();
		PassFailExam PFE=new PassFailExam();
		Essay essay = new Essay();
		FinalExam FE = new FinalExam();
		CourseGrades student1=new CourseGrades();
		double scoreset;
		int mist;
		
		System.out.println("Enter the lab grade");
		scoreset=keyboard.nextDouble();
		lab.setScore(scoreset);
		student1.setLab(lab);
		
		System.out.println("Enter the number of questions missed (out of 10) in the Pass/Fail Exam");
		mist=keyboard.nextInt();
		PFE.setNumMist(mist);
		PFE.setScore();
		student1.setPassFailExam(PFE);
		
		System.out.println("Enter the following essay criteria:: ");
		System.out.println("Grammar: 30 points");
		scoreset=keyboard.nextDouble();
		essay.setGrammar(scoreset);
		System.out.println("Spelling: 20 points");
		scoreset=keyboard.nextDouble();
		essay.setSpelling(scoreset);
		System.out.println("Correct length: 20 points");
		scoreset=keyboard.nextDouble();
		essay.setCorrectLength(scoreset);
		System.out.println("Content: 30 points");
		scoreset=keyboard.nextDouble();
		essay.setContent(scoreset);
		essay.setScore();
		student1.setEssay(essay);
		
		System.out.println("Enter the number of questions missed in the Final Exam");
		mist=keyboard.nextInt();
		FE.setScore(mist);
		student1.setFinalExam(FE);
		
		System.out.println(student1);
	}
}
