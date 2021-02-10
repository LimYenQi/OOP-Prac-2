/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

/**
 *
 * @author Lim Yen Qi
 */
public class P2Q4 {
    public static void main (String [] args) {
        Average calc = new Average ();
        
        System.out.println("The average of 2 integer values is " + calc.calculateAverage(10, 20));
        System.out.println("The average of 3 integer values is " + calc.calculateAverage(5, 10, 30));
        System.out.println("The average of 2 double values is " + calc.calculateAverage(6.6, 9.9));
        System.out.println("The average of 3 double values is " + calc.calculateAverage(11.11, 22.22, 33.33));
    }
}
