import java.util.Scanner;

public class Reggie{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String socialSecurityNumber;
        String employeeCode;
        String userChoice;

        socialSecurityNumber = SafeInput.getRegExString(scanner, "Enter your SSN in XXX-XX-XXXX", "\\d{3}-\\d{2}-\\d{4}");
        employeeCode = SafeInput.getRegExString(scanner, "Enter your employee code (M12345)", "[Mm]\\d{5}");
        userChoice = SafeInput.getRegExString(scanner, "Enter your choice (O/S/V/Q)", "[OoSsVvQq]");

        System.out.println("\nYour SSN is: " + socialSecurityNumber);
        System.out.println("\nYour employee code is: " + employeeCode);
        System.out.println("\nYour menu choice is: " + userChoice);
    }
}
