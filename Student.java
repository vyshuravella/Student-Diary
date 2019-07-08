import java.io.*;	
import java.util.*;
public class Student implements Serializable
{
	private String name;
	private int rollNo;
	private String phnNo;
	private String email;
	private String dob;
	private String place;
	private ArrayList <Course> studentCourses=new ArrayList <Course>();
	private ArrayList <Workshops> studentWorkshops=new ArrayList <Workshops>();
	private LoadData ld=new LoadData();
	private SaveData sd=new SaveData();
	public Student(String n,int r,String p,String mail,String d)
	{
		name=n;
		rollNo=r;
		phnNo=p;email=mail;dob=d;
	}
	public Student(String n,int r,ArrayList <Course> c,ArrayList <Workshops> w)
	{
		name=n;
		rollNo=r;
		studentCourses.addAll(c);
		studentWorkshops.addAll(w);
	}
	public void setPhnNo(String p)
	{phnNo=p;}
	public void setEmail(String s)
	{email=s;}
	public void setDob(String s)
	{dob=s;}
	public void setName(String n)
	{name=n;}
	public void setPlace(String s)
	{place=s;}
	public String getPhnNo()
	{return phnNo;}
	public String getEmail()
	{return email;}
	public String getDob()
	{return dob;}
	public String getPlace()
	{return place;}
	public String getName()
	{
		return name;
	}
	public int getRollNo()
	{
		return rollNo;
	}
	public ArrayList <Course> getStudentCourses()
	{
		return studentCourses;
	}
	public ArrayList <Workshops> getStudentWorkshops()
	{
		return studentWorkshops;
	}
	public String toString()
	{
		return "Student Name "+getName()+" RollNO : "+getRollNo();
	}
}
