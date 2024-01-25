package day03_scanner_dataCasting;

import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Soru 6- Kullanicidan bir cemberin yaricapini alip, cevresini ve alanini yazdirin.


        double pi = 3.14,r,cevre,alan;

        System.out.print("Lütfen çemberin yarı çapını giriniz: ");

        r = scanner.nextDouble();

        cevre = (2*pi*r);
        alan = (pi*r*r);

        System.out.println("Çemberin Çevresi : " + cevre + "\nÇemberin Alanı : " + alan);

    }
}
