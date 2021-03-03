// Name:Chancheep Mahacharoensuk	
// ID:u6288092
import java.lang.Math;
public class Song {
	private String title;
	private double duration;
	
	public Song(String title, double duration) {
		this.title=title;
		this.duration=duration;
	}
	
	public String getTitle() {
		return title;
	}
	
	public double getDuration() {
		return duration;
	}
	
	public int getDurationInSec() {
		double decimal = (this.duration - (int) this.duration) * 100;
		int realDecimal = (int)Math.round(decimal);
		return ((int) this.duration * 60) + realDecimal;
	}
	
	public String toString() {
		return this.title + ", " + this.duration + " minutes" + " (" + this.getDurationInSec() + " seconds)";
	}
}
