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
