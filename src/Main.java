import staff.management.StaffManager;
import staff.management.User;
import staff.management.UserManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        StaffManager staffManager = new StaffManager();
        User currentUser = null;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nStaff Management System");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Add Staff");
            System.out.println("4. View Members");
            System.out.println("5. Delete Staff");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter Full Name: ");
                    String fullName = scanner.nextLine();
                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter Password: ");
                    String password = scanner.nextLine();
                    userManager.registerUser(fullName, email, password);
                    break;

                case 2:
                    System.out.print("Enter Email: ");
                    String loginEmail = scanner.nextLine();
                    System.out.print("Enter Password: ");
                    String loginPassword = scanner.nextLine();
                    currentUser = userManager.logInUser(loginEmail, loginPassword);
                    break;

                case 3:
                    if (currentUser != null) {
                        System.out.print("Enter Staff Name: ");
                        String staffName = scanner.nextLine();
                        System.out.print("Enter Staff Email: ");
                        String staffEmail = scanner.nextLine();
                        System.out.print("Enter Staff Year: ");
                        int staffYear = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline character
                        System.out.print("Enter Staff Department: ");
                        String staffDepartment = scanner.nextLine();
                        staffManager.addStaff(staffName, staffEmail, staffYear, staffDepartment);
                    } else {
                        System.out.println("Login required to add staff.");
                    }
                    break;

                case 4:
                    staffManager.viewMembers();
                    break;

                case 5:
                    if (currentUser != null) {
                        System.out.print("Enter Staff Email to delete: ");
                        String staffEmailToDelete = scanner.nextLine();
                        staffManager.deleteMembers(staffEmailToDelete);
                    } else {
                        System.out.println("Login required to delete staff.");
                    }
                    break;

                case 6:
                    System.out.println("Exiting the system. Goodbye!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

