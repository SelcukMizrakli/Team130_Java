package day22_multiDimensionalArrays_ArrayLists;

import java.util.Arrays;

public class C03_MDA {
    public static void main(String[] args) {
        //Soru 2- Verilen 2 katli bir array’de ayni index’e sahip elementleri toplayip, yeni olusturacagimiz tek katli bir array’e bu toplamlari atayin.
        // input :     int[][] arr = {{3,4,5}, {2,3,6,7}, {1,2,3}, {2,4}};
        //  output:                      [5, 7, 11]

        int[][] arr = {{3,4,5,8}, {2,3,6,7}, {1,2,3,3}, {2,4,5,6}};

        int enKisaInnerlength = arr[0].length;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length <= enKisaInnerlength){
                enKisaInnerlength = arr[i].length;
            }
        }
        System.out.println(enKisaInnerlength);

        int[] output = new int[enKisaInnerlength];

        for (int i = 0; i <enKisaInnerlength; i++) {
            for (int j = 0; j < arr.length; j++) {
                output[i] += arr[j][i];

            }
        }
        System.out.println(Arrays.toString(output));
    }
}
