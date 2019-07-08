import java.io.*;
import java.util.*;
public class StudentDetails
{
	public void getStudentDetails()
	{
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("data.txt")))
		{
			ArrayList <Student> l2=new ArrayList <Student>();
			l2=(ArrayList <Student>)ois.readObject();
			for(int i=0;i<l2.size();i++)	
				{
					System.out.println("Student Name : "+l2.get(i).getName());
					System.out.println("RollNo	: "+l2.get(i).getRollNo());
					System.out.println();
					for(int j=0;j<l2.get(i).getStudentCourses().size();j++)
						System.out.println(" 		Course Name : "+l2.get(i).getStudentCourses().get(j).getName()+"	 Course Credit : "+l2.get(i).getStudentCourses().get(j).getCredits());
					System.out.println();
					for(int k=0;k<l2.get(i).getStudentWorkshops().size();k++)
						System.out.println("		WorkshopName : "+l2.get(i).getStudentWorkshops().get(k).getName()+"	GraceMark : "+l2.get(i).getStudentWorkshops().get(k).getGraceMark());
					System.out.println();
				}
			
			SaveData sd= new SaveData();
			sd.save(l2);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void getOneStudentDetails(String str)
	{
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("data.txt")))
		{
			ArrayList <Student> l2=new ArrayList <Student>();
			l2=(ArrayList <Student>)ois.readObject();
			for(int i=0;i<l2.size();i++)	
			{
				if(l2.get(i).getName().equals(str))
				{
					System.out.println("Student Name : "+l2.get(i).getName());
					System.out.println("RollNo	: "+l2.get(i).getRollNo());					
					System.out.println();
					for(int j=0;j<l2.get(i).getStudentCourses().size();j++)
						System.out.println(" 		Course Name : "+l2.get(i).getStudentCourses().get(j).getName()+"	 Course Credit : "+l2.get(i).getStudentCourses().get(j).getCredits());
					System.out.println();
					for(int k=0;k<l2.get(i).getStudentWorkshops().size();k++)
						System.out.println("		WorkshopName : "+l2.get(i).getStudentWorkshops().get(k).getName()+"	GraceMark : "+l2.get(i).getStudentWorkshops().get(k).getGraceMark());
					System.out.println();
				}
			}
			SaveData sd= new SaveData();
			sd.save(l2);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void getWorkshopDetails()
	{
		System.out.println("General Details of all Workshops/Particular Students Workshops Details(1/2)");
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		switch(a)
		{
			case 1:
			{
				ArrayList <Student> l2=new ArrayList <Student>();
				try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("data.txt")))
				{
					l2=(ArrayList <Student>)ois.readObject();
					for(int i=0;(i==0 && i<l2.size());i++)
					{
						for(int k=0;k<l2.get(i).getStudentWorkshops().size();k++)
							System.out.println("		WorkshopName : "+l2.get(i).getStudentWorkshops().get(k).getName()+"	GraceMark : "+l2.get(i).getStudentWorkshops().get(k).getGraceMark());
						System.out.println();
					}
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
				SaveData sd= new SaveData();
				sd.save(l2);
				break;
			}
			case 2:
			{
				System.out.println("Enter name of student : ");
				String name=in.next();
				try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("data.txt")))
				{
					ArrayList <Student> l2=new ArrayList <Student>();
					l2=(ArrayList <Student>)ois.readObject();
					for(int i=0;i<l2.size();i++)
					{
						if(l2.get(i).getName().equals(name))	
						{
							System.out.println("Student Name : "+l2.get(i).getName());
							System.out.println("RollNo	: "+l2.get(i).getRollNo());
							System.out.println();
							for(int k=0;k<l2.get(i).getStudentWorkshops().size();k++)
								System.out.println("		WorkshopName : "+l2.get(i).getStudentWorkshops().get(k).getName()+"	GraceMark : "+l2.get(i).getStudentWorkshops().get(k).getGraceMark());
							System.out.println();
						}
					}
					SaveData sd= new SaveData();
					sd.save(l2);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
				break;
			}
		}
	}
}