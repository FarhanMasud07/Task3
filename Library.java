package SELISE;

public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book PP = new Book("Pride and Prejuidice","Jane Austen");
		Book H = new Book("Hamlet","William Shakespear");
		Book WP = new Book("War and Peace","Leo Tolstoy");

		System.out.println(PP.Title);
		System.out.println(PP.Author);
		System.out.println("Title: "+ PP.getTitle());
		System.out.println("Author: "+PP.getAuthor());
		
		System.out.println("\n");
		
		System.out.println(H.Title);
		System.out.println(H.Author);
		System.out.println("Title: "+ H.getTitle());
		System.out.println("Author: "+H.getAuthor());
		
		System.out.println("\n");
		
		System.out.println(WP.Title);
		System.out.println(WP.Author);
		System.out.println("Title: "+ WP.getTitle());
		System.out.println("Author: "+WP.getAuthor());
	}

}
