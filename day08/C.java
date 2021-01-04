class Account { //Black Box Model 
    private String ssn = "111111-1111111";
	private long balance = 10000L;	

	String getSsn(){
		return ssn;
	}
    long getBalance(){
		return balance;
	}
	/*void setSsn(String ssn){
		this.ssn = ssn;
	}*/
	void setBalance(long balance){
		this.balance = balance;
	}
}
class Banker
{
	public static void main(String args[]){
		Account a = new Account();
        System.out.println("(1) Account: 정보에 접근");
		System.out.println("a.ssn: " + a.getSsn());
		System.out.println("a.balance: " + a.getBalance());

        System.out.println("(2) Account: 정보에 변경");
		//a.setSsn("222222-2222222");
		a.setBalance(-5000L);
        System.out.println("a.ssn: " + a.getSsn());
		System.out.println("a.balance: " + a.getBalance());
	}
}
/*
class Hacker
{
	public static void main(String args[]){
		Account a = new Account();
        System.out.println("(1) Hacker: 정보에 접근");
		System.out.println("a.ssn: " + a.ssn);
		System.out.println("a.balance: " + a.balance);

        System.out.println("(2) Hacker: 정보에 변경");
		a.ssn = "222222-2222222";
		a.balance = -5000L;
        System.out.println("a.ssn: " + a.ssn);
		System.out.println("a.balance: " + a.balance);
	}
}
*/
