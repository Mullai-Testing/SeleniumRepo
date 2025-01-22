package week1.day3.homeactivity;

public class Library {
	public String addBook(String bookTitle) {
		System.out.println("Book added successfully" );
		return bookTitle;
	}

	public void issueBook() {
		System.out.println( "Book issued successfully");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library books = new Library();
		String bookIssued = books.addBook("Little Angel");
		System.out.println("the book issued is : " + bookIssued);
		books.issueBook();

	}

}