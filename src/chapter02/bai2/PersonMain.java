/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter02.bai2;

import chapter02.bai2.Person;

/**
 *
 * @author Admin
 */
public class PersonMain {
    public static void main(String[] args) {
        Person firstPerson = new Person();
        
        firstPerson.setName("Giang");
        firstPerson.setCountry("Viet Nam");
        firstPerson.setGender("Nu");
        firstPerson.setYearOfBirth(2001);
        firstPerson.setAddress("TP.Ha Noi");
        
        firstPerson.showInformation();
    }
    
}
