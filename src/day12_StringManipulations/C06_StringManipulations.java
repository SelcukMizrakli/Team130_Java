package day12_StringManipulations;

import java.util.Scanner;

public class C06_StringManipulations {
    public static void main(String[] args) {
        //Soru 4 : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin
        //  ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        //  eger tum sartlari saglarsa, “sifre basariyla kaydedildi” yazdirin
        //  - ilk harf kucuk harf olmali
        //  - son karakter rakam olmali
        //  - sifre bosluk icermemeli
        //  - uzunlugu en az 10 karakter olmali

        Scanner scanner = new Scanner(System.in);

        System.out.print("Sifrenizi giriniz: ");
        String pass = scanner.nextLine();

        int flag = 10;

        char ilkHarf = pass.charAt(0);

        if (ilkHarf<'a' || ilkHarf > 'z'){
            System.out.println("İlk karakter küçük harf olmalı");
            flag++;
        }


        char sonHarf = pass.charAt(pass.length()-1);

        if (!(sonHarf >= '0' && sonHarf <='9')){
            System.out.println("Son karakter rakam olmali");
            flag++;
        }

        if (pass.contains(" ")){
            System.out.println("Şifre boşluk içermemeli");
            flag++;
        }

        if (pass.length() < 10 ){
            System.out.println("Sifre 10 karakterden az olamaz");
            flag++;
        }

        if (flag == 10){
            System.out.println("Şifre başarıyla kaydedildi");
        }

        System.out.println(pass);



    }
}
