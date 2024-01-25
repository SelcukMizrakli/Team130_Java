package day18_scope;

public class C01_Scope_LocalVeriables {

    public static void main(String[] args) {

        /*
            Kural-1 - Bir method içerisinde oluşturulan veriable'lara local veriable denir
            local veriable'lar sadece oluşturuldukları method'da kullanilabilirler
            diger methodlarda kullanilamaz.
        */

        String str = "Java Candir";
        //System.out.println(sayi);

        int a;
        boolean bl;
        char c;

        //  System.out.println(a);
        //  a++;

        bl = true;

        c = 'a';

        /*
            Kural-2 - Local veriable'lar deger atanmadan olusturulabilir, ancak deger atamadana kullanilamazlar
        */

        for (int i = 0; i < 10; i++) {

            System.out.print(i);  // 0123456789
            String s = "Java";
        }
        //  System.out.println(s);      //
        //  System.out.println(i);      //

        /*
            Kural-3 -   Her ne kadar bir method'un icinde olsa da Loop'lar da ayri bir local alandir
                        Loop icerisinde olusturulan veriable'lar Loop disinde KULLANILAMAZ
        */


    }

    public  static  void method1(){

        //System.out.println(str);
        int sayi = 10;

    }

}
