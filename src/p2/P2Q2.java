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
import java.util.Scanner;

public class P2Q2 {
    public static void main(String[] args){
        double ans = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter a positive number: ");
        int num = scanner.nextInt();
        
        if (num < 0) {
            System.out.println("You have enter a negative number!!");
            System.exit(0);
        } else if (num == 0) {
            ans = 0;
        } else if (num == 1) {
            ans = 1;
        } else {
            ans = calc(num);
        }
        
        System.out.printf("The square root of %d is %.8f \n", num, ans);
    }
    
    static double calc (int num){
        double midpoint = 0, midpoint2, lower, upper, precision;
        
        if (num > 1) {
            lower = 1;
            upper = num;
        } else {
//          (num < 1)
            lower = num;
            upper = 1;
        }
        precision = (upper - lower) / lower;
        
        while ( precision > 0.00000001) {
            midpoint = (lower + upper) / 2;
            midpoint2 = midpoint * midpoint;
            if ( midpoint2 > num) {
                upper = midpoint;
            } else if ( midpoint2 < num) {
                lower = midpoint;
            } else {
                break;
            }
            precision = (upper - lower) / lower;
        }
        
        return midpoint;
    }
}
