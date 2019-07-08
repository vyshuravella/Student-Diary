import java.util.*;
import java.io.*;
public class SaveData implements Serializable
{
	public void save(ArrayList <Student> s)
	{		
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("data.txt")))
		{
			oos.writeObject(s);
			//System.out.println("Student Data is saved");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}