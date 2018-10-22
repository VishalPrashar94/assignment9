/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author 1794421
 */
public class JavaApplication1 {

  
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("enter number of lines u want");
        int n = console.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
