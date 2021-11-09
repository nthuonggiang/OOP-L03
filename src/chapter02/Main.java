/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter02;

import chapter02.bai1.Student;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Student firstStudent = new Student();
        /*firstStudent.name = "Giang";
        firstStudent.codeStudent = "AT160415";
        firstStudent.birthYear = 2001;*/
        
        firstStudent.setName("Giang");
        firstStudent.setCodeStudent("AT160415");
        firstStudent.setBirthYear(2001);
        
        firstStudent.showInformation();
        
        
    }
}
