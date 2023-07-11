package day02.practice;

//Create a logger class and utility methods (log, debug , error) and accepts different parameters

public class Logger {

		public static void debug(String msg) {
			System.out.println("Debug: " + msg);
		}

		public static void info(String msg) {
			System.out.println("Info: " + msg);
		}

		public static void error(String msg) {
			System.out.println("Error: " + msg);
		}

		public static void debug(int num) {
			System.out.println("Debug: " + num);
		}
		
		public static void info(int num) {
			System.out.println("Info: " + num);
		}
		
		public static void error(int num) {
			System.out.println("Error: " + num);
		}
		
	}

