package day24_arrayLists_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class C03_ArrayiListHalineDonusturme {
    public static void main(String[] args) {

        Integer[] sayilarArray = {1,2,3,6,7,4,3,5};

        /*
            Bir Array'i List haline getirmek için en güvenilir yontem
            bir loop ile tum elementleri List'e kopyalamaktir.

            Aslinda daha kisa bir yol vardir ama iki buyuk yan etkisi oldugundan
            bunlara dikkat etmek gerekmektedir.

            1- Oluşturduğumuz liste Arrays Class'i ile olusturuldugundan ekleme
            cıkarma gibi listenin uzunlugunu degisterecek islemlere IZIN VERMEZ.

            2- Array ve bu Array'den olusturulan List birbiri ile bagimli kalir.
            Birinde sonradan yapilan degisikler, otomatik olarak digerine de islenir.

        */

        List<Integer> sayilarListesi = Arrays.asList(sayilarArray);

        System.out.println("Sayilar Listesi: " + sayilarListesi);
        System.out.println( "Sayilar Arrayi: " + Arrays.toString(sayilarArray));

        // sayilar listesine 9'u ekleyin
        //sayilarListesi.add(9);  //UnsupportedOperationException

        Object silinecekElement = 7;
        //sayilarListesi.remove(silinecekElement);//UnsupportedOperationException

        sayilarArray[2] = 10;

        System.out.println("Array'de Update sonrasi Sayilar Listesi: " + sayilarListesi);
        System.out.println( "Array'de Update sonrasi Sayilar Arrayi: " + Arrays.toString(sayilarArray));

        List<Integer> mahmutTuncer = new ArrayList<>();
        mahmutTuncer.add(10);
        mahmutTuncer.add(20);
        mahmutTuncer.add(31);

        Integer[] kontrolArrayi = {10,20,31};

        // fiyat listesinin, kontrol listesi olarak verilen Array ile ayni oldugunu test edin.

        List<Integer> kontrolListesi = Arrays.asList(kontrolArrayi);

        if (mahmutTuncer.equals(kontrolListesi)){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");
    }
}
