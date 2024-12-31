import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        double income = scanner.nextDouble();
        double tax = calculateTax(income);
        System.out.printf("Tax: %.2f", tax);
    }
    public static double calculateTax(double income) {
        double tax = 0;
        if (income <= 10000) {
            tax = income * 0.025;
        } else if (income <= 25000) {
            tax = 10000 * 0.025 + (income - 10000) * 0.043;
        } else {
            tax = 10000 * 0.025 + (25000 - 10000) * 0.043 + (income - 25000) * 0.067;
        }
        return tax;
    }
}
