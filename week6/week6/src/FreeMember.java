//Name:Chancheep Mahacharoensuk
//ID:u6288092
//Section:1
public class FreeMember extends Member
{
	private int FREE_LIMITED_VDOs =3;
	private int numDownloadedVDO =0;
	public FreeMember(String email, String password) 
	{
		super(email, password);
	}
	public boolean addVideo(Video vdo)
	{
		if(getNumVideo() >= FREE_LIMITED_VDOs)
		{
			System.out.println(vdo.toString());
			System.out.println("cannot be downloaded because the number of video is reaching the limit.");
			return false;
		}
		else
		{
			super.addVideo(vdo);
			numDownloadedVDO++;
			return true;
		}
	}
	public boolean removeVideo(Video vdo)
	{
		super.removeVideo(vdo);
		numDownloadedVDO--;
		//System.out.println("is successfully removed.");
		return true;
	}
	public void printMemberInfo()
	{
		System.out.println(" ---- FREE MEMBER ---- ");
		super.printMemberInfo();
	}
	public int getNumVideo()
	{
		return numDownloadedVDO;
		
	}
}