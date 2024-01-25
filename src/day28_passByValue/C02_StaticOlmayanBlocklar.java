package day28_passByValue;

public class C02_StaticOlmayanBlocklar {


    C02_StaticOlmayanBlocklar(){
        System.out.println("Constructor calisti");
    }

    {

        /*
        Static olmayan blocklar
        obje olusturulacagi zaman
        constructor'dan hemen once calisir.

        Bir obje olusturulmadan once yapilmasi gereken on ayar varsa kullanilir

         */

        System.out.println("1. Static olmayan block calisti");
    }

    public static void main(String[] args) {
        System.out.println("Main method calisti");

        C02_StaticOlmayanBlocklar obj = new C02_StaticOlmayanBlocklar();
        C02_StaticOlmayanBlocklar obj2 = new C02_StaticOlmayanBlocklar();
    }

    {
        System.out.println("2. Static olmayan block");
    }

    static {
        System.out.println("Static olan method");
    }

}
