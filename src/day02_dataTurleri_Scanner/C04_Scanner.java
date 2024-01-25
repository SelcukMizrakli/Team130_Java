package day02_dataTurleri_Scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("İsminizi giriniz: ");
        String isim = scanner.nextLine();

        System.out.println("İsminiz: " + isim);


    }
}
