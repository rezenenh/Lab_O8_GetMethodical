import java.util.Scanner;

public class GetUserName {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userFirstName = "";
        String userLastName = "";

        userFirstName = SafeInput.getNonZeroLenString(scanner, "Enter your first name");
        userLastName = SafeInput.getNonZeroLenString(scanner, "Enter your last name");

        System.out.println("\nYour full name is: " + userFirstName + " " + userLastName);
    }
}