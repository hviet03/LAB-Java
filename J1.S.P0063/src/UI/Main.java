/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;
import BO.PersonWrapper;
import Utils.InputUtils;
import Model.Person;
/**
 *
 * @author win
 */
public class Main {
    
    public static Person inputPersonInfo() {

        System.out.print("Please input name: ");
        String name = InputUtils.checkInputString();
        System.out.print("Please input address: ");
        String address = InputUtils.checkInputString();
        System.out.print("Please input salary: ");
        double salary = InputUtils.checkInputSalary();
        
        return new Person(name, address, salary);
    }
    
    
    public static void main(String[] args) {
         
        System.out.print("Enter number of people: ");
        int n = InputUtils.checkInputInt();
       
        Person[] persons = new Person[n];
        PersonWrapper[] list = new PersonWrapper[persons.length];
        
        for (int i = 0; i < persons.length; i++) {
            System.out.println("Input Information of Person " + (i+1) + ":");
            persons[i] = inputPersonInfo();
            System.out.println();
        }
        
        System.out.println("Sort by salary? (Y/N): ");
        PersonWrapper.display(persons, list);      
        
      
    }
}
