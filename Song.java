package musicPlayer;

public class Song {

	String title;
	double duration;
	public Song(String name, double duration) {
		super();
		this.title = name;
		this.duration = duration;
	}
	public Song() {
	
	}
	public String getTitle()
	{
		return title;
		
	}
	public double getDuration() {
		return duration;
		
	}
	@Override
	public String toString() {
		return "Song{" +
	              "title=' "+ title + '\''+ ",duration="+duration+'}';
	}
}
