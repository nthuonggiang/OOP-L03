/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter02.bai2;

/**
 *
 * @author Admin
 */
public class Person {
    public String name;
    public String country;
    public String gender;
    public int yearOfBirth;
    public String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public void showInformation()
    {
        System.out.println("Information of first person: ");
        System.out.println("Name: " + this.getName());
        System.out.println("Country: " +this.getCountry());
        System.out.println("Gender: " + this.getGender());
        System.out.println("Year of birth: " + this.getYearOfBirth());
        System.out.println("Address: " +this.getAddress());
    }
}
