package day10.practice;

/**
 * Maintain an ArrayList<User> to store list of existing Users. 
 * class User {
	int id;
	String name;
	String emailId;
   }
   
 * Write a register(User user) throws UserAlreadyExistsException method which throws 
 * UserAlreadyExistsException if there is a user with user.emailID is already present in the ArrayList<User>.
 */

import java.util.ArrayList;

class UserAlreadyExistsException extends Exception {

	private static final long serialVersionUID = -8105491977357554060L;

	public UserAlreadyExistsException(String msg) {
		super(msg);
	}

	public UserAlreadyExistsException(Throwable te) {
		super(te);
	}

	public UserAlreadyExistsException(String msg, Throwable te) {
		super(msg, te);
	}
}

class User {

	private int id;
	private String name;
	private String emailId;

	public User(String name, String emailId, int id) {
		this.name = name;
		this.emailId = emailId;
		this.id = id;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", emailId=" + emailId + "]";
	}


}

class UserValidator {
	static ArrayList<User> arr = new ArrayList<User>();
	public static boolean register(User user) throws UserAlreadyExistsException {
		if (user == null) {
			throw new UserAlreadyExistsException("User Object Cannot be Null");
		}

		for (User element : arr) {
			if (element.getEmailId() == user.getEmailId()) {
				throw new UserAlreadyExistsException("User already added");
			}
		}

		arr.add(user);
		System.out.println("User added: " + user.toString());
		return true;
	}
}

public class UserApp{

	public static void main(String[] args) {
		try {
			User user1 = new User("Vignesh", "vv@gmail.com", 1);
			User user2 = new User("Karan", "karan@gmail.com", 2);
			User user3 = new User("Vignesh", "vv@gmail.com", 1);

			UserValidator.register(user1); 
			UserValidator.register(user2); 
			UserValidator.register(user3); 
		} catch (UserAlreadyExistsException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}