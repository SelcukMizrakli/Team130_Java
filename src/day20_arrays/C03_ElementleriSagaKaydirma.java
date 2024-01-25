package day20_arrays;

import java.util.Arrays;

public class C03_ElementleriSagaKaydirma {
    public static void main(String[] args) {
        //Soru 3- Verilen bir array’deki tum elementleri bir saga kaydirip,
        // sondaki elementi de basa tasiyacak bir method olusturun,
        // array’i yeni haliyle kaydedin.
        // Orn : input : [4,5,6,7]  array’in son hali. : [7,4,5,6]
        int[] arr = {4,5,6,7};
        int[] arr2 = new int[4];
        for (int i = 0; i <= arr.length-1; i++) {
            if (i == arr.length-1)
            {
                arr2[0] = arr[i];
            }else{
                arr2[i+1]=arr[i];
            }
        }
        System.out.println("1. Array: " + Arrays.toString(arr) + "\n2. Array: " + Arrays.toString(arr2));
        ElementleriSagaKaydirma(arr);

        int[] sayilar = {3,0,2};
        sayilar = ElementleriSagaKaydirma(sayilar);
        System.out.println(Arrays.toString(sayilar));
    }

    public static int[] ElementleriSagaKaydirma(int[] arr){
        int temp = arr[arr.length-1];

        for (int i =arr.length-1; i >=1 ; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
        return arr ;
    }
}
