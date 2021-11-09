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
public class my_partner_number {
    //Tạo random number từ 1-80 :call my partner number
    //Nhập number cho đến khi bằng số random number. Nếu number < random number thì in ra màn hình "Your number is less than your 
    //partber number". Nếu number > random number thì in ra màn hình " Your number bigger than your partner number". Nếu number = 
    //random number thì in ta màn hình "Successfull"
    
    public static void main(String[] args) {
        final int MAX_NUMBER =80;
        final int MIN_NUMBER =1;
        
        int range = (MAX_NUMBER - MIN_NUMBER)+1;
        
        int myPartnerNumber = (int)(Math.random() * range) + MIN_NUMBER;
        
        Scanner sc = new Scanner(System.in);
        
        int myNumber=0;
        int time=0;
        
        //System.out.println(myPartnerNumber);
        while(myPartnerNumber != myNumber)
        {
            System.out.print("My number (1-80) : ");
            myNumber = sc.nextInt();
            sc.nextLine();
            
            if(myNumber > myPartnerNumber)
            {
                System.out.println("Your number bigger than your partner number");
            }
            else if(myNumber < myPartnerNumber)
            {
                System.out.println("Your number is less than your partber number");
            }
            else
                System.out.println("Successfull");
            
            time++;
        }
        
        System.out.println("You tried " + time + " times");
    }
}
