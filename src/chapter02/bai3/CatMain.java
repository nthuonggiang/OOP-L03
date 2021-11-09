/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter02.bai3;

import chapter02.bai3.Cat;

/**
 *
 * @author Admin
 */
public class CatMain {
    public static void main(String[] args) {
        Cat cat = new Cat();
        
        cat.setName("Doraemon");
        cat.setCountry("Japan");
        cat.setAge(22);
        
        cat.showInformation();
    }
}
