package InMemoryStore;

public class User {
	String username;

	public User(String username) {
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	@Override
	public String toString() {
		return username;
	}
}
