package SELISE;

public class Book{
	String Title;
	String Author;
	
	Book(String Title,String Author){
		this.Title = Title;
		this.Author = Author;
	}

	public String getTitle() {
		return this.Title;
	}

	public void setTitle(String title) {
		this.Title = title;
	}

	public String getAuthor() {
		return this.Author;
	}

	public void setAuthor(String author) {
		this.Author = author;
	}
	
	 
}

