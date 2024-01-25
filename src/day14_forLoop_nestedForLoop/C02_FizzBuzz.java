package day14_forLoop_nestedForLoop;

import java.util.Scanner;

public class C02_FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");

        int sayi = scanner.nextInt();

        for (int i = 1; i < sayi; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("fizzBuzz ");
            } else if (i % 5 == 0) {
                System.out.print("buzz ");
            } else if (i % 3 == 0) {
                System.out.print("fizz ");
            } else System.out.print(i + " ");

        }


    }
}
