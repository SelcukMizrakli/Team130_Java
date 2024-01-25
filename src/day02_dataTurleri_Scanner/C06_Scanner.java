package day02_dataTurleri_Scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Soru 3- Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
        // Isminiz : John
        // Soyisminiz : Doe
        // Yasiniz : 44
        // Kaydiniz basariyla tamamlanmistir.

        int yas;
        System.out.print("Yaşınızı giriniz: " );
        yas = scanner.nextInt();

        scanner = new Scanner(System.in);
        String isim,soyisim;
        System.out.print("İsminizi giriniz: ");
        isim = scanner.nextLine();
        System.out.print("Soyisminizi giriniz: ");
        soyisim = scanner.nextLine();

        System.out.println("İsminiz : " + isim );
        System.out.println("Soyisminiz : " + soyisim);
        System.out.println("Yaşınız : " + yas);
        System.out.println("Kaydiniz basariyla tamamlanmistir.");

    }
}
