package _3QuestionNumber3;

import java.util.Objects;

public class Book {
	private int isbn;
	private String BookName;
	private String author;
	
	
	
	
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", BookName=" + BookName + ", author=" + author + "]";
	}
	
	
	
	
	
	public Book(int isbn, String bookName, String author) {
		super();
		this.isbn = isbn;
		BookName = bookName;
		this.author = author;
	}





	@Override
	public int hashCode() {
		return Objects.hash(BookName, author, isbn);
	}





	@Override
	public boolean equals(Object obj) {
		Book that = (Book) obj;
     
		return this.author == that.author && this.BookName == that.BookName && this.isbn == that.isbn;

    
	}





	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}





	
	
	
}
