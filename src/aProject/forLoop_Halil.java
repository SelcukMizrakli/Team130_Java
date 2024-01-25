package aProject;

import java.util.Scanner;

public class forLoop_Halil {
    public static void main(String[] args) {
        //Soru 6- Kullanicidan 20’den kucuk bir sayi alip,
        //bu sayinin faktoryel degerini hesaplayin.
        //Konsolda faktoryel hesabinin yapilisini da yazdirin.
        //Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 20'den küçük bir pozitif tam sayı giriniz");
        byte sayi = scanner.nextByte();


        if (sayi <= 0 || sayi >= 20) {
            System.out.println("Geçerli bir sayı girilmedi. Lütfen 0 ile 20 arasında bir sayı girin.");
        } else {
            long faktoriyel = 1;
            System.out.print(sayi + "! = ");

            for (int i = sayi; i > 0; i--) {
                faktoriyel *= i;
                System.out.print(i);
                if (i > 1) {
                    System.out.print(" ");
                }
            }
            System.out.println(" = " + faktoriyel);
        }
    }
}
