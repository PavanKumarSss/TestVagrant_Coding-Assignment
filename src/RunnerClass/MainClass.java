package RunnerClass;

import InMemoryStore.Recentsongplayed;
import InMemoryStore.Song;
import InMemoryStore.User;

public class MainClass {
	public static void main(String[] args) {
		Recentsongplayed store = new Recentsongplayed(3);
		User user = new User("Ram");
		Song song1 = new Song("Song A");
		Song song2 = new Song("Song B");
		Song song3 = new Song("Song C");
		Song song4 = new Song("Song D");

		store.Songplayed(user, song1);
		System.out.println("1st time songs played by " + user + " is " + store.getsong(user).toString());
		store.Songplayed(user, song2);
		System.out.println("2nd time songs played by " + user + " is " + store.getsong(user).toString());
		store.Songplayed(user, song3);
		System.out.println("3rd time songs played by " + user + " is " + store.getsong(user).toString());
		store.Songplayed(user, song4);
		System.out.println("The recent songs played by " + user + " is " + store.getsong(user).toString());
	}
}
