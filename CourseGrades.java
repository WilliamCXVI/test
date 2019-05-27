import java.util.ArrayList;
public class CourseGrades implements Analyzable {
	private GradedActivity[] grades = new GradedActivity[4];
	
	public void setLab(GradedActivity object)
	{
		grades[0]=object;
	}
	
	public void setPassFailExam(PassFailExam object)
	{
		grades[1]=object;
	}
	
	public void setEssay(Essay object)
	{
		grades[2]=object;
	}
	
	public void setFinalExam(FinalExam object)
	{
		grades[3]=object;
	}
	public String toString()
	{
		char getLab, getPassFailExam, getEssay, getFinalExam,getAverage;
		double getLabS, getPassFailExamS, getEssayS, getFinalExamS,getAverageS;
		String output,output1,output2,output3,output4,output5,output6,output7,output8;
		getLab=grades[0].getGrade();
		getLabS=grades[0].getScore();
		getPassFailExam=grades[1].getGrade();
		getPassFailExamS=grades[1].getScore();
		getEssay=grades[2].getGrade();
		getEssayS=grades[2].getScore();
		getFinalExam=grades[3].getGrade();
		getFinalExamS=grades[3].getScore();
		
		GradedActivity averageObject=new GradedActivity();
		averageObject.setScore(getAverage());
		getAverageS=averageObject.getScore();
		getAverage=averageObject.getGrade();
		
		ArrayList<GradedActivity> hObjects=getHighest();
		String aString="",aStringS = "";
		for(int a = 0; a<hObjects.size(); a++)
		{
			aStringS=aStringS+" "+String.valueOf(hObjects.get(a).getScore());
			aString=aString+" "+String.valueOf(hObjects.get(a).getGrade());
		}
		
		ArrayList<GradedActivity> lObjects=getLowest();
		String bString="",bStringS = "";
		for(int b = 0; b<lObjects.size(); b++)
		{
			bStringS=bStringS+" "+String.valueOf(lObjects.get(b).getScore());
			bString=bString+" "+String.valueOf(lObjects.get(b).getGrade());
		}
		
		output1 = "Lab::                      score: "+getLabS+", grade: "+getLab+"\n";
		output2 = "Pass or Fail Exam::        score: "+getPassFailExamS+", grade: "+getPassFailExam+"\n";
		output3 = "Essay::                    score: "+getEssayS+", grade: "+getEssay+"\n";
		output4 = "Final Exam::               score: "+getFinalExamS+", grade: "+getFinalExam+"\n";
		output5 = ""+"\n";
		output6 = "Average Grade::            score: "+getAverageS+", grade: "+getAverage+"\n";
		output7 = "Highest Grade(s)::         score(s): "+aStringS+", grade(s): "+aString+"\n";
		output8 = "Lowest Grade(s)::          score(s): "+bStringS+", grade(s): "+bString+"\n";
		output=output1+output2+output3+output4+output5+output6+output7+output8;
		return output;
	}

	@Override
	public double getAverage() {
		double total = 0;
		double average;
		for(GradedActivity i : grades)
		{
			total = total+i.getScore();
		}
		average=total/grades.length;
		return average;
	}

	@Override
	public ArrayList<GradedActivity> getHighest() {
		double highest=0;
		ArrayList<GradedActivity> objects = new ArrayList<GradedActivity>();
		for(int i=0; i<grades.length; i++)
		{
			if(grades[i].getScore()>=highest)
			{
				if(grades[i].getScore()!=highest)
				{
					objects.clear();
				}
				highest=grades[i].getScore();
				objects.add(grades[i]);
			}
		}
		
		return objects;
	}

	@Override
	public ArrayList<GradedActivity> getLowest() {
		double lowest=100;
		ArrayList<GradedActivity> objects = new ArrayList<GradedActivity>();
		for(int i=0; i<grades.length; i++)
		{
			if(grades[i].getScore()<=lowest)
			{
				if(grades[i].getScore()!=lowest)
				{
					objects.clear();
				}
				lowest=grades[i].getScore();
				objects.add(grades[i]);
			}
		}
		
		return objects;
	}
}
