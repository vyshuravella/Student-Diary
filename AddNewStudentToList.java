import java.io.*;
import java.util.*;
public class AddNewStudentToList
{
	public void add()
	{
		Scanner in=new Scanner(System.in);
		ArrayList <Student> l2=new ArrayList <Student>();
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("data.txt")))
		{
			l2=(ArrayList <Student>)ois.readObject();
			System.out.println("Enter name of student : ");
			String name=in.next();
			System.out.println("Enter roll no : ");
			int n=in.nextInt();
			System.out.println("Input Courses ");
			System.out.println("Enter no of courses");
			int nc=in.nextInt();
			CreateData cd=new CreateData();
			cd.inputWorkshops();
			cd.inputCourses();
			ArrayList <Course> ac=cd.getAllCourses();
			ArrayList <Course> sac=new ArrayList <Course>();
			for(int i=0;i<nc;i++)
			{
				sac.add(i,ac.get(in.nextInt()));
			}
			System.out.println("Input Workshops ");
			System.out.println("Enter no of Workshops");
			int nw=in.nextInt();
			ArrayList <Workshops> wc=cd.getAllWorkshops();
			ArrayList <Workshops> swc=new ArrayList <Workshops>();
			for(int i=0;i<nw;i++)
			{
				swc.add(i,wc.get(in.nextInt()));
			}
			Student s=new Student(name,n,sac,swc);
			l2.add(s);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		SaveData sd=new SaveData();
		sd.save(l2);
		StudentDetails sd1=new StudentDetails();
		sd1.getStudentDetails();
	}
}