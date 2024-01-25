package day19_arrays;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {

        int[] sayilar = {3,-5,4,6,-2,9,1};

        // sayilar arrey'indeki tum sayileri 3 artirip, kaydedin.

        sayilar = C02_ArrayinElemanlariniArtirma.elemanlariArtir(sayilar,3);
        String[] isimler = {"ali", "veli", "saido", "sahil", "saido", "ali", "saido", "mehmet"};

        System.out.println(Arrays.toString(sayilar));

        // sayilar array'inin yeni halinde pozitif elementlerin toplamini yazdirin.

        System.out.println("Pozitif elemanlarin toplami: " +C03_pozitifSayilariToplama.pozitifElemanlariTopla(sayilar));

        //isimler arryinde mehmet ismi kac kere kullanımıs yazdirin
        C04_KullanimAdediBulma.elemanArama(isimler, "mehmet");

        C04_KullanimAdediBulma.elemanArama(isimler, "ali");

    }
}
