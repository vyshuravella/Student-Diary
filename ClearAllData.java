import java.io.*;
import java.util.*;
public class ClearAllData
{
	public void clear(){
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("data.txt"));ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("data.txt")))
		{
			ArrayList <Student> l2=(ArrayList <Student>) ois.readObject();
			l2=null;
			oos.writeObject(l2);
			System.out.println("Data cleared");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}