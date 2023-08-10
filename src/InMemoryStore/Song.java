package InMemoryStore;

public class Song {
	String songname;

	public Song(String songname) {
		this.songname = songname;
	}

	public String getName() {
		return songname;
	}

	@Override
	public String toString() {
		return songname;
	}
}
