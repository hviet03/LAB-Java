/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import BO.ManageCountries;
import Model.Country;
import Utils.InputUtils;
import java.util.ArrayList;

/**
 *
 * @author win
 */

public class Main {
     public static int menu(){
        System.out.println("================================================");
        System.out.println("1. Input information of countries in East Asia");
        System.out.println("2. Display the information");
        System.out.println("3. Search by country name");
        System.out.println("4. Sort by country name");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        System.out.println();
        int choice = InputUtils.checkInputIntLimit(1, 5);
        return choice;
     }
        
        public static void main(String[] args) {
        ArrayList<Country> lc = new ArrayList<>();
        //loop until user want to exist
        while (true) {
            int choice = menu();
            switch (choice) {
                case 1:
                    ManageCountries.inputCountry(lc);
                    break;
                case 2:
                    ManageCountries.printCountry(lc);
                    break;
                case 3:
                    ManageCountries.searchByName(lc);
                    break;
                case 4:
                    System.out.println("Ascending ? (Y/N): ");
                    ManageCountries.printCountrySorted(lc);
                    break;
                case 5:
                    return;
            }
        }
    }
}
    

