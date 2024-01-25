package day08_nestedIfElseStatements;

import java.util.Scanner;

public class C04_nestedIfElseEmeklilik {
    public static void main(String[] args) {
        //Soru 1- Kullanicidan cinsiyetini ve yasini alin,
        // Kadin, 60 yas ve uzeri ,
        // Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        // veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen cinsiyetinizi giriniz\nE: Erkek\t\t K: Kadın ");

        char cinsiyet = scanner.next().toUpperCase().charAt(0);

        System.out.print("Lütfen yaşınızı giriniz: ");

        int yas = scanner.nextInt();


        if (cinsiyet == 'E') {


            if (yas > 80 || yas < 15) {
                System.out.println("Bu yaşlar için emeklilik sistemimiz çalışmamaktadır!");
            } else if (yas >= 65) {
                System.out.println("Emekli olabilirsiniz!");
            } else {
                System.out.println("Emekliliğinize " + (65 - yas) + " yıl var");
            }
        } else if (cinsiyet == 'K') {
            if (yas > 75 || yas < 15) {
                System.out.println("Bu yaşlar için emeklilik sistemimiz çalışmamaktadır!");
            } else if (yas >= 60) {
                System.out.println("Emekli olabilirsiniz!");
            } else {
                System.out.println("Emekliliğinize " + (60 - yas) + " yıl var");
            }
        } else {
            System.out.println("Hatalı giriş!\nCinsiyetiniz için 'E' veya 'K' seçmelisiniz!");
        }

    }
}
