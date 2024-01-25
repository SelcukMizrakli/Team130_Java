package day20_arrays;

import java.util.Arrays;

public class C05_CiftSayiToplama {
    public static void main(String[] args) {
        // verilen int bir array'deki
        // cift sayilarin toplamini yazdirin

        int[] arr = {1,2,3,4,5,6,7,8,9};
        int toplam = 0;
        for (int sayi : arr ) {
            if (sayi %2==0){
                toplam+=sayi;
                System.out.println(sayi);
            }
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(toplam);
    }
}
