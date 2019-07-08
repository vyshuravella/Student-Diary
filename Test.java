import java.util.ArrayList;
public class Test
{
	public void reInitialise() {
		SaveData sd=new SaveData();
		CreateData cd=new CreateData();
		cd.create();
		ArrayList <Student> l2=cd.getAllStudents();
		sd.save(l2);
		LoadData ld=new LoadData();
		ld.load();
	}
}	
