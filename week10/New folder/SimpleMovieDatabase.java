import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.io.FileUtils;

public class SimpleMovieDatabase {
	public Map<Integer, Movie> movies = null;
	
	public void importMovies(String movieFilename)
	{	//YOUR CODE GOES HERE		
		movies = new HashMap<Integer, Movie>();
		
		try (BufferedReader br = new BufferedReader(new FileReader("lab11_movies.txt"))) {
		    String line;
		    while ((line = br.readLine()) != null) {
		       line = line.trim();
		       String[] word = line.split(",");
				if(word.length != 3){ 
					continue;
				}
				Movie mv = new Movie(Integer.parseInt(word[0]), word[1]);
				if(mv.title.trim().isEmpty())
					continue;
				String[] tags = word[2].split("\\|");
				for(String tag:tags){
					mv.tags.add(tag);
				}
				movies.put(mv.mid, mv);
		    }
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
	
	
	//-------------------BONUS----------------------
		public List<Movie> searchMovies(String query) 
		{
			//YOUR BONUS CODE GOES HERE
			List<Movie> search = new ArrayList<Movie>();
			
			for (Movie mv : movies.values()) {
			    if(mv.title.toLowerCase().indexOf(query.toLowerCase())!=-1){
			    		search.add(mv);
			    } 
			    else continue;
			}
			return search;
		}
		
		public List<Movie> getMoviesByTag(String tag) 
		{
			//YOUR BONUS CODE GOES HERE
			List<Movie> tags = new ArrayList<Movie>();
			
			for (Movie mv : movies.values()) {
			    if(mv.tags.toString().toLowerCase().indexOf(tag.toLowerCase())!=-1){
			    		tags.add(mv);
			    }
			    else continue;
			}
			return tags;
		}
	
	public static void main(String[] args)
	{
		SimpleMovieDatabase mdb = new SimpleMovieDatabase();
		mdb.importMovies("lab11_movies.txt");
		System.out.println("Done importing "+mdb.movies.size()+" movies");
		int[] mids = new int[]{139747, 141432, 139415, 139620, 141305};
		for(int mid: mids)
		{
			System.out.println("Retrieving movie ID "+mid+": "+mdb.movies.get(mid));
		}
		

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
