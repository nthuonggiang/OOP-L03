/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter01;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class loop {
    //Nhập number. Nếu number >10 thì nhập lại number cho đến khi number <10
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap number: ");
        number = sc.nextInt();
        while (number>=10){            
            System.out.print("Nhap so nho hon 10: ");
            number = sc.nextInt();
        } 
        System.out.println("number = " +number);
    }
}
