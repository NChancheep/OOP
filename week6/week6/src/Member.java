import java.util.ArrayList;

//Name:Chancheep Mahacharoensuk
//ID:u6288092
//Section:1
public class Member 
{
	private String email;
	private String password;
	private ArrayList<Video> vdoList;

	public Member(String email , String password)
	{
		vdoList = new ArrayList<Video>();
		this.email=email;
		this.password=password;
	}
	public boolean addVideo(Video vdo)
	{
		if(!vdo.getTitle().equals(null))
		{
			this.vdoList.add(vdo);
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean removeVideo(Video vdo)
	{
		for(int i=0;i<this.vdoList.size();i++)
		{
			if(this.vdoList.get(i).equals(vdo))
			{
				this.vdoList.remove(i);
				System.out.println(vdo.toString());
				System.out.println("is successfully removed.");
				return true;
			}
			else
			{
				continue;
			}
		}
		return false;
	}
	public void printMemberInfo()
	{
		System.out.println("Email: "+this.email+" (pwd: "+this.password+")");
		System.out.println("List of Videos");
		for(int i=0;i<this.vdoList.size();i++)
		{
			System.out.println("["+(i+1)+"] Title: "+this.vdoList.get(i).toString());
		}
	}
}
