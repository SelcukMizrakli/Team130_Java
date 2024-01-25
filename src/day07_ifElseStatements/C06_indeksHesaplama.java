package day07_ifElseStatements;

import java.util.Scanner;

public class C06_indeksHesaplama {
    public static void main(String[] args) {
        //Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip
        // vucut kitle endeksini hesaplayin (kilo*10000 / (boy *boy))
        // vucut kitle endeksi
        // 30’dan buyukse obez,
        // 25-30 arasi ise kilolu
        // 20-25 arasi ise normal,
        // 20’den kucukse zayif yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen kilonuzu kg olarak giriniz: ");
        double kilo = scanner.nextDouble();

        System.out.print("Boyunuzu cm olarak giriniz: ");
        double boy = scanner.nextDouble();

        double vke = (kilo*10000 / (boy*boy));

        System.out.println("Vücut kitle indeksiniz: " + vke);

        if (vke > 50 || vke < 10){
            System.out.println("Değerleri yanlış girdiniz.");
        } else if (vke >= 30) {
            System.out.println("Obez");
        } else if (vke >=25) {
            System.out.println("Kilolu");
        } else if (vke >=20) {
            System.out.println("Normal");
        } else {
            System.out.println("Zayıf");
        }


    }
}
