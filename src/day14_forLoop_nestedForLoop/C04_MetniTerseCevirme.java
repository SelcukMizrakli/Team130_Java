package day14_forLoop_nestedForLoop;

import java.util.Scanner;

public class C04_MetniTerseCevirme {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir metin giriniz: ");

        String metin = scanner.nextLine();

        char cikti;

        String yeniMetin = "";

        int g = metin.length() - 1;

        for (int i = g; i >= 0; i--) {
            cikti = metin.charAt(i);
            yeniMetin = yeniMetin + cikti;
            System.out.print(cikti + " ");
        }
        System.out.println("");
        System.out.println(yeniMetin);

    }
}
