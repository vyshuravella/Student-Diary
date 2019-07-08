import java.io.*;
import java.util.*;
public class Course implements Serializable
{
	private String name;
	private int credits;
	public Course(String n,int r)
	{
		name=n;
		credits=r;
	}
	public String getName()
	{
		return name;
	}
	public int getCredits()
	{
		return credits;
	}
}