import java.util.Scanner;

public class CheckOut{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double itemPrice = 0;
        double totalCost = 0;

        do {
            itemPrice = SafeInput.getRangedDouble(scanner, "Enter item price between .50 cents to $9.99 dollars", 0.50, 9.99);
            totalCost += itemPrice;
        } while (SafeInput.getYNConfirm(scanner, "Do you want to enter another price? (y/n)"));
        System.out.printf("\nTotal cost of the items is $%.2f%n", totalCost);
    }
}