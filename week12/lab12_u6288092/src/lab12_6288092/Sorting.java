//Name: Chancheep Mahacharoensuk
//ID: u6288092
//Section: 1
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Sorting 
{
	public static ArrayList<String> readMethod(String files)
	{
		File file = new File(files);
		Scanner scanner;
		try {
			scanner = new Scanner(file);
			ArrayList<String> list = new ArrayList<String>();
			
			while (scanner.hasNext()) 
			{
				 list.add(scanner.next());
			}
			scanner.close();
			return list;
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		return null;
	}
	public static void printMethod(ArrayList<String> list)
	{
		System.out.print("[");
		for (int i = 0; i < list.size(); i++) 
		{
			System.out.print(list.get(i));
			if (i < list.size()-1) 
			{
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}
	public static void sortMethod(ArrayList<String> list)
	{
		int x=1;
		System.out.print("Original: ");
		printMethod(list);
		String swap;
		for(int i=0;i<list.size()-1;i++)
		{
			swap=null;
			for(int j=i+1;j<list.size();j++)
			{
				if(list.get(i).compareTo(list.get(j))<0)
				{
					swap = list.get(i);
					list.set(i, list.get(j));
					list.set(j, swap);
				}
			}
			System.out.print("Pass " + x + ": ");
			printMethod(list);
			x++;
		}
	}
	public static void main(String[] args)
	{
		sortMethod(readMethod("unsorted.txt"));
	}
}
