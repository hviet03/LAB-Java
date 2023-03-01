/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.util.Scanner;

/**
 *
 * @author win
 */
public class InputUtils {
    
    private static Scanner sc = new Scanner(System.in);

    public static String checkInputString() {
        
        //loop until user input true value
        while (true) {
            String result = sc.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty.");
            } else {
                return result;
            }
        }
    }

    public static int checkInputInt() {
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine());
                if (result <= 0) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException ex) {
                System.err.println("Input must be digit.");
            }
        }
    }

    public static double checkInputSalary() {
        while (true) {
            try {
                double result = Double.parseDouble(sc.nextLine());
                if (result < 0) {
                    System.err.println("Salary is greater than zero");
                } else {
                    return result;
                }
            } catch (NumberFormatException ex) {
                System.err.println("You must input digidt.");
                System.out.print("Please input salary: ");
            }
        }
    }
    
     public static boolean checkYN(){
      
         while ( true) {
            String result = checkInputString();
            if (result.length() == 1) {
                char resultChar = result.charAt(0);
                if (resultChar == 'y' || resultChar == 'Y') {
                    return true;
                }
                if (resultChar == 'n' || resultChar == 'N') {
                    return true;
                }
            }
            System.err.println("Re-input");
        }
    }

}
