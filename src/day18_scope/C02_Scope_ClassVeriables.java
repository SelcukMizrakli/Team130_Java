package day18_scope;

public class C02_Scope_ClassVeriables {

    /*
        Static keyword bir nevi statu belirtir.
        static unvanini alan veriable veya methodlar, statik olmayan
        class uyelerini kabul etmezler.

       static uyeler ellerini kollarini sallayarak her yere gidebilirler
       ama kendi içlerine static olmayan uyeleri almazlar.
    */

    /*

     */

    static String s;

    static int a;

    boolean bl;
    char chr;

    public static void main(String[] args) {

        staticMethod1();

        //staticOlmayanMethod2();
        //Non-static method 'staticOlmayanMethod2()' cannot be referenced from a static context

        s = "Java";
        a = 20;

        //  bl = true;      //Non-static field 'bl' cannot be referenced from a static context
        //  chr = 'a';      //Non-static field 'bl' cannot be referenced from a static context
    }

    public static void staticMethod1() {

        //staticOlmayanMethod2();
        //Non-static method 'staticOlmayanMethod2()' cannot be referenced from a static context

        s = "Java";
        a = 20;

        //  bl = true;      //Non-static field 'bl' cannot be referenced from a static context
        //  chr = 'a';      //Non-static field 'bl' cannot be referenced from a static context
    }

    public void staticOlmayanMethod2() {

        staticMethod1();

        System.out.println(s);
        System.out.println(a);

        System.out.println(bl);
        System.out.println(chr);

    }

}
