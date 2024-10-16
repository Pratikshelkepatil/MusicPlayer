package musicPlayer;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
	private String name;
	private String artist;
	private ArrayList<Song> songs;
	public Album(String name, String artist) {
		this.name=name;
		this.artist= artist;
		this.songs= new ArrayList<Song>();
	}
	public Album() {
		
	}
	public Song findSong(String title) {
		for (Song checkSong:songs){
			if(checkSong.getTitle().equals(title)) return checkSong;
			
		}
		return null;
	}
	public boolean addSong(String title,double duration) {
		if(findSong(title)==null) {
			songs.add(new Song(title,duration));
			System.out.println(title +"Successfully added to list");
			return true;
		}
			else {
				System.out.println("Songs with name " +title+ "already exist in list");
			     return false;
			}
		}
	public boolean addToPlayList(int trackNumber,LinkedList<Song> playList) {
		int index = trackNumber-1;
		if(index>0 && index <=this.songs.size()) {
			playList.add(this.songs.get(index));
			return true;
		}
System.out.println("this album does not have trak"+trackNumber);
return false;	
}
	public boolean addToPlayList( String title,LinkedList<Song> PlayList){
		for(Song checkSong:this.songs) {
			if(checkSong.getTitle().equals(title)) {
				PlayList.add(checkSong);
				return true;
				}
		}
		System.out.println(title+"there is no such song in album");
		return false;
	}
	{
		}
	}


