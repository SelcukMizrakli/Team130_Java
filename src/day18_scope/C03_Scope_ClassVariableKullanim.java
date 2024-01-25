package day18_scope;

public class C03_Scope_ClassVariableKullanim {

    /*
        Kural 4 - static veriable'lar her yere gidebilirler
                  static olmayan veriable (instance veriable)'lar ise static olanlara giremez.

        Kural 5 - class level veriable'lar deger atanmadan olusturulabildigi gibi deger atanmadan kullanilabilirler
                  biz deger atamazsak, Java Default deger olarak;
                  - non-primitive'lere ==> null
                  - sayisal primitive'lere ==> 0
                  - boolean veriable'lara ==> false
                  - char veriable'lara ==> ''      hiclik degeri atanir.
      */

    static String s;
    static int a;

    boolean bl;
    char chr;


    public static void main(String[] args) {
        System.out.println(s);  //null

        System.out.println(a);  //0

        /*
                Eger static olmayan class uyelerine static alandan ulasmak istersek once class'dan bir obje olusturulmali
                sonra o obje uzerinden  static olmayan uyeler kullanilmalidir

         */

        C03_Scope_ClassVariableKullanim obj = new C03_Scope_ClassVariableKullanim();

        System.out.println(obj.bl);
        System.out.println(obj.chr);    //

    }

    public static void method1(){

    }

    public void method2(){

    }

}
