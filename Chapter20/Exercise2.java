import java.util.Scanner;

public class Exercise2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 0;
        int times = 0;
        double sum = 0;

        System.out.println("Enter N");
        n = scan.nextInt();

        while (times < n) {
            times += 1;
            sum += 1.0/times;
        }
        System.out.println(sum);
    }
}
