package day02.practice;

/**
 * Create a User class with attribute id, name, password, emailId and create setters and getters for the same. 
 * Please note no attribute should be available publicly they should be only be accessible via the setters and getters.
 * 
 * @author VigneshwarVijayakuma
 *
 */

public class User {

	String name;
	int id;
	String email;
    String password;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
