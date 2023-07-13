package day04.solved;

//With toString method:

public class Account3ToString {

	private String accNo;

	private String name;

	private double balance;

	// Default Constructor
	public Account3ToString() {

	}

	// Creating a Constructor which accepts all the attributes: Constructor
	// Overloading
	public Account3ToString(String accNo, String name, double balance) {
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	@Override
    public String toString() {
        return "Account [accNo=" + accNo + ", name=" + name + ", balance="  + balance + "]";
    }
	
}
