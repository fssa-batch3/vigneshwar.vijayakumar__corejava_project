package day03.practice;

public class UserApp {

	public static void main(String[] args) {

		 User user1 = new User();
		 user1.setName("VV");
	     user1.setEmail("vv@gmail.com");
	     user1.setId(0001);
	     user1.setPassword("vv1234");
	 	 System.out.println("Name = " + user1.getName() + ", Email = " + user1.getEmail() + ", Password = " + user1.getPassword()+ ", ID = " + user1.getId());
	 	
	 	 User user2 = new User(0002, "Thilagan", "thilagan@gmail.com", "Thilagan1234");
	 	 System.out.println("Name = " + user2.getName() + ", Email = " + user2.getEmail() + ", Password = " + user2.getPassword()+ ", ID = " + user2.getId());
	}

}