/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.util.Scanner;
import BO.Date;

/**
 *
 * @author win
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first date [dd/mm/yyyy]: ");
        String date1 = sc.nextLine();
        System.out.println("Please enter the second date [dd/mm/yyyy]: ");
        String date2 = sc.nextLine();  
        Date a = new Date();
        a.getCompare(date1, date2);
    }
}