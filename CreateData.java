import java.io.*;
import java.util.*;
public class CreateData implements Serializable
{
	ArrayList <Course> allCourses=new ArrayList <Course>();
	ArrayList <Student> allStudents=new ArrayList <Student>();
	ArrayList <Workshops> allWorkshops=new ArrayList <Workshops>();
	public void create()
	{
		inputCourses();
		inputWorkshops();
		inputStudent();
		inputPersonals();
	}
	public void inputWorkshops()
	{
		allWorkshops.add(0,new Workshops("Ankoha",true,0));
		allWorkshops.add(1,new Workshops("Vidyut",true,0));
		allWorkshops.add(2,new Workshops("Kalotsavam",true,0));
		allWorkshops.add(3,new Workshops("ABC",true,5));
		allWorkshops.add(4,new Workshops("IOT",true,2));
	}
	public void inputCourses()
	{
		allCourses.add(0,new Course("OOPS",3));
		allCourses.add(1,new Course("DSA",4));
		allCourses.add(2,new Course("DCS",3));
		allCourses.add(3,new Course("MATHS",4));
		allCourses.add(4,new Course("PHYSICS",2));
		allCourses.add(5,new Course("CHEMISTRY",2));
		allCourses.add(6,new Course("BOTANY",1));
		allCourses.add(7,new Course("HISTORY",2));
		allCourses.add(8,new Course("GEOLOGY",2));
		allCourses.add(9,new Course("ECONOMY",2));
		allCourses.add(10,new Course("ELECTIVE",1));
	}
	public void inputPersonals()
	{
		allStudents.get(0).setPhnNo("7994137478");
		allStudents.get(0).setEmail("vyshuravella15@gmail.com");
		allStudents.get(0).setDob("15/11/1999");
		allStudents.get(0).setPlace("AndhraPradesh");
		allStudents.get(1).setPhnNo("9063545753");
		allStudents.get(1).setEmail("ravellasaisrija@gmail.com");
		allStudents.get(1).setDob("20/12/2002");
		allStudents.get(1).setPlace("AndhraPradesh");
		allStudents.get(2).setPhnNo("9542334667");
		allStudents.get(2).setEmail("mahimachunchu25@gmail.com");
		allStudents.get(2).setDob("25/7/1999");
		allStudents.get(2).setPlace("AndhraPradesh");
		SaveData sd=new SaveData();
		sd.save(allStudents);
	}
	public void inputStudent()
	{
		ArrayList <Course> studentCourses=new ArrayList <Course>();
		studentCourses.add(allCourses.get(0));
		studentCourses.add(allCourses.get(1));
		studentCourses.add(allCourses.get(3));
		studentCourses.add(allCourses.get(6));
		ArrayList <Workshops> studentWorkshop1=new ArrayList <Workshops>();
		studentWorkshop1.add(allWorkshops.get(0));
		studentWorkshop1.add(allWorkshops.get(4));
		studentWorkshop1.add(allWorkshops.get(3));
		studentWorkshop1.add(allWorkshops.get(2));
		studentWorkshop1.add(allWorkshops.get(1));
		Student s=new Student("Vyshnavi",152,studentCourses,studentWorkshop1);
		allStudents.add(s);
		ArrayList <Course> studentCourses2=new ArrayList <Course>();
		studentCourses2.add(allCourses.get(1));
		studentCourses2.add(allCourses.get(2));
		studentCourses2.add(allCourses.get(5));
		studentCourses2.add(allCourses.get(8));
		ArrayList <Workshops> studentWorkshop2=new ArrayList <Workshops>();
		studentWorkshop2.add(allWorkshops.get(0));
		studentWorkshop2.add(allWorkshops.get(3));
		studentWorkshop2.add(allWorkshops.get(1));
		Student s2=new Student("Srija",148,studentCourses2,studentWorkshop2);
		System.out.println(s2.getPlace());
		allStudents.add(s2);
		ArrayList <Course> studentCourses1=new ArrayList <Course>();
		studentCourses1.add(allCourses.get(9));
		studentCourses1.add(allCourses.get(4));
		studentCourses1.add(allCourses.get(7));
		studentCourses1.add(allCourses.get(10));
		ArrayList <Workshops> studentWorkshop3=new ArrayList <Workshops>();
		studentWorkshop3.add(allWorkshops.get(1));
		studentWorkshop3.add(allWorkshops.get(3));
		studentWorkshop3.add(allWorkshops.get(0));
		Student s1=new Student("Mahima",343,studentCourses1,studentWorkshop3);
		allStudents.add(s1);
	}
	public ArrayList <Student> getAllStudents()
	{
		return allStudents;
	}
	public ArrayList <Course> getAllCourses()
	{
		return allCourses;
	}
	public ArrayList <Workshops> getAllWorkshops()
	{
		return allWorkshops;
	}
}