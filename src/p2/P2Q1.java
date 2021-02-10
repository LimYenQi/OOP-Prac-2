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
public class P2Q1 {
    public static void main(String[] args) {
        System.out.println("Number\tSquareRoot");
        for (int x = 0; x < 21; x += 2) {
            System.out.printf("%d \t %.4f \n", x, Math.sqrt(x));
        }
    } 
}
