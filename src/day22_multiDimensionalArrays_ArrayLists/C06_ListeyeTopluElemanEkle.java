package day22_multiDimensionalArrays_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class C06_ListeyeTopluElemanEkle
{
    public static void main(String[] args)
    {
        // tekrarsiz hale gelen array DEĞİL, bizim oluşturduğumuz liste
        // array'e yeni bir array degeri atayip, listedeki yeni array'e tasımalıyız
        int[] arr = {3,5,2,1,5,3,6,8,2,3,4,5};

        List<Integer> sayilar = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            sayilar.add(arr[i]);
        }
        System.out.println(sayilar); // [3, 5, 2, 1, 5, 3, 6, 8, 2, 3, 4, 5]
    }
}
