import java.util.Arrays;
import java.util.Scanner;

public class School {
    public static void main(String[] args) {
        final String[] students = new String[20];
        final String[] teachers = new String[20];
        final String[] passwords = new String[20];
        final String[] studentMenu = new String[40];
        final String[] teacherMenu = new String[40];

        final String STUDENT = "student";
        final String TEACHER = "teacher";

        Teacher userteah = new Teacher();
        String username = userteah.username;

        String chosenOption;
        String menu;
        int count = 0;
        Scanner scanner = new Scanner(System.in);

            System.out.println("Welcome to school system");
            System.out.println("==========================");
            System.out.println();
            System.out.println("Choose your role: ");
            System.out.println(STUDENT.toUpperCase() + "  ||  " + TEACHER.toUpperCase());
            System.out.println("============================");
            System.out.print("What is your role?: - ");
            System.out.println();
            chosenOption = scanner.nextLine();

            if (chosenOption.equalsIgnoreCase(STUDENT)) {
                System.out.println("STUDENT");
                System.out.println("==============");
                System.out.println();
                System.out.print("Choose option 1 to signup  ||");
                System.out.println("  Choose option 2 to login");
                System.out.println("============================");
                System.out.println();
                System.out.print("Option: ");
                menu = scanner.nextLine();

                if (menu.contains("1")) {
                    signup(students, STUDENT, count, passwords);
                    String loggedInUserInfo = login(students, STUDENT, count, passwords);
                    if (!loggedInUserInfo.equals("Internal error") && !loggedInUserInfo.isEmpty()) {
                        studentMenu(studentMenu, loggedInUserInfo);
                    }

                } else if (menu.contains("2")) {
                    try {
                        String loggedInUserInfo = login(students, STUDENT, count, passwords);
                        if (!loggedInUserInfo.equals("Internal error") && !loggedInUserInfo.isEmpty()) {
                            studentMenu(studentMenu, loggedInUserInfo);
                        }
                    } catch (Exception e) {
                        System.out.println("You are not registered");
                    }

                }else {
                    System.out.println("Option not supported");
                }

            } else if (chosenOption.equalsIgnoreCase(TEACHER)) {
                System.out.println("TEACHER");
                System.out.println("==============");
                System.out.println();
                System.out.print("Choose option 1 to signup  ||");
                System.out.println("  Choose option 2 to login");
                System.out.println("============================");
                System.out.println();
                System.out.print("Option: ");
                menu = scanner.nextLine();

                if (menu.contains("1")) {
                    signup(teachers, TEACHER, count, passwords);
                    String loggedInUserInfo = login(teachers, TEACHER, count, passwords);
                    if (!loggedInUserInfo.equals("Internal error") && !loggedInUserInfo.isEmpty()) {
                        teacherMenu(teacherMenu, loggedInUserInfo);
                    }

                }else if (menu.contains("2")) {
                    try {
                        String loggedInUserInfo = login(teachers, TEACHER, count, passwords);
                        if (!loggedInUserInfo.equals("Internal error") && !loggedInUserInfo.isEmpty()) {
                            teacherMenu(teacherMenu, loggedInUserInfo);
                        }
                    } catch (Exception e) {
                        System.out.println("You are not registered");
                    }

                }else {
                    System.out.println("Option not supported");
                }

            }else {
                System.out.println("Unsupported option entered");
            }

    }

    public static void signup(String[] schoolList, String role, int count, String[] passwords) {
        String username, password;
        Scanner scanner = new Scanner(System.in);

        if (role.equals("student")) {
            while (true) {
                System.out.println("STUDENT");
                System.out.println("================");
                System.out.println();
                System.out.print("Enter your name: ");
                username = scanner.nextLine();
                if (!username.isEmpty()) {
                    schoolList[count] = username;
                }else {
                    System.out.println("Username is required");
                    break;
                }

                System.out.println();
                System.out.print("Enter your password: ");
                password = scanner.nextLine();
                if (!password.isEmpty()) {
                    passwords[count] = password;
                }else {
                    System.out.println("password is required");
                    break;
                }

                System.out.println(Arrays.toString(schoolList));
                System.out.println(Arrays.toString(passwords));
                break;

            }
        } else if (role.equals("teacher")) {
            while (true) {
                System.out.println("STUDENT");
                System.out.println("================");
                System.out.println();
                System.out.print("Enter your name: ");
                username = scanner.nextLine();
                if (!username.isEmpty()) {
                    schoolList[count] = username;
                }else {
                    System.out.println("Username is required");
                    break;
                }

                System.out.println();
                System.out.print("Enter your password: ");
                password = scanner.nextLine();
                if (!password.isEmpty()) {
                    passwords[count] = password;
                }else {
                    System.out.println("password is required");
                    break;
                }

                System.out.println(Arrays.toString(schoolList));
                System.out.println(Arrays.toString(passwords));
                break;
            }
        } else {
            System.out.println("Role not currently supported ");
        }
    }

    public static String login(String[] schoolList, String role, int count, String[] passwords) {
        Scanner scanner = new Scanner(System.in);
        String username, password;

        if (role.equals("student")) {
            while (true) {
                System.out.println("Login as Student");
                System.out.println("================");
                System.out.println();
                System.out.print("Enter your username: ");
                username = scanner.nextLine();
                System.out.print("Enter your password: ");
                password = scanner.nextLine();

                if (schoolList[0].contains(username) && passwords[0].contains(password)) {
                    System.out.println("Welcome to the student system");
                    return username;
                } else {
                    System.out.println("invalid username or password");
                    System.out.println("Try again");
                    login(schoolList, role, count, passwords);
                }

            }
        } else if (role.equals("teacher")) {
            while (true) {
                System.out.println("Login as teacher");
                System.out.println("================");
                System.out.println();
                System.out.print("Enter your username: ");
                username = scanner.nextLine();
                System.out.print("Enter your password: ");
                password = scanner.nextLine();

                if (schoolList[0].contains(username) && passwords[0].contains(password)) {
                    System.out.println("Welcome to the teacher's system");
                    return username;
                } else {
                    System.out.println("invalid username or password");
                    System.out.println("Try again");
                    login(schoolList, role, count, passwords);
                }

            }
        }

        return "Internal error";

    }

    public static void studentMenu (String[] studentMenu, String loggedInUserName) {
        Scanner scanner = new Scanner(System.in);
        String[] blogs = new String[]{"How to be okay", "How to win win", "How to be a good student", "Easy way to Become successful in 2024"};
        String[] attendanceList = new String[30];

        String menuOption;
        System.out.println("Student Menu");
        System.out.println("=====================");
        System.out.println();
        System.out.println("To Read Blogs Press 1: ");
        System.out.println();
        System.out.println("To Add Attendance Press 2: ");
        System.out.println();
        System.out.println("To Eat Lunch Press 3: ");
        System.out.println();
        System.out.println("To Return to Main Menu Press 4");
        System.out.println();
        menuOption = scanner.nextLine();

        switch (menuOption) {
            case "1" -> {
                for (String blog : blogs) {
                    System.out.println("*** " + blog);
                }
            }
            case "2" -> {
                attendanceList[0] = loggedInUserName;
            }

        }


    }

    public static void teacherMenu (String[] teacherMenu, String loggedInUserInfo) {
        System.out.println("Welcome to teacher menu");
    }


}
