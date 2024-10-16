package musicPlayer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

	private static ArrayList<Album>albums = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Album album = new Album(" Album1","AC/DC");
		album.addSong("TNT", 4.5);
		album.addSong("Highway to hell", 3.5);
		album.addSong("ThunderStruck", 5.0);
		albums.add(album);
		
	album= new Album("Album2","Eminm");
	album.addSong("Rap GOd", 4.5);
	album.addSong("Not Afraid", 3.5);
	album.addSong("Loos yourself", 4.5);
	
	albums.add(album);
	LinkedList<Song> playList_1 = new LinkedList<>();
	
	
	albums.get(0).addToPlayList("TNT", playList_1);
	albums.get(0).addToPlayList("Highway to hell", playList_1);
	albums.get(0).addToPlayList("Rap GOd", playList_1);
	albums.get(0).addToPlayList("Loos yourself", playList_1);

	
play(playList_1);
	}
private static void play(LinkedList<Song>playList) {
	Scanner sc = new Scanner(System.in);
	boolean quit = false;
	boolean forward = true;
	ListIterator<Song> ListIterator =playList.listIterator();
	if(playList.size()== 0) {
		System.out.println("This playlist havev no song");
	}
	else {
System.out.println("Now playing "+ ListIterator.next().toString());
printMenu();
	}
	while(!quit) {
		int action = sc.nextInt();
		
		switch(action) {
		case 0:
			System.out.println("PlayList complete");
			quit = true;
			break;
		case 1:
			if(!forward) {
				if(ListIterator.hasNext()) {
					ListIterator.next();
				}
				forward = true;
				
			}
			if(ListIterator.hasNext()) {
				System.out.println("now playing"+ ListIterator.next().toString());
				

			}
			else {
				System.out.println(" no song avalable");
				forward= false;

			}
			break;
		case 2:
			if(forward) {
			if(ListIterator.hasPrevious()) {
				ListIterator.previous();
				}
			forward = false;
			
			}
			if(ListIterator.hasPrevious()) {
				System.out.println("Now playing"+ListIterator.previous().toString());
				

			}
			else {
				System.out.println("we are the first song");
				forward= false;
				

				
			}
			break;
			
		case 3:
			if(forward) {
				if(ListIterator.hasPrevious()) {
					System.out.println("now playing"+ListIterator.previous().toString());
					forward = false;
					
				

				}
				else {
					System.out.println("We are at the start of the list");
					

				}
			}
			else {
				if(ListIterator.hasNext()) {
					System.out.println("now playing"+ListIterator.next().toString());
				forward= true;
				
				}
				else {
					System.out.println(" we reached to end ");

				}
			}
			break;
		case 4:
			printList(playList);
			break;
		case 5:
printMenu();
break;
		case 6:
			if(playList.size()>0) {
				ListIterator.remove();
				if(ListIterator.hasNext()) {
					System.out.println("Now paying"+ListIterator.next().toString());
					forward= true;
	
				}
				else {
					if(ListIterator.hasPrevious())
					System.out.println("");

				}
			}

		}
		}
}
private static void printMenu() {
	System.out.println("Available options\n press");
	System.out.println("0- to quite\n"+ "1-to play next song\n"+"2- to play previos song\n"+"4-list of all songs\n"+"t - to print all variables\n"+"6-delete all songs");
	
}
private static void printList(LinkedList<Song> playList) {
	Iterator<Song> iterator=playList.iterator();
System.out.println("------------");
while( iterator.hasNext()) {
	System.out.println(iterator.next());
	
}
System.out.println("_______________________");
}
}
