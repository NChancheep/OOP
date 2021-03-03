import java.util.ArrayList;

// Name:Chancheep Mahacharoensuk	
// ID:u6288092

public class Playlist {

	private String name;
	private int duration;
	private ArrayList<Song> songs;
	
	
	public Playlist(String name) {
		this.name = name;
		this.songs = new ArrayList();
	}
	
	public void addSong(Song aSong) {
		this.songs.add(aSong);
		this.duration = getPlaylistDuration();
	}
	
	public void addSongAtIndex(Song aSong, int index) {
		if(this.songs.size() <= index)
		{
			 System.out.println("Error: Couldn't add song at index " + index);
		}
		else
		{
			this.songs.add(index, aSong);
			this.duration = getPlaylistDuration();
		}
	}
	
	public boolean removeSongByIndex(int index) {
		 if(index > songs.size()-1)
	        {
	            System.out.println("Error: The index is invalid");
	            return false;
	        }
	        else
	        {
	        	this.songs.remove(index);
	        	this.duration = getPlaylistDuration();
	        	return true;
	   	    }
	}	
	
	public boolean removeSongByTitle(String title) {
		boolean boo = false;
		for(int i = 0;i<this.songs.size();i++)
		{
			Song a = songs.get(i);
			if(a.getTitle().equals(title))
			{
				songs.remove(i);
				boo = true;
				this.duration = getPlaylistDuration();
				break;
			}
		}
		if(boo == true)
		{
			return boo;
		}
		else
		{
			System.out.println("Error: The title is not found");
			return boo;
		}
	}
	
	public void moveUp(int current) {
		Song swap = this.songs.get(current-1);
		this.songs.set(current-1, songs.get(current));
		this.songs.set(current, swap);
	}	
	
	public void moveDown(int current) {
		Song swap = this.songs.get(current+1);
		this.songs.set(current+1, songs.get(current));
		this.songs.set(current, swap);
	}	
	
	public int getPlaylistDuration() {
		this.duration = 0;
        for(int i = 0;i<this.songs.size();i++)
        {
        	Song a = songs.get(i);
            this.duration += a.getDurationInSec();
        }
        return this.duration;
	}	
	
	public void showPlaylist() {
        System.out.println(this.name);
        for(int i = 0;i<this.songs.size();i++)
        {
        	Song a = songs.get(i);
            System.out.println("[" + i + "] " + a.toString());
        }
        int minutes = getPlaylistDuration() / 60;
        double totalDuration = minutes + ((double)(getPlaylistDuration()%60)/100);
        System.out.println("Total duration is " + totalDuration + " minutes");
	}
}



