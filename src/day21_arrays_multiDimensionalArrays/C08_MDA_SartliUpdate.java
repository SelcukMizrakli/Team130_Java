package day21_arrays_multiDimensionalArrays;

import java.util.Arrays;

public class C08_MDA_SartliUpdate {
    public static void main(String[] args) {
        // verilen 2 katli multi dimensional array'de
        // elementleri icinde bulundugu inner arraydeki index'i kadar artirin

        int[][] arr = {{4,-1,-5},{6,-9,2},{1,5,-8,-4,3,6}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] += j ;

            }
            System.out.println(Arrays.toString(arr[i]));
        }


    }
}
