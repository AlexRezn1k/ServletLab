package ua.nure.reznik.Lab2;

import java.util.Hashtable;
import java.util.Map;

public class UserManager {
	
	private static final Map<String, User> users = new Hashtable<String, User>();
	
	static {
		users.put("Chainik", new User("ChaiNick", "1234", "lalala@mail.ru", "Chai Nick", Role.USER));
		users.put("Admin", new User("Admin", "0000", "admin@mail.ru", "Reznik Alex", Role.ADMIN));
		users.put("Test", new User("Test", "test", "Test@mail.ru", "Test Testovich", Role.USER));
		users.put("Telegin", new User("Telegin", "1239", "Telega@nure.ua", "Telegin Vladislav", Role.USER));
		users.put("Zimarev", new User("Zimarev", "5639", "Z1mba@mail.ru", "Zimarev Kirill", Role.USER));
		users.put("Sobaka", new User("Sobaka", "gavGav", "rotveiler@bk.ru", "Anton Ivanovich", Role.USER));
	}

	public static User getUser(String login) {
		return users.get(login);
	}
	
	public static Map<String, User> getUsers() {
		return users;
	}
	
	public static boolean isUserPresent(String login) {
		return users.containsKey(login);
	}
	
	public static boolean isPasswordCorrect(String login, String password) {
		return password != null && password.equals(users.get(login).getPassword());
	}

	public static void addUser(String login, String password, String mail, String fullName, Role value) {
		users.put(login, new User(login, password, mail, fullName, value));
	}

	public static void removeUser(String login) {
		users.remove(login);
	}

}