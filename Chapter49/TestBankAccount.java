public class TestBankAccount
{
  public static void main( String[] args )
  {
    
    
    BankAccount account1 = new BankAccount( 123, "Bob", 100.0 );
    System.out.println( account1.toString() );

    BankAccount account2 = new BankAccount( 007, "James", 45723.0 );
    System.out.println( account2.toString() );

    System.out.println( account1.currentBalance() );
    account1.acceptDeposit( 2000 );
    account1.processCheck( 1500 );
    System.out.println( account1.currentBalance() );

  }

}