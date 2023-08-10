package InMemoryStore;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Recentsongplayed {
	final int initialcapacity;
	Map<User, List<Song>> store;

	public Recentsongplayed(int initialcapacity) {
		this.initialcapacity = initialcapacity;
		this.store = new LinkedHashMap<>();
	}

	public void Songplayed(User username, Song songname) {
		List<Song> songs = store.get(username);
		if (songs == null) {
			songs = new LinkedList<>();
			store.put(username, songs);
		}
		if (songs.size() >= initialcapacity) {
			songs.remove(songs.size() - 1);
		}
		songs.add(0, songname);
	}

	public List<Song> getsong(User user) {
		List<Song> songs = store.get(user);
		if (songs == null) {
			return new LinkedList<>();
		}
		return songs;
	}
}
