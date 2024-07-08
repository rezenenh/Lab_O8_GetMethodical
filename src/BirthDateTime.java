import java.util.Scanner;

public class BirthDateTime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int birthYear = 0;
        int birthMonth = 0;
        int birthDay = 0;
        int birthHour = 0;
        int birthMinute = 0;

        birthYear = SafeInput.getRangedInt(scanner, "Enter your birth year between 1950 to 2010" , 1950, 2010);
        birthMonth = SafeInput.getRangedInt(scanner, "Enter your birth month between 1 to 12" , 1, 12);

        switch (birthMonth) {
            case 1, 3, 5, 7, 8, 10, 12:
                birthDay = SafeInput.getRangedInt(scanner, "Enter your birth day between 1 to 31", 1, 31);
                break;
            case 2:
                birthDay = SafeInput.getRangedInt(scanner, "Enter your birth day between 1 to 29", 1, 29);
                break;
            case 4, 6, 9, 11:
                birthDay = SafeInput.getRangedInt(scanner, "Enter your birth day between 1 to 30", 1, 30);
                break;
        }
        birthHour = SafeInput.getRangedInt(scanner, "Enter your birth hour between 1 to 24", 1, 24);
        birthMinute = SafeInput.getRangedInt(scanner, "Enter your birth minute between 1 to 59", 1,59);

        System.out.println("\nYou were born on: " + birthMonth + "/" + birthDay + "/" + birthYear + " at " + birthHour + ":" + birthMinute);
    }
}