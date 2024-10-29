package com;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		
		College c=new College();
		
		Scanner s=new Scanner(System.in);
		boolean isStart=true;
		while(isStart)
		{
			System.out.println("Enter the choice : \n 1.To Add the student \n 2.Display student details \n 3.Search student name based on Id \n 4.update email based on name \n 5.Remove student details by Id \n 6.Exit");
			int choice=s.nextInt();
			switch(choice)
			{
			case 1:
			{
				//String name, int age, String stream, String email
				System.out.println("Enter the student name");
				String name=s.next();
				System.out.println("Enter the student age");
				int age=s.nextInt();
				System.out.println("Enter the student stream");
				String stream=s.next();
				System.out.println("Enter the student email");
				String email=s.next();
				c.add(new student(name, age, stream, email));
			}
			break;
			case 2:
			{
				c.studentDisplay();
			}
			break;
			case 3:
			{
				System.out.println("Enter the student id to search name");
				int id=s.nextInt();
				c.displayNameBasedOnId(id);
			}
			break;
			case 4:
			{
				System.out.println("Enter the name student email address");
				String email=s.next();
				c.updateEmailBasedOnName(email);
			}
			break;
			case 5:
			{
				System.out.println("Enter the student id to remove the student details");
				int id=s.nextInt();
				c.removeStudentBasedOnId(id);
			}
			break;
			case 6:
			{
				System.out.println("ThankYou...!");
				isStart=false;
			}
			break;
			default : System.out.println("you entered invalid choice");
			}

		}
		
	}

}
