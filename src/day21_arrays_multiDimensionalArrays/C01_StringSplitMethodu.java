package day21_arrays_multiDimensionalArrays;

import java.util.Arrays;

public class C01_StringSplitMethodu {

    public static void main(String[] args) {
        String str = "java gun gectikce guzellesiyor";

        // e harflerinden str'ı parcalara ayirin

        System.out.println(Arrays.toString(str.split(" ")));


        System.out.println(Arrays.toString(str.split("e")));




        //verilen bir arama sonucunda, arama sonucunun 1000'den fazla olduğunu test edin


        String aramaSonucu = "1-48 of over 5,000 result for java";
    }
}
