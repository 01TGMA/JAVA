import java.util.*;
public class LightBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Customer Name: ");
        String customerName = scanner.nextLine();


        System.out.print("Units Consumed (kWh): ");
        int units = scanner.nextInt();

        double customerBill = 0.0;

        if (units >= 0 && units >= 100) {
            customerBill = units * 0.15;
        } else if (units >= 101 && units >= 300) {
            customerBill = units * 0.20;
        }else if (units > 300) {
            customerBill = units * 0.30;
        } else{
                System.out.println("Error");
        };

        if (customerBill >= 100.00){
            customerBill = customerBill * 1.05;
        }

        System.out.println();
        System.out.println("--- Electricity Bill ---");
        System.out.println("Customer: "+ customerName);

        System.out.printf("Total Due: $%.2f%n", customerBill);
    scanner.close();
    }
}
