package day01_javaTemelBilgiler;

import java.util.Scanner;

public class C01_HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dilediğiniz metni giriniz:");
        String yazdir = scanner.nextLine();
        System.out.println(yazdir);


    }
}
