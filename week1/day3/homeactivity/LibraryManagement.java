package week1.day3.homeactivity;

public class LibraryManagement {

	public static void main(String[] args) {
		Library books = new Library();
		System.out.println("Calling Library Class From Library Management");
		String issuedBook=books.addBook("The hungry Fox");
		System.out.println("The Issued is : "+ issuedBook);
		books.issueBook();
	}

}