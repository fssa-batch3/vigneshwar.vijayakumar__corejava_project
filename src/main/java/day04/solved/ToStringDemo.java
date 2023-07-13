package day04.solved;

public class ToStringDemo {

	public static void main(String[] args) {
		
		Account3 acct1 = new Account3();
		acct1.setAccNo("A101");
		acct1.setName("Naresh");
		acct1.setBalance(1000);
		
		System.out.println(acct1);
		
		Account3ToString acct2 = new Account3ToString();
		acct2.setAccNo("A101");
		acct2.setName("Naresh");
		acct2.setBalance(1000);
		
		System.out.println(acct2.toString());
	}
}