/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter02.ATM;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ATM {
    public static void main(String[] args) {
        int money = 0;
        
        final int FIVE_HUNDRED_THOUSAND = 500000;
        final int TWO_HUNDRED_THOUSAND = 200000;
        final int ONE_HUNDRED_THOUSAND = 100000;
        final int FIFTY_THOUSAND = 50000;
        final int TWENTY_THOUSAND = 20000;
        final int TEN_THOUSAND = 10000;
        
        
        int fiveHundredThousand = 0;
        int twoHundredThousand = 0;
        int oneHundredThousand = 0;
        int fiftyThousand = 0;
        int twentyThousand = 0;
        int tenThousand = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Money: ");
        money = sc.nextInt();
       

        if(money >= FIVE_HUNDRED_THOUSAND){
            fiveHundredThousand = money / FIVE_HUNDRED_THOUSAND; //600000/500000=1
            money = money % FIVE_HUNDRED_THOUSAND; //tien con lai = 600000%500000=100000
            System.out.println("Gia tri: " + FIVE_HUNDRED_THOUSAND + " : " + fiveHundredThousand);
        }

        if(money >= TWO_HUNDRED_THOUSAND){
            twoHundredThousand = money / TWO_HUNDRED_THOUSAND;
            money = money % TWO_HUNDRED_THOUSAND;
            System.out.println("Gia tri: " + TWO_HUNDRED_THOUSAND + " : " + twoHundredThousand);
        }

        if(money >= ONE_HUNDRED_THOUSAND){
            oneHundredThousand = money / ONE_HUNDRED_THOUSAND;
            money = money % ONE_HUNDRED_THOUSAND;
            System.out.println("Gia tri: " + ONE_HUNDRED_THOUSAND + " : " + oneHundredThousand);
        }

        if(money >= FIFTY_THOUSAND){
            fiftyThousand = money / FIFTY_THOUSAND;
            money = money % FIFTY_THOUSAND;
            System.out.println("Gia tri: " + FIFTY_THOUSAND + " : " + FIFTY_THOUSAND);
        }

        if(money >= TWENTY_THOUSAND){
            twentyThousand = money / TWENTY_THOUSAND;
            money = money % TWENTY_THOUSAND;
            System.out.println("Gia tri: " + TWENTY_THOUSAND + " : " + twentyThousand);
        }

        if(money >= TEN_THOUSAND){
            tenThousand = money / TEN_THOUSAND;
            money = money % TEN_THOUSAND;
            System.out.println("Gia tri: " + TEN_THOUSAND + " : " + tenThousand);
        }

    }
                
}

