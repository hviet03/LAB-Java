/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author win
 */
package BO;

import static UI.Main.displayConvert;

public class Convert {

    String hex = "0123456789ABCDEF";
    
    //allow user convert from binary
    

    public String otherToDec(String other, int base) {
        int result = 0;
        other = other.toUpperCase();

        for (int i = 0; i < other.length(); i++) {
            result += hex.indexOf(other.charAt(i)) * Math.pow(base, other.length() - 1 - i);
        }
        return Integer.toString(result);
        
    }

    public String decToOther(String dec, int base) {
        String result = "";
            int num = Integer.parseInt(dec);
              while (num > 0) {
            result = hex.charAt(num % base) + result;
            num /= base;
            }
        return result;
    }
   
}