package day09_switchStatements;

import java.util.Locale;
import java.util.Scanner;

public class C01_ifElseStatements {
    public static void main(String[] args) {
        //Soru 4- Kullanicidan ISTQB kisaltmadaki harflerden anlamini ogrenmek istedigini alin ve girilen harfin karsiligini yazdirin.
        // I : International
        // S : Software
        // T : Testing
        // Q : Qualifications
        // B: Board

        Scanner scanner = new Scanner(System.in);

        System.out.print("ISTQB'den anlamını öğrenmek istediğiniz harfi giriniz: ");
        char harf = scanner.next().toUpperCase().charAt(0);

        if (harf == 'I') {
            System.out.println("I : International");
        } else if (harf == 'S') {
            System.out.println("S : Software ");
        } else if (harf == 'T') {
            System.out.println("T : Testing");
        } else if (harf == 'Q') {
            System.out.println("Q : Qualitifications");
        } else if (harf == 'B') {
            System.out.println("B : Board");
        } else {
            System.out.println("Kısaltmada olan harflerden birini tercih edin!");
        }


    }
}
