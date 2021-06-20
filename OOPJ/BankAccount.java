package sachin.ASSign;

import sachin.IO;

/*Lets create a bank account. Create a class named 'BankAccount' with the following data members
1 - Name of depositor
2 - Address of depositor
3 - Type of account
4 - Balance in account
5 - Number of transactions
Class 'BankAccount' has a method for each of the following 1 - Generate a unique account number
for each depositor
For first depositor, account number will be BA1000, for second depositor it will be BA1001 and so on
2 - Display information and balance of depositor
3 - Deposit more amount in balance of any depositor
4 - Withdraw some amount from balance deposited
5 - Change address of depositor
After creating the class, do the following operations
1 - Enter the information (name, address, type of account, balance) of the depositors. Number of
depositors are to be entered by user.
2 - Print the information of any depositor.
3 - Add some amount to the account of any depositor and then display final informaion of that
depositor
4 - Remove some amount from the account of any depositor and then display final informaion of that
depositor
5 - Change the address of any depositor and then display the final information of that depositor
6 - Randomly repeat these processes for some other bank accounts and after that print the total
number of transactions*/
public class BankAccount {
	String name;
	String add;
	String type_acc;
	float bal;
	float transactions;
	BankAccount(){
		
	}
    static void setAccNum()
		{ 
    	     
		}
	   void show(String name,String add,String type_acc,float bal)
	{
    System.out.println("\t\t----//----Your Account Details are as Follows----//----");
	System.out.println("Your Account Number is "+"BA100");
	System.out.println("Name of Account Holder is " + this.name);
	System.out.println("Address of Account Holder is " + this.add);
	System.out.println("Type of Account is " + this.type_acc);
	System.out.println("Balance is " + this.bal);
		
	}
	 public void credit()
	{
		
	}
	static public void debit()
	{
		
	}
	static public void updateAdd()
	{
		
	}

	public static void main(String[] args) {
	BankAccount bc=new BankAccount();
    System.out.println("----//----Please Fill out Following Details for Openinig Account----//--- ");
    String name=IO.getstring("Enter Your name");
     bc.name=name;
    String add=IO.getstring("Enter Your Address");
    bc.add=add;
    String type_acc=IO.getstring("Enter Account Type for Opening Account");	
    bc.type_acc=type_acc;;
    float bal=IO.getfloat("Please Enter Amount for Account Opening more than 1000 Rs");
    bc.bal=bal;
    bc.show(name, add, type_acc, bal);
     
	}

}
