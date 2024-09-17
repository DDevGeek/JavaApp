
import java.util.Scanner;

public class BestHouse {
    public static void main(String[] args) {
        String[] usernames = new String[100];
        String[] passwords = new String[100];
        String[] types = new String[100];
        Scanner scanner = new Scanner(System.in);
        String choseOption;

        System.out.println("Main Menu");
        System.out.println("===================");
        System.out.println();
        System.out.print("To login press 1");
        System.out.println("To signup press 2");
        choseOption = scanner.nextLine();

        if (choseOption.equals("1")) {
            signup(usernames, passwords, choseOption);
        } else {
            login(usernames, passwords);
        }

    }

    public static void login(String[] usernames, String[] passwords) {
        String username;
        String password;
        String userType;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please login");
        System.out.println("What is your type");
        userType = scanner.nextLine();
        while (true) {
            switch (userType) {
                case "teacher":
                    System.out.println("Enter username");
                    username = scanner.nextLine();
                    System.out.println("Enter password");
                    password = scanner.nextLine();
                    if (usernames[0].equals(username) && passwords[0].contains(password)) {
                        System.out.println("You are successfully logged in");
                    }else {
                        System.out.println("Username or password not correct");
                    }
                    break;
                case "user":
                    System.out.println("Enter username");
                    username = scanner.nextLine();
                    System.out.println("Enter password");
                    password = scanner.nextLine();
                    if (usernames[0].equals(username) && passwords[0].contains(password)) {
                        System.out.println("You are successfully logged in");
                    }else {
                        System.out.println("Username or password not correct");
                    }
                    break;
            }
        }
    }

    public static void signup(String[] usernames, String[] passwords, String chosenMenu) {
        String username;
        String password;
        String userType;

        int number = 0;

        while (true) {
            System.out.println("Main menu");
            System.out.println("Click 1 to sign up as user");
            System.out.println("Click 2 to sign up as teacher");
            System.out.print("Signup as: - ");
            Scanner scanner = new Scanner(System.in);
//            String chosenMenu = scanner.nextLine();
//            System.out.println(Arrays.toString(usernames));

            switch (chosenMenu) {
                case "1":
                    System.out.println("Enter username");
                    username = scanner.nextLine();
                    if (!username.isEmpty()) {
                        usernames[0] = username;
                    }
                    System.out.println("Enter password");
                    password = scanner.nextLine();
                    if (!username.isEmpty()) {
                        passwords[0] = password;
                    }
                    System.out.println("Please login");
                    login(usernames, passwords);
//                    number++;
                    break;
                case "2":
                    System.out.println("Enter username");
                    username = scanner.nextLine();
                    if (!username.isEmpty()) {
                        usernames[number] = username;
                    }
                    System.out.println("Enter password");
                    password = scanner.nextLine();
                    if (!username.isEmpty()) {
                        passwords[number] = password;
                    }
                    number++;
                    break;
                case "login":
                    System.out.println("Please login");

            }
        }
    }

}


