/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BO;

import Model.Country;
import Utils.InputUtils;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author win
 */
public class ManageCountries {
    public static void inputCountry(ArrayList<Country> lc) {
        System.out.print("Enter code of contry: ");
        String countryCode = InputUtils.checkInputString();
        //check code contry exist or not
        if (!checkCountryExist(lc, countryCode)) {
            System.err.println("Country exist.");
            return;
        }
        System.out.print("Enter name of contry: ");
        String countryName = InputUtils.checkInputString();
        System.out.print("Enter total area: ");
        double countryArea = InputUtils.checkInputDouble();
        System.out.print("Enter terrain of contry: ");
        String countryTerrain = InputUtils.checkInputString();
        lc.add(new Country(countryTerrain, countryCode, countryName, countryArea));
        System.err.println("Add successful.");
    }

    //display infomation of country
    public static void printCountry(ArrayList<Country> lc) {
        System.out.printf("%-10s%-25s%-20s%-25s\n", "ID", "Name", "Total Area",
                "Terrain");
        for (Country country : lc) {
            country.display();
        }
    }

    //display infomation sort name in ascending
    public static void printCountrySorted(ArrayList<Country> lc) {
        boolean check = InputUtils.checkYN();
          System.out.printf("%-10s%-25s%-20s%-25s\n", "ID", "Name", "Total Area",
                "Terrain");
        if (check == true){
            Collections.sort(lc);
            for (Country country : lc) {
            country.display();
            }
        }
        else {
            Collections.sort(lc, Collections.reverseOrder());
       
        for (Country country : lc) {
            country.display();
        }
      }
    }

    //allow user search infomation contry by name
    public static void searchByName(ArrayList<Country> lc) {
        System.out.print("Enter the name you want to search for: ");
        String countryName = InputUtils.checkInputString();
        System.out.printf("%-10s%-25s%-20s%-25s\n", "ID", "Name", "Total Area",
                "Terrain");
        for (Country country : lc) {
            if (country.getCountryName().contains(countryName)) {
                country.display();
            }
        }
    }

    //check country exist by code
    public static boolean checkCountryExist(ArrayList<Country> lc, String countryCode) {
        for (Country country : lc) {
            if (country.getCountryCode().equalsIgnoreCase(countryCode)) {
                return false;
            }
        }
        return true;
    }
    
}
