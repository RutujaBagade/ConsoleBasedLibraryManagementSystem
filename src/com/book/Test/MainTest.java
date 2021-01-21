package com.book.Test;

import java.util.Scanner;

import com.book.BookServiceImpl.LibrarianServiceImpl;

import com.book.IBookService.StudentService;

public class MainTest {

	private static final String String = null;

	public static void main(String[] args) {
		
		System.out.println("********************Library Mangement System********************");
		// TODO Auto-generated method stub
		System.out.println("Log in first ");
		String username;
	    String password;
	    Scanner sc=new Scanner(System.in);
	String student_user;
	    String student_pass;

	    password = "Admin";
	    username = "Librarian";
	    student_user = "student";
	    student_pass = "user";

	    Scanner input1 = new Scanner(System.in);
	    System.out.print("Enter Username : ");
	    String user= input1.next();

	    Scanner input2 = new Scanner(System.in);
	    System.out.print("Enter Password : ");
	    String pass = input2.next();
	    LibrarianServiceImpl librarianServiceImpl=new LibrarianServiceImpl();

	  
	 if ((username.equals(user)) && (password.equals(pass))) 
			 {

			 System.out.println("Login successful");
			 if(username.equals("Librarian"))
			 {
				 System.out.println("You are librarian");
				
					int b=1;
					do
					{
						
								  System.out.println("Enter 0 to Exit Application.");
									System.out.println("Enter 1 to Add new Book.");
									System.out.println("Enter 2 to Display All books");
									System.out.println("Enter 3 to show loaned books");
									System.out.println("Enter Your choice :");
									b=sc.nextInt();
									
										switch(b)
										{
										  case 1:
											  librarianServiceImpl.addBook();
										  break;
										  
										  case 2:
											  librarianServiceImpl.showAllBooks();
								                break;
										  case 3:
											  librarianServiceImpl.checkloanedBooks();
								                break;
								            default:
								                System.out.println("Invalid Choice");
			break;
								        }
					}
					while(b!=0);
					} 
			 }
			 
			 else if( (student_user.equals(user)) && (student_pass .equals(pass))) 
			 {
				 System.out.println("Login successful");
				 if(student_user.equals("student"))
				 {
					 System.out.println("You are Student");
					
						int b=1;
						do
						{
							
									  System.out.println("Enter 0 to Exit Application.");
										System.out.println("Enter 1 to Display All books");
										System.out.println("Enter 2 to search book based On Title");
										System.out.println("Enter 3 to search book based On Author");
										System.out.println("Enter Your choice :");
										b=sc.nextInt();
										
											switch(b)
											{
											  case 1:
												  librarianServiceImpl.showAllBooks();;
											  break;
											  
											  case 2:
												  librarianServiceImpl.searchByBookName();
									                break;
											  case 3:
												  librarianServiceImpl.searchByAuthorName();
									                break;
									            default:
									                System.out.println("Invalid Choice");
				break;
									        }
						}
						while(b!=0);
						} 
				 }
				 
			 
			 else 
			    {
			        System.out.println("Invalid Username & Password!");
			    }
	 }
				
	}

