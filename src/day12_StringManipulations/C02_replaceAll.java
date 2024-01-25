package day12_StringManipulations;

public class C02_replaceAll {
    public static void main(String[] args) {
        String str = "J1a34va12 C87an90d654ir";

        //metinden tüm sayıları temizleyip
        //metni kaydedin.

        str = str.replaceAll("\\d","");

        System.out.println(str);    //Java Candir
    }
}
