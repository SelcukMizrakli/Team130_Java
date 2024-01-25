package day11_StringManipulation;

import java.util.Scanner;

public class C03_IndexOfSoru {
    public static void main(String[] args) {

        // Kullanicidan bir cumle ve cumlede aranacak metin isteyin cümle ve metin
        // karsilastirip asagidaki 3 durumdan birini yazdirin
        // 1- verilen metin cumlede kullanilmamis
        // 2- verilen metin cumlede sadece 1 kere kullanilmis
        // 3- verilen metin cumlede 1'den fazla kere kullanilmis

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir cümle giriniz. ");
        String str = scanner.nextLine();

        System.out.print("Bu cümlede aranacak metin isteyin: ");
        String str2 = scanner.nextLine();



        if (!str.contains(str2)){
            System.out.println("Verilen metin cumlede kullanilmamistir: " + str2);
        } else if (str.indexOf(str2) == str.lastIndexOf(str2)) {
            System.out.println("Verilen metin cümlede 1 kere kullanilmistir");
        } else {
            System.out.println("Verilen metin 1'den fazla kere kulanilmistir");
        }

    }
}
