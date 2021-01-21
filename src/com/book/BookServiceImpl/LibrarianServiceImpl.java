package com.book.BookServiceImpl;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.book.IBookService.LibrarianService;
import com.book.entities.Book;

public class LibrarianServiceImpl implements LibrarianService {
	Scanner sc = new Scanner(System.in);
	 List<Book> book=new LinkedList<Book>();
	 Book b1=new Book(101,"Wings of fire","A.P.G Abdul Kalam",900,500);
	 Book b2=new Book(102,"History Of C","yashwant kanitkar",600,300);
	 Book b3=new Book(103,"Wings of fire","A.P.G Abdul Kalam",900,500);
	 
      
	public void addBook() {
		System.out.println("Enter Book Id:");
	    int bookid = sc.nextInt();
	  
	    System.out.println("Enter Book Name:");
	    String bookName= sc.nextLine();

	    
	    System.out.println("Enter Author Name:");
	    String authorName = sc.nextLine();
	    
	System.out.println("Enter Page no:");
	    int page = sc.nextInt();
	    
	System.out.println("Enter price:");
	    int price = sc.nextInt();
	    book.add(b1);
	      book.add(b2);
	      book.add(b3);
	    Book books=new Book(bookid,bookName,authorName,page,price);
	    book.add(books);
	    if(book.size()>=2)
	    {
	    	//System.out.println(book);
	    	System.out.println("SUCCESFULLY BOOK ADDED!....");
	    }
	}
	@Override
	public void showAllBooks() {
		// TODO Auto-generated method stub
		 book.add(b1);
	      book.add(b2);
	      book.add(b3);
		for(Book b1:book)
		{
			System.out.println(b1);
		}
	}
	@Override
	public void checkloanedBooks() {
		// TODO Auto-generated method stub
		
	}
	public void searchByBookName() {
		
		 System.out.println("*********SEARCH BY Book NAME*********");
		    
		    System.out.println("Enter Book BookName:");
		    String bookName1 = sc.nextLine();
		    for(Book b1:book)
			{
		    	if(b1.bookName.equals(bookName1))
		    	{
				   System.out.println(b1);
		    	}
			}
	}
	
	public void searchByAuthorName() {
		
		 System.out.println("******SEARCH BY Book  Author NAME***********");
		    
		    System.out.println("Enter Book AuthorName:");
		    String authorName = sc.nextLine();
		   Iterator<Book> itr=book.iterator();
		   while(itr.hasNext())
		   {
			   Book book3=(Book)itr.next();
			   if(book3.authorName.equals(authorName))
			   {
			        System.out.println(book3.bookId);
				   		System.out.println(book3.bookName);
				   	    System.out.println(book3.authorName);
				        System.out.println(book3.page);
				        System.out.println(book3.price);
		   }
	}

	}}

