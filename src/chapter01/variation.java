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
public class variation {
    public static void main(String[] args) {
        int chieuDai;
        int chieuRong;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai cua hinh chu nhat: ");
        chieuDai = sc.nextInt();
        System.out.print("Nhap chieu rong cua hinh chu nhat: ");
        chieuRong = sc.nextInt();
        System.out.println("Chieu dai cua hinh chu nhat la " + chieuDai);
        System.out.println("Chieu rong cua hinh chu nhat la " + chieuRong);
    }
}
