/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter02.bai1;

/**
 *
 * @author Admin
 */
public class Student {

    public String name;
    public String codeStudent;
    public int birthYear;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCodeStudent() {
        return codeStudent;
    }

    public void setCodeStudent(String codeStudent) {
        this.codeStudent = codeStudent;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void showInformation()
    {
        System.out.println("Information of first student : " );
        System.out.println("Name: " + this.getName());
        System.out.println("Code student: " + this.getCodeStudent());
        System.out.println("Birth Year : " + this.getBirthYear());
    }
}
