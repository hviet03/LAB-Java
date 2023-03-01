package UI;

import BO.Convert;
import BO.Validate;
import Utils.NumberUtils;

public class Main {
    
    public static void displayConvert(String other, int base) {
        Convert a = new Convert();
        int choice = display("binary", "decimal", "hexadecimal");
        switch (choice) {
            case 1:
                System.out.println("Binary: " + a.decToOther(a.otherToDec(other, base), 2));
                break;
            case 2:
                System.out.println("Decimal: " + a.otherToDec(other, base));
                break;
            case 3:
                System.out.println("Hexa: " + a.decToOther(a.otherToDec(other, base), 16));
                break;
        }
    }
    
    public static int menu(){
        System.out.println("1. Convert From Binary.");
        System.out.println("2. Convert From Decimal.");
        System.out.println("3. Convert From Hexa.");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        int choice = NumberUtils.checkInputIntLimit(1, 4);
        return choice;
    }
    
     public static int display(String toCase1, String toCase2, String toCase3) {
        System.out.println("1. Convert to " + toCase1);
        System.out.println("2. Convert to " + toCase2);
        System.out.println("3. Convert to " + toCase3);
        System.out.print("Enter your choice: ");
        int result = NumberUtils.checkInputIntLimit(1, 3);
        return result;
    }



    public static void main(String[] args) {
        //loop until user want to exit
        Convert a = new Convert();
        while (true) {
            int choice = menu();
            switch (choice) {
                case 1:
                    String bin = Validate.checkInputBinary();
                    displayConvert(bin, 2);
                    break;
                    
                case 2:
                    String dec = Validate.checkInputDecimal();
                    displayConvert(dec, 10);                   
                    break;
                    
                case 3:
                    String hex = Validate.checkInputHexaDecimal();
                    displayConvert(hex, 16);
                    break;
                case 4:
                    return;
            }
            System.out.println();
        }
    }
}