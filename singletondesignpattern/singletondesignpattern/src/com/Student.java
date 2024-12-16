package com;

public class Student {

	private static Student sobj;
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private Student()
	{
		
	}
	public static synchronized Student getSobj() {
		if(sobj==null)
		{
			sobj=new Student();
		}
		return sobj;
	}
	
	
}
