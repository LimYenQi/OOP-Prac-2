/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

/**
 *
 * @author Lim Yen Qi
 * P2Q3
 */
public class UnitConverter {
    public static void main (String [] args) {
        double inch = 1, centimeter = 5;
        
        System.out.println("Inches \t Centimeters \t\t Centimeters \t Inches");
        for ( int i = 0; i < 10; i++) {
            System.out.printf("%.1f \t %.2f \t\t\t %.1f \t\t %.2f \n", inch, inchToCentimeter(inch), centimeter, centimeterToInch(centimeter));
            inch += 1;
            centimeter += 5;
        }
    }
    public static double inchToCentimeter (double in) {
        double cm;
        cm = in * 2.54;
        return cm;
    }
    public static double centimeterToInch (double cm) {
        double in;
        in = cm / 2.54;
        return in;
    }
}
