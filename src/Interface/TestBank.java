package Interface;

public class TestBank {

	public static void main(String[] args) {
		
	System.out.println(UsBankInterface.min_bal);
	UsBankInterface.min_bal=200//once defined cant be changed
		HscbcBank bank=new HscbcBank();
		bank.credit();
		bank.debit();
		//the above 3 are compile time ploymorphism
		//above 3 are overridden methods
		bank.transferMoney();
		bank.educationLoan();
		bank.carLoan();
		
		
		//dynamic polymorphism
		//child class object can be refereed by parent interface var
		UsBankInterface us=new HscbcBank();
        us.credit();
        us.debit();
        us.transferMoney();
        us.educationloan()//cant be accessed as this is a child class method
        //only and only overridden methods will be called
	}

}
