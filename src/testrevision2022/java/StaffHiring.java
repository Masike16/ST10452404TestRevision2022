/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package staffhiringapplication.java;

/**
 *
 * @author masik
 */
/**
 * Class for staff hiring process.
 */
public class StaffHiring extends Staff {
    /**
     * Constructor for staff hiring process.
     * @param staffNumber staff number
     * @param staffLocation staff location
     */
    public StaffHiring(int staffNumber, String staffLocation) {
        super(staffNumber, staffLocation);
    }

    @Override
    public String getStaffHiringProcess() {
        // Simple hiring process: hire if staff number is less than 20
        return staffNumber < 20 ? "YES" : "NO";
    }

    /**
     * Prints the staff hiring report.
     */
    public void printStaffHiring() {
        System.out.println("STAFF HIRING REPORT");
        System.out.println("********************");
        System.out.println("LOCATION: " + getStaffLocation());
        System.out.println("STAFF NUMBER: " + getStaffNumber());
        System.out.println("HIRE STAFF: " + getStaffHiringProcess());
    }
}
