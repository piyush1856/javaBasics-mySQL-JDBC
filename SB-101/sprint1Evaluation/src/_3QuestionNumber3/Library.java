package _3QuestionNumber3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
	
	 List<Book> bookList = new ArrayList<>();
	
	public static void main(String[] args) {
		
		Library library = new Library();
		
		//System.out.println(library.bookList);
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("1. Add Book");
			System.out.println("2. Display all book details");
			System.out.println("3. Search book by author");
			System.out.println("4. Search book by ISBN");
			System.out.println("5. Exit");
			
			int choice = sc.nextInt();
			//sc.nextLine();
			
			if(choice == 1) {
				
				System.out.println("Enter the isbn no : ");
				int isbn = sc.nextInt();
				//sc.nextLine();
				System.out.println("Enter the book name : ");
				String name = sc.next();
				System.out.println("Enter the author name : ");
				String author = sc.next();
				
				try {
					library.addBook(new Book(isbn, name, author));
					System.out.println("Book added Successfully");
				}catch(BookException d){
					System.out.println(d.getMessage());
				}
				
			}else if(choice == 2) {
				try {
					List<Book> allBook = library.viewAllBook();
					
					for(Book b: allBook) {
						System.out.println(b);
					}
					
				}catch(BookException d){
					System.out.println(d.getMessage());
				}
			}else if (choice == 3 ) {
				
				System.out.println("Enter the author name : ");
				String author = sc.next();
				
				try {
					List<Book> authorBook = library.viewBooksByauthor(author);
					
					for(Book b : authorBook) {
						System.out.println("ISBN No : " + b.getIsbn());
						System.out.println("Book Name : " + b.getBookName());
						System.out.println("Author Name :" + b.getAuthor());
					}
					
				}catch(BookException d){
					System.out.println(d.getMessage());
				}
			}else if (choice ==4) {
				System.out.println("Enter ISBN No, : ");
				int isbn = sc.nextInt();
				//sc.nextLine();
				
				try {
					
					Book b = library.getBooksByISBN(isbn);
					System.out.println("ISBN No : " + b.getIsbn());
					System.out.println("Book Name : " + b.getBookName());
					System.out.println("Author Name :" + b.getAuthor());
					
				} catch (BookException e) {
					System.out.println(e.getMessage());
				}
				
				
			}else if (choice ==5) {
				break;
			}else {
				System.out.println("Wrong Input ...");
			}
		}
	}
	
	void addBook(Book book) throws BookException {
		if(this.bookList.contains(book)) {
			
			throw new BookException("Book already exists");
		}else {
			this.bookList.add(book);
		}
	 }
	
	
	
	
	List<Book> viewAllBook() throws BookException{
		
		List<Book> allBook = new ArrayList<>();
		
		for(Book b : this.bookList) {
			allBook.add(b);
		}
	
		if(allBook.size() == 0) {
			throw new BookException("No book Found in library");
		}else {
			return allBook;
		}
	}
	
	
	
	
	List<Book> viewBooksByauthor(String author) throws BookException{
		List<Book> authorList = new ArrayList<>();
		
		for(Book auth : this.bookList) {
			if(auth.getAuthor().equals(author)) {
				authorList.add(auth);
			}
		}
		
		if(authorList.size() ==0) {
			throw new BookException(" None of the book published by the author "+ author);
		}else {
			return authorList;
		}
		
	}
	
	Book getBooksByISBN(int isbn) throws BookException {
		
		for(Book auth : this.bookList) {
			if(auth.getIsbn()== isbn) {
				return auth;
			}
		}
		
		throw new BookException("No ISBN found");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	


}




