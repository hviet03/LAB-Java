/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BO;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author win
 */
public class Date {
        
     public void getDate(){
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        LocalDate date = LocalDate.parse(line, parser);      
    }
   
}

