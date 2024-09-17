import java.util.Scanner;

public class CarShop {
    static Scanner scanner = new Scanner(System.in);
    static final String[] usernames = new String[100];
    static final String[] passwords = new String[100];
    static int userCounter = 0;

    public static String login() {
        String username;
        String password;

        System.out.println("Enter username: ");
        username = scanner.nextLine();
        System.out.println();
        System.out.println("Enter password: ");
        password = scanner.nextLine();

        for (int user = 0; user < usernames.length; user++) {
            if (usernames[user].equals(username) && passwords[user].equals(password)) {
               return username;
            }
        }
        return "Wrong credentials";

    }


    public static boolean signup() {
        String username, password;
        System.out.println("Enter username");
        username = scanner.nextLine();
        System.out.println("Password");
        password = scanner.nextLine();

        if (!username.isEmpty() && !password.isEmpty()) {
            usernames[userCounter] = username;
            passwords[userCounter] = password;

            userCounter++;
            return true;
        }

        return false;
    }

    public static void userMenu(String username) {
        System.out.println("Welcome to the user menu " + username);
    }


    public static void mainMenu() {
        String userOption;

        while(true) {
            System.out.println("Main Menu");
            System.out.println("================");
            System.out.println("- Press 1 to Login: ");
            System.out.println();
            System.out.println("- Press 2 to Register");
            System.out.println();
            System.out.println("- Press 0 to Exit");
            System.out.println();
            System.out.println("What do you want to do: ");
            userOption = scanner.nextLine();
            switch(userOption) {
                case "1":
                    System.out.println("Login");
                    String username = login();
                    if (!username.equals("Wrong credentials")) {
                        userMenu(username);
                    }else {
                        System.out.println("User not found, try again");
                    }
                    break;
                case "2":
                    System.out.println("Sign up");
                    if(signup()) {
                        System.out.println("Signed up successfully");
                    }
                    break;
                case "3":
                    System.out.println("Exit");
                    return;

            }
        }

    }

    public static void main(String[] args) {
        mainMenu();
    }




}



//Main Menu:
//   1. Login
//      -Prompt for a username and password.
//        -If the credentials are correct, proceed to the User Menu.
//   2. Register
//      -Prompt for a username and password.
//        -Register the new user with the provided details.
//      -Return to the Main Menu.
//   3. Exit
//    -Close the application.







//Login-Prompt for a username and password.
// -If the credentials are correct, proceed to the User Menu.
// Register-Prompt for a username and password.
// -Register the new user with the provided details.
// -Return to the Main Menu.
// Exit-Close the application
