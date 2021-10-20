package Interface;

public class HscbcBank implements UsBankInterface,BrazilBank { //we are acheving multiple inheritance
	//also called as is a relationship means interface to class relationship
	
	//if a class is immplemeting any interface then its mandate to define/override all methods of interface
//overriding from USBANk interface
	public void credit() {
		System.out.println("HSBC--credit");

	}

	public void debit() {
		System.out.println("hsbc---debit");
	}

	public void transferMoney() {
		System.out.println("hsbc----transfermoney");
	}
	
	//All the methods from Interface should be mandatorirly declared in this class.Its mentioned above
	//Additionally this class can have its own methods.Its mentioned below
	//seperate method of HSBC class
	public void educationLoan(){
		System.out.println("HSBC----educationLoan");
	}
	public void carLoan(){
		System.out.println("HSBC----Car Loan");
	}
	//brazil bank method:overring from Brazil bank
	public void mf(){
		System.out.println("HSBC----mutual fund");
	}
}
