package day03_scanner_dataCasting;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {
        //Soru 5- Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
        // girilen bilgiler : J Doe, 44
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen isminizi giriniz: ");
        char isimIlkHarf = scanner.nextLine().charAt(0);

        System.out.print("Lütfen soyisminizi giriniz: ");
        String soyisim = scanner.nextLine();

        System.out.print("Yaşınızı giriniz: ");
        int age = scanner.nextInt();

        System.out.println("Girilen bilgiler : " + isimIlkHarf + " " + soyisim + ", "+ age);



    }
}
