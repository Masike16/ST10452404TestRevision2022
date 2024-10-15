/*
ST10452404 MASIKE
HOMEWORK TEST
 */
package homemakeoverreport.java;

/**
 *
 * @author masik
 */
public class HomeMakeoverReportJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] months = {"JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE"};
        int[][] makeovers = {
            {8, 2, 5},
            {7, 4, 5},
            {5, 5, 2},
            {2, 2, 3},
            {7, 7, 9},
            {7, 8, 5}
        };

        // Display Header
        System.out.println("-----------------------------------------------------");
        System.out.println("HOME MAKEOVER REPORT");
        System.out.println("-----------------------------------------------------");
        System.out.println("          Bathrooms   Kitchens     Garden");

        // Display Monthly Data and Calculate Totals
        int[] monthlyTotals = new int[months.length];
        for (int i = 0; i < months.length; i++) {
            System.out.printf("%-8s", months[i].substring(0, 3));
            int monthlyTotal = 0;
            for (int j = 0; j < makeovers[i].length; j++) {
                System.out.printf(" %10d", makeovers[i][j]);
                monthlyTotal += makeovers[i][j];//calculates the amounts to get totals
            }
            monthlyTotals[i] = monthlyTotal;
            System.out.println();
        }

        // Display the Monthly Totals
        System.out.println("-----------------------------------------------------");
        System.out.println("MONTHLY TOTALS");
        System.out.println("-----------------------------------------------------");
        for (int i = 0; i < months.length; i++) {
            System.out.printf("%-10s %10d", months[i].substring(0, 3), monthlyTotals[i]);
            if (monthlyTotals[i] >= 15) {//totals below 15 dont get 3 stars
                System.out.print("   ***");
            }
            System.out.println();
            
        }
    }
    
}
