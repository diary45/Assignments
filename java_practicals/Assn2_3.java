public class Assn2_3{
    static double totalcash=0;
	public static void main(String args[]) {

		Savings s=new Savings();
		Current c=new Current();		
		Account a=new Savings();
        a.addamt(20);	
		s.addamt(100);
		c.addamt(100);
		System.out.println(totalcash);
	}
}
abstract class Account{
	double total;
	abstract void addamt(double amt);
	
	
}
class Savings extends Account{
	double fixed_deposits;
    @Override
	void addamt(double fixed_deposits) {
		this.fixed_deposits=fixed_deposits;
        Assn2_3.totalcash+=fixed_deposits;
	}
	 double getamt(){
		return fixed_deposits;
	}
	
}
class Current extends Account{
	double cash_credits;
    @Override
	void addamt(double cash_credits) {
		this.cash_credits=cash_credits;
        Assn2_3.totalcash+=cash_credits;
	}
	double getamt(){
		return cash_credits;
	}
	
}