/*
 * Suha Alaqil
 * 9/13/2016
 */
public class CourseManagement {

	public static void main(String[] args) {
		
		Course math98 = new Course("Math98");
		Course math99 = new Course("Math99");
		CreditBearingCourse cs340 = new CreditBearingCourse("CS340", 4);
		CreditBearingCourse cs301 = new CreditBearingCourse("CS301", 3);
		
		String[] math98Lists = {"Mike", "Sara", "Shun", "Mary"};
		for(int i = 0; i < math98Lists.length; i++){
			math98.enroll(math98Lists[i]);
		}
		String[] math99Lists = {"Emme","Ken", "Lee"};
		for(int i = 0; i < math99Lists.length; i++){
			math99.enroll(math99Lists[i]);
		}
		String[] cs340Lists = {"Mike", "Sara", "Shun"};
		for(int i = 0; i < cs340Lists.length; i++){
			cs340.enroll(cs340Lists[i]);
		}
		String[] cs301Lists = {"Tom1", "Tom2", "Tom3", "Tom4","Tom5","Tom6"};
		for(int i = 0; i < cs301Lists.length; i++){
			cs301.enroll(cs301Lists[i]);
		}
		
		Course[] studentsLists = {math98, math99, cs340, cs301};
		for(int i = 0; i < studentsLists.length; i++){
			System.out.println(studentsLists[i]);
		}
	}

}

