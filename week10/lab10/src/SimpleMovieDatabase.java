//Name: Chancheep Mahacharoensuk
//ID: u6288092
//Section: 1
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.apache.commons.io.FileUtils;

public class SimpleMovieDatabase {
	public Map<Integer, Movie> movies = null;
	
	public void importMovies(String movieFilename)
	{	//YOUR CODE GOES HERE
		movies = new HashMap<Integer, Movie>();
		File file = new File("D:\\MUICT\\year1\\java\\week10\\lab10\\src\\lab10_movies.txt");
		try 
		{
			List<String> mvList = FileUtils.readLines(file,"UTF-8");
				Pattern pat = Pattern.compile("(\\d+),(.{2,}),(.+(\\|.+)*)");
				for(String read : mvList)
				{
					Matcher mat = pat.matcher(read);
					if(mat.find()==true)
					{
						Movie mv = new Movie(Integer.parseInt(mat.group(1)),mat.group(2));
						for(String readOnlygroup3 : mat.group(3).split("\\|"))
						{
							mv.tags.add(readOnlygroup3);
						}
						movies.put(mv.mid, mv);
					}
				}
			
		}
		catch (IOException ex) 
		{
			ex.printStackTrace();
		}
	}
	
	
	//-------------------BONUS----------------------
	public List<Movie> searchMovies(String query) 
	{
		//YOUR BONUS CODE GOES HERE
		List<Movie> list = new ArrayList<Movie>();
		for(Integer hashKey: movies.keySet()) 
		{
			if(movies.get(hashKey).title.toLowerCase().contains(query.toLowerCase())) 
			{
				list.add(movies.get(hashKey));
			}
		}
		return list;
	}
	
	public List<Movie> getMoviesByTag(String tag)
	{
		//YOUR BONUS CODE GOES HERE
		List<Movie> list = new ArrayList<Movie>();
		for(Integer hashKey: movies.keySet()) 
		{
			if(movies.get(hashKey).tags.contains(tag)) 
			{
				list.add(movies.get(hashKey));
			}
		}
		return list;
	}
	
	
	public static void main(String[] args)
	{
		SimpleMovieDatabase mdb = new SimpleMovieDatabase();
		mdb.importMovies("lab10_movies.txt");
		System.out.println("Done importing "+mdb.movies.size()+" movies");
		int[] mids = new int[]{139747, 141432, 139415, 139620, 141305};
		for(int mid: mids)
		{
			System.out.println("Retrieving movie ID "+mid+": "+mdb.movies.get(mid));
		}
		
		//Uncomment for bonus
		System.out.println("\n////////////////////////// BONUS ///////////////////////////////");
		String[] queries = new String[]{"america", "thai", "thailand"};
		for(String query: queries)
		{
			System.out.println("Results for movies that match: "+query);
			for(Movie m: mdb.searchMovies(query))
			{
				System.out.println("\t"+m);
			}
			System.out.println();
		}
		
		String[] tags = new String[]{"Musical", "Action", "Thriller"};
		for(String tag: tags)
		{
			System.out.println("Results for movies in category: "+tag);
			for(Movie m: mdb.getMoviesByTag(tag))
			{
				System.out.println("\t"+m);
			}
			System.out.println();
		}
		
		
	}

}
