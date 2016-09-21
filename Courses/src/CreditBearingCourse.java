/*
 * Suha Alaqil
 * 9/20/2016
 */
public class CreditBearingCourse extends Course{
	private int numOfCredits;

	public CreditBearingCourse(String theCourseName, int creditsNum){
		super(theCourseName);
		numOfCredits = creditsNum;
	}
	
	
	public int getNumOfCredits() {
		return numOfCredits;
	}

	public int getTotaGeneratedCredits(){
		return numOfCredits* getStudentCount();
		
	}
	public String toString (){
		String stringRep = "";
		stringRep += super.toString();
		stringRep +="\n";
		stringRep +="Course Credit: " + getNumOfCredits() +"\n";
		stringRep += "the total generated credits: " + getTotaGeneratedCredits() + "\n";
		return stringRep;
	}

}
