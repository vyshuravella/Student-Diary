import java.io.*;
import java.util.*;
public class StudentPersonalDetails
{

	public void getPersonalDetails()
	{
		System.out.println("Are you a Student ? yes/no");
		Scanner input=new Scanner(System.in);
		String s=input.next();
		ArrayList <Student> als=new ArrayList <Student>();
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("data.txt")))
		{
			als=(ArrayList <Student>)ois.readObject();
			if(s.equals("yes"))
			{
				System.out.println("Do you want to edit (or) enter details(1)");
				System.out.println("Do you want to look at the details(2)");
				int o=input.nextInt();
				switch(o)
				{
					case 1:
					{
						System.out.println("Do you want to edit name?(yes/no)");
						String q1=input.next();
						if(q1.equals("yes"))
						{
							System.out.println("Enter Current name :");
							String n=input.next();
							System.out.println("Enter new name :");
							String str=input.next();
							for(int i=0;i<als.size();i++)
							{
								if(n.equals(als.get(i).getName()))
								{
									als.get(i).setName(str);
								}
							}
						}
						System.out.println("Do you want to edit phn no?(yes/no)");
						String q2=input.next();
						if(q2.equals("yes"))
						{
							System.out.println("Enter your name :");
							String name=input.next();
							System.out.println("Enter new phn no :");
							String p=input.next();
							for(int i=0;i<als.size();i++)
							{
								if(name.equals(als.get(i).getName()))
								{
									als.get(i).setPhnNo(p);
								}
							}

						}	
						System.out.println("Do you want to edit emailId?(yes/no)");
						String q3=input.next();
						if(q3.equals("yes"))
						{
							System.out.println("Enter your name :");
							String name=input.next();
							System.out.println("Enter new emailId :");
							String e=input.next();
							for(int i=0;i<als.size();i++)
							{
								if(name.equals(als.get(i).getName()))
								{
									als.get(i).setEmail(e);
								}
							}
						}
						System.out.println("Do you want to edit dob?(yes/no)");
						String q4=input.next();
						if(q4.equals("yes"))
						{
							System.out.println("Enter your name :");
							String name=input.next();
							System.out.println("Enter new dob :");
							String d=input.next();
							for(int i=0;i<als.size();i++)
							{
								if(name.equals(als.get(i).getName()))
								{
									als.get(i).setDob(d);
								}
							}
						}
						System.out.println("Do you want to edit place?(yes/no)");
						String q5=input.next();
						if(q5.equals("yes"))
						{
							System.out.println("Enter your name :");
							String name=input.next();
							System.out.println("Enter new place :");
							String d=input.next();
							for(int i=0;i<als.size();i++)
							{
								if(name.equals(als.get(i).getName()))
								{
									als.get(i).setPlace(d);
								}
							}
						}
						break;
					}
					case 2:
					{
						System.out.println("Enter name of student details to be viewed");
						String name=input.next();
						for(int i=0;i<als.size();i++)
						{
							if(name.equals(als.get(i).getName()))
							{
								System.out.println("Name :"+als.get(i).getName());
								System.out.println("RollNo :"+als.get(i).getRollNo());
								System.out.println("DateOfBirth :"+als.get(i).getDob());
								System.out.println("Place :"+als.get(i).getPlace());
								System.out.println("Phone number :"+als.get(i).getPhnNo());
								System.out.println("EmailId :"+als.get(i).getEmail());
							}
						}
						break;
					}
				}
			}
			else
			{
				System.out.println("You can only view Data");
				System.out.println("Enter name of student details to be viewed");
				String name=input.next();
				for(int i=0;i<als.size();i++)
				{
					if(name.equals(als.get(i).getName()))
					{
						System.out.println("Name :"+als.get(i).getName());
						System.out.println("RollNo :"+als.get(i).getRollNo());
						System.out.println("DateOfBirth :"+als.get(i).getDob());
						System.out.println("Place :"+als.get(i).getPlace());
						System.out.println("Phone number :"+als.get(i).getPhnNo());
						System.out.println("EmailId :"+als.get(i).getEmail());
					}
				}
			}
			SaveData sd=new SaveData();
			sd.save(als);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}