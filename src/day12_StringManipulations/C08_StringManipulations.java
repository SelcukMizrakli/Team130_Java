package day12_StringManipulations;

import java.util.Scanner;

public class C08_StringManipulations {
    public static void main(String[] args) {
        //Soru 6 : Kullanicidan girilen bir String alin,
        // String’in uzunlugu cift sayi ise tam ortasina :) ekleyin,
        // String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :( yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir metin giriniz: ");
        String gtr = scanner.nextLine();



        if (gtr.length()%2==0){

            gtr = gtr.substring(0,gtr.length()/2) + ":)" + gtr.substring(gtr.length()/2,gtr.length());

            System.out.println(gtr + " ibanıma para gönder");
        } else {

            gtr = gtr.substring(0,gtr.length()/2) + ":(" + gtr.substring((gtr.length()+1)/2);
            System.out.println(gtr + " ibanını ver");

        }
    }
}
