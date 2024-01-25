package day43_maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class C01_MapOlusturmaElementEkleme {
    public static void main(String[] args) {

        /*
            Bir ogrenciyi map'e eklemek için put(key,value) kullaniriz

            bir ogrencinin value'sune ulasmak isterseniz
            - ogrenciMap.get(ogrenciNo) ile String olarak value'yu alip kaydederiz
            - value, pekçok bilgi barindirdigindan, her bir bilgiye ulasmak için
                value.split("-") ile value'yu array'e ceviririz.
            -


         */

        Map<Integer,String> ogrenciMap = new HashMap<>();
        ogrenciMap.put(101,"Ali-Can-10-K-MF");
        //bu ogrenci için key : 101
        //              value : "Ali-Can-10-K-MF"
        // value String olmaka zorunda degil list, array, Integer, Map, Queue

        String value101 = ogrenciMap.get(101);
        System.out.println("101'in tum bilgisi : " + value101);


        // 101 numarali ogrencinin soyismini yazdirin
        String[] ogrenci101BilgilerArr = value101.split("-");
        System.out.println(Arrays.toString(ogrenci101BilgilerArr));

        System.out.println("101 numarali ogrenci soyismi : " + ogrenci101BilgilerArr[1]);

        // 101 numarali ogrencinin bolumunu yazdirin

        System.out.println("101 numarali ogrencinin bolumu : " + ogrenci101BilgilerArr[4]);

        // 101 numarali ogrencinin isim ve soyismini yazdirin

        System.out.println("101 numarali ogrencinin isim soyismi : " + ogrenci101BilgilerArr[0] + " " + ogrenci101BilgilerArr[1]);

        // 101 numarali ogrencinin isim ve soyismini yazdirin, soyismin harflerini büyük harf ile yazdirin

        System.out.println("101 numarali ogrencinin isim soyismi : " + ogrenci101BilgilerArr[0] + " " + ogrenci101BilgilerArr[1].toUpperCase());
    }
}
