package UI;

import bo.SelectionSort;
import utils.ArrayUtils;
import utils.NumberUtils;

/**
 *
 * @author 
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Wellcome to my demo project!");
        int arrLength = NumberUtils.inputInt("Input length of Array: ", 1, Integer.MAX_VALUE);
        int arr[] = ArrayUtils.randomIntArray(arrLength, 1, arrLength);
        SelectionSort b = new SelectionSort(arr);
        b.displayCompare();
    }
}
