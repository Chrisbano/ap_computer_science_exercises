
public class BankAccount
{
    private double accountBalance;
    private String accountName;
    private int accountNumber;

    public BankAccount(int accountNumber, String accountName, double accountBalance)
    {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.accountBalance = accountBalance;
    }

    public double currentBalance()
    {
        return this.accountBalance;
    }

    public void acceptDeposit(double deposit)
    {
        accountBalance = accountBalance + deposit;
    }

    public void processCheck( int amount )
    {
      int charge;
      if ( accountBalance < 100000 )
        charge = 15; 
      else
        charge = 0;
  
      accountBalance =  accountBalance - amount - charge  ;
    }
    

    public String toString()
    {
       return "Account: " + accountNumber + ";\tOwner: " + accountName + ";\tBalance: " + accountBalance ;
    } 
  
   
}