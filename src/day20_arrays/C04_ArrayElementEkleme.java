package day20_arrays;

import java.util.Arrays;

public class C04_ArrayElementEkleme {
    public static void main(String[] args) {
        //Soru 7- Verilen bir array’e istenen bir elemani ekleyip
        // bize donduren bir method yazin, eski array’e yeni degeri atayin.

        int [] arr = {3,6,7,9};

        int eklenecekElemen = 1;

        int [] arr2 = new int[arr.length+1];
        arr2[arr.length] = eklenecekElemen;

        for (int i = 0; i < arr2.length-1; i++) {
            arr2[i] = arr[i];
            System.out.println("arr2: " +Arrays.toString(arr2));
        }
        arr = arr2;
        System.out.println("arr: " +Arrays.toString(arr));

        arr = arrayElementEkleme(arr,5);
        arr = arrayElementEkleme(arr,7);
        arr = arrayElementEkleme(arr,3);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] arrayElementEkleme(int[] arr,int eklenecekEleman){
        int [] arr2 = new int[arr.length+1];

        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        arr2[arr2.length-1] = eklenecekEleman;
        return arr2;
    }
}
