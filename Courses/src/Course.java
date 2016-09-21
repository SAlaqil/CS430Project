/*
 * Suha Alaqil
 * 9/13/2016
 */
public class Course {
	private String courseName;
	private String [] students;
	private int studentCount;
	private static final int COURSE_ENROLLMENT_LIMIT = 5;
	
	public Course(String theCourseName, String[] theStudents){
		courseName = theCourseName;
		students = theStudents.clone();
		studentCount = theStudents.length; 
	}
	public Course(String courseName){
		this.courseName = courseName;
		students = new String[COURSE_ENROLLMENT_LIMIT];
		studentCount = 0;
	}
	
	public String getCourseName(){
		return courseName;
	}
	public void setCourseName(String courseName){
		this.courseName = courseName;
	}
	public String [] getStudents(){
		String[] studentsCopy = students.clone();
		return studentsCopy;
	}
	
	public void enroll (String studentToEnroll){
		if (studentCount < students.length){
		students [studentCount] = studentToEnroll;
		studentCount++;
		}
		
	}
	public int getStudentCount(){
		return studentCount;
	}	
	private int getIndexOfStudent(String findStudent){
		for(int arrayIndex =0; arrayIndex < getStudentCount(); arrayIndex++){
			
			if(students[arrayIndex].equals(findStudent)){
				return arrayIndex;
			}
		}
		return -1;
	}
	public void dropStudent(String studentToDrop){
		int theIndexToRemove = getIndexOfStudent(studentToDrop);
		if (theIndexToRemove >= 0){
			students[theIndexToRemove] = students[studentCount - 1];
			studentCount--;	
		}
	}
	public void printCourseInfo(){
		System.out.println(this); // this is reference to the object itself
	}
	public String toString(){
		String courseInfo = "";		
		courseInfo += "\n";
		for (int index = 0; index < getStudentCount(); index++){
			if (index < getStudentCount()-1) {
				courseInfo = courseInfo + students[index] + ",";
			}
			else{
				courseInfo = courseInfo + students[index] + ". ";
			}
		}
		courseInfo += "\n" + getClass().getName() + ": " + getCourseName();
		courseInfo += "\nNumber of enrolled students:" + getStudentCount();
		return courseInfo;
	}
			
}

