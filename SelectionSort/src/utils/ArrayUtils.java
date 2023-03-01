/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

/**
 *
 * @author khang
 */
public class ArrayUtils {

    /**
     *
     * @param arr
     */
    public static void displayIntArray(int arr[]) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static int[] randomIntArray(int length, int min, int max) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = NumberUtils.getRandomNumberInRange(min, max);
        }
        return array;
    }

    public static void swap(int array[], int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }
    
    
    public static void selectionSort(int arr[]){
        int n = arr.length;
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;  // Find the minimum element in unsorted array
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx]){
                    min_idx = j;
                }
            int temp = arr[min_idx]; // Swap the found minimum element to first
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }


     public static int[] cloneArray(int arr[]) {
        int ret[] = new int[arr.length];
        int c = 0;
        for (int i : arr) {
            ret[c++] = i;
        }
        return ret;
    }
}
