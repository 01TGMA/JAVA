import java.util.*;

public class App {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Initial Deposit: ");
        int InitialDeposit = scanner.nextInt(); 

        System.out.print("Annual Interest Rate (%): ");
        float AnnualIR = scanner.nextFloat();
        
        System.out.print("Years: ");
        int Years = scanner.nextInt(); 

        float r = AnnualIR / 100; 

        double base =  1 + (r/12);
        double Compounded = InitialDeposit * Math.pow(base, (12 * Years ));
        double Difference = Compounded - InitialDeposit;

        System.out.printf("Final Balance: $%.2f%n",  Compounded);
        System.out.printf("Total Interest Earned: $%.2f%n",  Difference);
        scanner.close();
}
    }
    