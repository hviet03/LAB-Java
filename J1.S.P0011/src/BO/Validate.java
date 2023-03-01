package BO;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author win
 */
import java.util.Scanner;

public class Validate {

    private final static Scanner in = new Scanner(System.in);
    private static final String BINARY_VALID = "[0-1]*";
    private static final String DECIMAL_VALID = "[0-9]*";
    private static final String HEXADECIMAL_VALID = "[0-9A-F]*";

    //check user input number limit

    //check user input number binary
    public static String checkInputBinary() {
        System.out.print("Enter number binary: ");
        String result;
        //loop until user input correct
        while (true) {
            result = in.nextLine().trim();
            if (result.matches(BINARY_VALID)) {
                return result;
            }
            System.err.println("Must be 0 and/or 1");
            System.out.print("Enter again: ");
        }
    }

    //    //check user input number binary
    public static String checkInputDecimal() {
        System.out.print("Enter number decimal: ");
        String ret;
        //loop until user input correct
        while (true) {
            ret = in.nextLine().trim();
            if (ret.matches(DECIMAL_VALID)) {
                return ret;
            }
            System.err.println("Must be 0-9");
            System.out.print("Enter again: ");
        }
    }

    //    //check user input number binary
    public static String checkInputHexaDecimal() {
        System.out.print("Enter number hexadecimal: ");
        String result;
        //loop until user input correct
        while (true) {
            result = in.nextLine().trim();

            if (result.toUpperCase().matches(HEXADECIMAL_VALID)) {
                return result;
            }
            System.err.println("Must be 0-9 and a-f");
            System.out.print("Enter again: ");
        }
    }
}