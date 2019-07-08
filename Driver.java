import java.util.*;
import java.io.*;
public class Driver
{
	public static void clearScreen()
	{
    	System.out.print("\033[H\033[2J");  
		System.out.flush();  
   	}
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		while(true)
		{
			 clearScreen();
			System.out.println("");
			System.out.println("Hello,What do you want to see or do?");
			System.out.println("");
			System.out.println("1.Get Student Details present in the file intitally");
			System.out.println("2.Add a new Student Details");
			System.out.println("3.Get details of a particular student");
			System.out.println("4.Student Personal Details");
			System.out.println("5.Workshop Details");
			System.out.println("6.Clear Data in file");
			System.out.println("7.ReInitialise Details");
			System.out.println("0.Exit");
			System.out.println("");
			System.out.println("");
			System.out.print("Your Choice ? ");
			int n=input.nextInt();
			switch(n)
			{
				case 1:
				{
					StudentDetails sd=new StudentDetails();
					sd.getStudentDetails();
					break;
				}
				case 2:
				{
					AddNewStudentToList ans=new AddNewStudentToList();
					ans.add();					
					break;
				}
				case 3:
				{
					System.out.println("Enter name of student : ");
					String name=input.next();
					StudentDetails sd1=new StudentDetails();
					sd1.getOneStudentDetails(name);
					break;
				}
				case 4:
				{
					StudentPersonalDetails spd=new StudentPersonalDetails();
					spd.getPersonalDetails();
					break;
				}
				case 5:
				{
					StudentDetails sd=new StudentDetails();
					sd.getWorkshopDetails();
					break;
				}
				case 6:
				{
					ClearAllData cad=new ClearAllData();
					cad.clear();
					break;
				}
				case 7:
				{
					Test t=new Test();
					t.reInitialise();
					break;
				}
				case 0:
				{
					System.exit(0);
				}
			}
		}
	}
}