package day12_StringManipulations;

import java.util.Scanner;

public class C03_ReplaceAll {
    public static void main(String[] args) {

        // kullanicidan bir metin isteyin
        // kullanicinin girdiği metinden space disindaki tüm karakterleri
        // ve sayilari silip, metni yeni haliyle yazin

        // input: "J1*a34_va+12 C87an.90d654ir,"; output: Java Candir

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen metni giriniz: ");
        String metin = scanner.nextLine();

        // once sayilardan kurtulalim

        metin = metin.replaceAll("\\d","");
        System.out.println(metin);

        //space'i koruma altına almak icin herhangi bir rakamla replace yapalim

        metin = metin.replaceAll("\\s","5");

        // özel karakterlerden kurtulalım

        metin = metin.replaceAll("\\W","");

        metin = metin.replaceAll("\\_", "");
        metin = metin.replaceAll("5"," ");

        System.out.println(metin);

    }
}
