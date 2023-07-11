package day02.practice;

public class UserApp {

	public static void main(String[] args) {
		
		User user = new User();
		user.setName("VV");
		user.setId(0001);
		user.setEmail("vv@gmail.com");
		user.setPassword("vv1234");
		
		
		//Create a logger class and utility methods (log, debug , error) and accepts different parameters (Logger class App)
		
		Logger.debug("Debug your code.");
		Logger.info("Information is not valid.");
		Logger.error("Error");
		Logger.debug(401);
		Logger.info(100);
		Logger.error(404);
		
	}
}
