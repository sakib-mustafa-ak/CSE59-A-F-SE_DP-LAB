//Holding the data
public class UserRepository{
    public void saveToDatabase(User user) {
        if (EmailValidator.isValidEmail()) {
            System.out.println("Connecting to database...");
            System.out.println("Saving user " + this.username + " to the users table.");
        }
    }
}


//Email validation
public class EmailValidator{
    public static boolean isValidEmail(String email) {
        // Checks if the email contains an '@' symbol
        if (email != null && email.contains("@")) {
            return true;
        }
        System.out.println("Invalid email format.");
        return false;
    }
}



//Database Entry
public class UserRepository{
    public void saveToDatabase(User user) {
        if (EmailValidator.isValidEmail(user.getEmail())) {
            System.out.println("Connecting to database...");
            System.out.println("Saving user " + user.getUsername() + " to the users table.");
        }
        else{
            System.out.println("Error: User data is invalid.");
        }
    }
}



//Main
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        UserRepository repository = new UserRepository();

        System.out.println("---- User Registration System ----");

        System.out.println("Please enter a username: ");
        String inputUsername = scan.nextLine();

        System.out.println("Please enter an email address: ");
        String inputEmail= scan.nextLine();

        User interactiveUser = new User(inputUsername, inputEmail);

        System.out.println("\nProcessing....");

        repository.saveToDatabase(interactiveUser);

        scan.close();
    }
}
