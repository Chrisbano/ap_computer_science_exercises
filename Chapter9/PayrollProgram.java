

public class PayrollProgram {
    public static void main ( String[] args )
    {
        long hoursworked = 35;
        double payRate = 12.0 , taxRate = 0.435;
        System.out.println("Hours worked: " + hoursworked);
        System.out.println("MoneyEarned: " + (hoursworked * payRate));
        System.out.println("Tax Amount: " + (hoursworked * payRate * taxRate));

    }



}