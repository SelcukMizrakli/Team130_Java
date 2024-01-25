package day07_ifElseStatements;

import java.util.Scanner;

public class C01_ifElseStatements {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan bir karakter girmesini isteyin,
        // girilen karakterin buyuk harf olup olmadigini yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen bir karakter giriniz: ");

        char karakter = scanner.next().charAt(0);

        if (karakter >= 'A' && karakter <= 'Z'){
            System.out.println("Girilen karakter büyük harftir.");
        }else System.out.println("Girilen karakter büyük harf değil");

    }
}
