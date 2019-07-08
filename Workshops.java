import java.io.*;
public class Workshops implements Serializable
{
    private String name;
    private boolean certificate;
    private int gracemarks;
    public Workshops(String n,boolean b,int g)
    {
        name=n;
        certificate=b;
        gracemarks=g;
    }
    public String getName()
    {
        return name;
    }
    public int getGraceMark()
    {
        return gracemarks;
    }
    /*void achievements();
	void remarks();
	void graceMarks();
	void certification();*/
}