package day22_multiDimensionalArrays_ArrayLists;

import java.util.Arrays;

public class C02_MDA {
    public static void main(String[] args) {

        //Soru 2- Verilen 2 katli bir array’de ayni index’e sahip elementleri toplayip, yeni olusturacagimiz tek katli bir array’e bu toplamlari atayin.
        // input :     int[][] arr = {{3,4,5}, {2,3,6,7}};
        //  output:                      [5, 7, 11]

        int[][] arr = {{3, 4, 5,1,9,2,3,4}, {2, 3, 6, 7,8}};

        int outputLength = arr[0].length > arr[1].length ? arr[1].length : arr[0].length;

        int[] output = new int[outputLength];

        for (int i = 0; i < outputLength; i++) {

            output[i] += arr[0][i] + arr[1][i];

        }
        System.out.println(Arrays.toString(output));


    }
}
