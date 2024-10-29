package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import exceptions.InvaliIdException;
import exceptions.InvalidNameExce;

public class College {
	Scanner sc=new Scanner(System.in);
	private student s;
	
	private ArrayList<student> st=new ArrayList<student>();
	
	//adding 
	public void add(student s)
	{
		st.add(s);
		System.out.println("Student details added Successfully...!");
	}
	//display
	public void studentDisplay()
	{
		if(st.isEmpty())
		{
			System.out.println("currently there are no student details in our data base to display");
		}
		else
		{
			for(student s:st)
			{
				s.display();
			}
		}
	}
	//display name based on id
	public void displayNameBasedOnId(int id)
	{
		boolean isFound=false;
		if(st.isEmpty())
		{
			System.out.println("currently there are no student details in our data base to display");
		}
		else
		{
			for(student s:st)
			{
				if(s.getId()==id)
				{
					System.out.println("Name : "+s.getName());
					isFound=true;
				}
			}
		}
		if(!isFound)
		{
			throw new InvaliIdException();
		}
	}
	//update email based on name
	public void updateEmailBasedOnName(String s1)
	{
		boolean isFound=false;
		if(st.isEmpty())
		{
			System.out.println("currently there are no student details in our data base to display");
		}
		else
		{
			for(student s:st)
			{
				if(s.getName().equals(s1))
				{
					s.setEmail(sc.next());
					isFound=true;
				}
			}
		}
		if(!isFound)
		{
			throw new InvalidNameExce();
		}
	}
	//remove student based on id
	public void removeStudentBasedOnId(int id)
	{
		boolean isFound=false;
		if(st.isEmpty())
		{
			System.out.println("currently there are no student details in our data base to display");
		}
		else
		{
			Iterator<student> itr=st.iterator();
			while(itr.hasNext())
			{
				student s=itr.next();
				if(s.getId()==id)
				{
					itr.remove();
					isFound=true;
					System.out.println("removed succesfully");
					s.display();
				}
			}
		}
		if(!isFound)
		{
			throw new InvaliIdException();
		}
		
	}
	
	
}
