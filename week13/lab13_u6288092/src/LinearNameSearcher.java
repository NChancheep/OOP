//Name: Chancheep Mahacharoensuk
//ID: u6288092
//Section: 1
public class LinearNameSearcher extends NameSearcher
{

	LinearNameSearcher(String filename) {
		super(filename);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String find(String query) {
		// TODO Auto-generated method stub
		int count = 1;
		int check = 0;
		int temp = 0;
		for(int i=0;i<readNames.size();i++)
		{
			if(query.compareToIgnoreCase(readNames.get(i))==0)
			{
				check=1;
				count=i;
				temp=i+1;
			}
		}
		if(check==1)
		{
			number_of_compared=temp;
			return "Found: '"+ query+"' AT_INDEX("+count+")";
		}
		else
		{
			number_of_compared=readNames.size();
			return "Not Found Name: '"+ query+"'";
		}
	}

}
