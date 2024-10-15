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
 * Interface for staff members.
 */
public interface iStaff {
    /**
     * Returns the staff number.
     * @return staff number
     */
    int getStaffNumber();

    /**
     * Returns the staff location.
     * @return staff location
     */
    String getStaffLocation();

    /**
     * Returns the staff hiring process.
     * @return staff hiring process
     */
    String getStaffHiringProcess();
}
