package day14_forLoop_nestedForLoop;

import java.util.Scanner;

public class C05_AsalSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        int flag = 10;

        for (int i = 2; i < sayi - 1; i++) {

            if (sayi % i == 0) {
                System.out.println("Girilen sayı asal sayı değil");
                break;
            }
        }

        for (int i = 2; i < sayi - 1; i++) {

            if (sayi % i == 0) {
                flag++;
            }
        }

        if (flag == 10){
            System.out.println(sayi  + " bir asal sayıdır.");
        } else {
            System.out.println(sayi + " bir asal sayı değildir.");
        }

    }
}
