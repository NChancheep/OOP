//Name: Chancheep Mahacharoensuk
//ID: u6288092
//Section: 1
import java.util.ArrayList;

public class SortingMovie 
{

	public static void main(String[] args) {
		ArrayList<Movie> movieList = new ArrayList<Movie>();
		movieList.add(new Movie(1, "The Intern", 2009));
		movieList.add(new Movie(2, "The Gift", 2009));
		movieList.add(new Movie(3, "The Lost Room", 2009));
		movieList.add(new Movie(4, "The Gift", 2012));
		movieList.add(new Movie(5, "Pasolini", 2012));
		movieList.add(new Movie(6, "The Intern", 2009));
		movieList.add(new Movie(7, "American Ultra", 2019));
		movieList.add(new Movie(8, "Sweet Red Bean Paste", 2019));
		
		sort(movieList);
	}
	
	public static void sort (ArrayList<Movie>  movies) 
	{
		// YOUR CODE GOES HERE
		System.out.println("== unsorted movie list ==");
		for(int i=0;i<movies.size();i++)
		{
			System.out.println(movies.get(i).toString());
		}
		Movie swap;
		for(int i=0;i<movies.size();i++)
		{
			swap=null;
			for(int j=i+1;j<movies.size();j++)
			{
				if(movies.get(i).compareTo(movies.get(j))==1)
				{
					swap = movies.get(i);
					movies.set(i, movies.get(j));
					movies.set(j, swap);
				}
			}
		}
		System.out.println("== sorted movie list (ascending) ==");
		for(int i=0;i<movies.size();i++)
		{
			System.out.println(movies.get(i).toString());
		}
	}

}
