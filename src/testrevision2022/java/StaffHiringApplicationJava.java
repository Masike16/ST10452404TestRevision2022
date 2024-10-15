/*
 Group 1 code presentation
 */
package staffhiringapplication.java;

import java.util.Scanner;

/**
 *
 * @author masik
 */
public class StaffHiringApplicationJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the current staff number: ");
        int staffNumber = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        System.out.print("Enter the staff hiring location: ");
        String staffLocation = scanner.nextLine();

        // Create a new staff hiring object
        StaffHiring staffHiring = new StaffHiring(staffNumber, staffLocation);

        // Print the staff hiring report
        staffHiring.printStaffHiring();
    }
}
