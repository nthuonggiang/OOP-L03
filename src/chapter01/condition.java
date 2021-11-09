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
public class condition {
    //Nhập number.Nếu number > 10 thì number = number/10 ; Nếu number <= 10 thì number = number*10. Hiển thị kết quả.
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap number = ");
        number = sc.nextInt();
        if(number >10)
        {
            number = number/10;
        }
        else
        {
            number = number*10;
        }
        System.out.println("number = " +number);
    }
}
