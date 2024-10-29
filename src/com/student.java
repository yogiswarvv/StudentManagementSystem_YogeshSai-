package com;

import java.util.Random;

import exceptions.AgeException;
import exceptions.EmailException;
import exceptions.StreamException;
import exceptions.nameexception;

public class student {
	
	private String name;
	private int id;
	private int age;
	private String stream;
	private String email;
	public student(String name, int age, String stream, String email) {
		Random r=new Random();
		if(validateName(name))
		{
			this.name = name;
		}
		else
		{
			throw new nameexception();
		}
		
		this.id = r.nextInt(12345);
		if(validateAge(age))
		{
			this.age = age;
		}
		else
		{
			throw new AgeException();
		}
		if(validateStream(stream))
		{
			this.stream = stream;
		}
		else
		{
			throw new StreamException();
		}
		if(validateEmail(email))
		{
			this.email = email;
		}
		else
		{
			throw new EmailException();
		}
		
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	@Override
	public String toString() {
		return "name=" + name + "\n id=" + id + "\n age=" + age + "\n stream=" + stream + "\n email=" + email
				+ "\n -----------------";
	}
	
	public void display()
	{
		System.out.println("Name : "+getName());
		System.out.println("Id : "+getId());
		System.out.println("Age : "+getAge());
		System.out.println("Stream : "+getStream());
		System.out.println("Email : "+getEmail());
	}
	
	
	public boolean validateName(String s)
	{
		if(s.charAt(0)>='A' && s.charAt(0)<='Z')
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean validateAge(int n)
	{
		if(n>=18 && n<=22)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean validateStream(String s)
	{
		if(s.equalsIgnoreCase("CSE") || s.equalsIgnoreCase("ECE") || s.equalsIgnoreCase("EEE"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean containsDigit(String s)
	{
		for(char c:s.toCharArray())
		{
			if(Character.isDigit(c))
			{
				return true;
			}
		}
		return false;
	}
	public boolean notCapsInEmail(String s)
	{
		for(char c:s.toCharArray())
		{
			if(c>='A' && c<='Z')
			{
				return false;
			}
		}
		return true;
	}
	public boolean validateEmail(String s)
	{
		if(s.contains("@") && s.endsWith("gmail.com") && containsDigit(s) && s.indexOf('@')>0 && s.indexOf('@')<s.length()-1 && notCapsInEmail(s)) {
			return true;
		}
		return false;
	}
	
	
	
	
}
