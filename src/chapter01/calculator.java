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
public class calculator {
    //Nhập numberFirst, numberSecond. Nhập toán tử (+ - * / %). Thực hiện phép tính.Hiển thị kết quả.
    public static void main(String[] args) {
        int numberFirst;
        int numberSecond;
        int result=0;
        String operator;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Number First: ");
        numberFirst = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Number Second: ");
        numberSecond = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Operator : ");
        operator = sc.nextLine();
        
        switch(operator)
        {
            case "+":
                result = numberFirst + numberSecond;
                break;
                
            case "-":
                result = numberFirst - numberSecond;
                break;
                
            case "*":
                result = numberFirst*numberSecond;
                break;
                
            case "/":
                result = numberFirst / numberSecond;
                break;
              
            default:
                result = numberFirst + numberSecond;
                break;
                        
        }
        
        System.out.println("------------------------------------------------");
        System.out.println(numberFirst + operator + numberSecond + "=" + result);
    }
}
