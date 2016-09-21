
public class Book {
	private String title;
	private String[] authors;
	
	public Book(String theTitle, String[] theAuthors){
		title = theTitle;
		authors = theAuthors.clone();
	}
	public String getTitle(){
		return title;
	}
	public String[] getAuthors(){
		String[] authorsCopy = authors.clone();
		return authorsCopy;
	}
	
	public void printInfo(){
		String theAuthors = "";
		for(int index = 0; index < authors.length; index++){
			if (index < authors.length -1) {
				theAuthors = theAuthors + authors[index] + ", ";
			}
			else{
				theAuthors = theAuthors + authors[index] + ". ";
			}
		}
		theAuthors += "\n" + title;
		System.out.println(theAuthors);
		
	}
	public String toString(){
		String bookInfo = "";
		for(int index = 0; index < authors.length; index++){
			if (index < authors.length -1) {
				bookInfo = bookInfo + authors[index] + ", ";
			}
			else{
				bookInfo = bookInfo + authors[index] + ". ";
			}
		}
		bookInfo += "\n" + title;
		return bookInfo;
	}
}
