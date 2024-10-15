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
 * Abstract class for staff members.
 */
public abstract class Staff implements iStaff {
    /**
     * Staff number.
     */
    protected int staffNumber;

    /**
     * Staff location.
     */
    protected String staffLocation;

    /**
     * Constructor for staff members.
     * @param staffNumber staff number
     * @param staffLocation staff location
     */
    public Staff(int staffNumber, String staffLocation) {
        this.staffNumber = staffNumber;
        this.staffLocation = staffLocation;
    }

    @Override
    public int getStaffNumber() {
        return staffNumber;
    }

    @Override
    public String getStaffLocation() {
        return staffLocation;
    }
}
