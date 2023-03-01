/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import utils.ArrayUtils;

/**
 *
 * @author win
 */
public class SelectionSort {
    
    private int arr[];

    public SelectionSort(int[] arr) {
        this.arr = arr;
    }

    private int[] sort(boolean sortOnOriginArr) {
        int array[] = arr;
        if (!sortOnOriginArr) {
            array = ArrayUtils.cloneArray(arr);
            }
        ArrayUtils.selectionSort(array);
                      
        return array;
    }

    public int[] getSortedArray() {
        return sort(false);
    }

    public void displayCompare() {
        System.out.println("Original arr:");
        ArrayUtils.displayIntArray(arr);
        System.out.println("Sorted arr");
        ArrayUtils.displayIntArray(getSortedArray());
      
    }
}


