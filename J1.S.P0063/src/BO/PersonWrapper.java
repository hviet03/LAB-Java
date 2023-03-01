/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BO;

/**
 *
 * @author win
 */

import Model.Person;
import Utils.InputUtils;
import java.util.Scanner;

public class PersonWrapper {

    private Person p;

    public PersonWrapper() {
    }

    public PersonWrapper(Person p) {
        this.p = p;
    }

    private static Scanner sc = new Scanner(System.in);
    

    public static void display( Person[] persons, PersonWrapper[] list) {
        boolean check = InputUtils.checkYN();
        for (int j = 0; j < persons.length; j++) 
           list[j] = new PersonWrapper(persons[j]);
        
        if(check != true){
            
        } else {
            int n = persons.length;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (list[i].p.salary > list[j].p.salary) {
                        swap(list[i], list[j]);
                    }
                }
            }
            
        }
        System.out.println("Information of people you entered:");
        for (int j = 0; j < persons.length; j++) {
            list[j].p.displayPersonInfo();}
}
      
    private static void swap(PersonWrapper person1, PersonWrapper person2) {
        Person temp = person1.p;
        person1.p = person2.p;
        person2.p = temp;
    }
}
