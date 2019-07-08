import java.util.*;
import java.io.*;
public class LoadData implements Serializable
{
	public void load(){
		try(ObjectInputStream oos=new ObjectInputStream(new FileInputStream("data.txt")))
		{
			ArrayList <Student> l2=(ArrayList <Student>) oos.readObject();
			System.out.println("Data is Loaded");
			System.out.println("Do you want to look at data in file: yes/no");
			Scanner input=new Scanner(System.in);
			String str=input.next();
			if(str.equals("yes"))
			{
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
			}
			
		}
		catch(Exception l) {
			l.printStackTrace();
		}
	}
}