/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author khang
 */
public class NumberUtils {

    public static int getRandomNumberInRange(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }

    public static int inputInt(String mess, int min, int max) {
        int ret;
        Scanner scan = new Scanner(System.in);
        System.out.println(mess);
        do {
            try {
                ret = Integer.parseInt(scan.nextLine());
                if (ret < min || ret > max) {
                    throw new IndexOutOfBoundsException();
                }
                return ret;
            } catch (NumberFormatException e) {
                System.out.println("Only allowed to enter integer numbers");
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Please enter integer number in range [" + min + "," + max + "]");
            } catch (Exception e) {
                e.printStackTrace();
            }

        } while (true);

    }

    public static int inputInt(String mess) {
        return inputInt(mess, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

}
