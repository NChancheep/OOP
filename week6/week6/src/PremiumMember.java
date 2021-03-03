import java.util.ArrayList;

//Name:Chancheep Mahacharoensuk
//ID:u6288092
//Section:1

public class PremiumMember extends Member
{
	private double fee;
	private static double Family_FEE = 80.00;
	private ArrayList<String> family;
	public PremiumMember(String email, String password,double fee) 
	{
		super(email, password);
		this.fee=fee;
		family = new ArrayList<String>();
	}
	public void printMemberInfo()
	{
		System.out.println(" ---- Premium MEMBER ---- ");
		System.out.println("Member fee: "+fee);
		super.printMemberInfo();
		System.out.println("---------------------");
		if(!family.isEmpty())
		{
			System.out.println("List of Family");
			for(int i=0;i<this.family.size();i++)
			{
				System.out.println(this.family.get(i)+",");
			}
		}
	}
	public boolean addFamily(String username)
	{
		if(username.equals(null))
		{
			return false;
		}
		else
		{
			if(this.family.size()==2)
			{
				System.out.println("user: "+username+" cannot be added, the Family user is reached the limit");
				return false;
			}
			else
			{
				this.family.add(username);
				//System.out.println(this.family.size());
				System.out.println(username+" is added successfully.");
				return true;
			}
		}
	}
	 public boolean removeFamily(String username)
	 {
		 for(int i=0;i<this.family.size();i++)
		 {
			 if(this.family.get(i).equals(username))
			 {
				 this.family.remove(i);
				 System.out.println(username+" is removed successfully.");
				 return true;
			 }
		 }
		 System.out.println("user: "+username+" does not exits and cannot be removed.");
		 return false;
	 }
	 public double getMonthlyBill()
	 {
		 return Family_FEE+fee;
	 }
}
