package day28_passByValue;

import java.util.Arrays;

public class C05_PassByValue_CokElementliYapilar {

    public static void main(String[] args) {
        int [] arr = {3,4,5};

        /*

        verilen int array'in elementlerinin degerlini 2 artirip, array'in yeni halini
        yazdiran bir method olusturun.

        */

        System.out.println("Main method, method call oncesi : " + Arrays.toString(arr));

        degerIkiArtir(arr);

        System.out.println("Main method, method call sonrasi : " + Arrays.toString(arr));

        /*

        verilen array'e 5 elemanli yeni bir array atayip
        yeni halini yazdiran bir method olusturun.

        */
        System.out.println("Main method, 2.method call oncesi : " + Arrays.toString(arr));

        yeniArrayAta(arr);

        System.out.println("Main method, 2.method call sonrasi : " + Arrays.toString(arr));



    }

    public static void degerIkiArtir(int [] arr){

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 2;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void yeniArrayAta(int[] arr){
        arr = new int[5];
        System.out.println("2.Method'da arr : " +Arrays.toString(arr)); //[0, 0, 0, 0, 0]
    }
}
