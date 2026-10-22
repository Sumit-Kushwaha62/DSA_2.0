import java.util.*;

// ############################ Switch cases for Strings Data Type in Java #########################################

public class switchCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the day here...!");
        String day = sc.nextLine();

        switch (day) {
            case "Monday":
                System.out.println("Today is monday and it's a working day");
                break;

            case "Sunday":
                System.out.println("It's sunday and you can take a leave today");
            default:
                System.out.println("Invalid day entered");

        }

    }

}
