//Name: Chancheep Mahacharoensuk
//ID: u6288092
//Section: 1
import java.util.Collections;
public class BinaryNameSearcher extends NameSearcher
{

	BinaryNameSearcher(String filename) {
		super(filename);
		// TODO Auto-generated constructor stub
	}

	 public void sortWord() 
	 {
		 Collections.sort(readNames);
	 }
	@Override
	public String find(String query) 
	{
		// TODO Auto-generated method stub
		int readNames_mid = 0;
		int readNames_first = 0;
		int readNames_last = readNames.size()-1;
		int check = 0;
		int i = 0;
		int temp = 0;
		while(readNames_first<=readNames_last)
		{
			readNames_mid=(readNames_last+readNames_first)/2;
			if(readNames.get(readNames_mid).compareToIgnoreCase(query)<0)
			{
				readNames_first = readNames_mid+1;
			}
			else if(readNames.get(readNames_mid).compareToIgnoreCase(query)>0)
			{
				readNames_last = readNames_mid-1;
			}
			else if(readNames.get(readNames_mid).compareToIgnoreCase(query)==0)
			{
				check = 1;
				temp = i+1;
				break;
			}
			i++;
		}
		if(check==1)
		{
			number_of_compared=temp;
			return "Found: '"+ query+"' AT_INDEX("+readNames_mid+")";
		}
		else
		{
			temp = i;
			number_of_compared=temp;
			return "Not Found Name: '"+ query+"'";
		}
	}
	
}
