package day33_inheritance;

public class C07_Vectra extends C06_Opel{
    C07_Vectra(){
        super();    // önce extends yapilan class
        System.out.println("Vectra constructor calisti");
    }

    String strChild = "Vectra class Child";
    String model = "Vectra";

    public static void main(String[] args) {
        /*
            bir clasas'dan obje oluşturup, o class'da var olan özellikleri edinebilmek
            için MUTLAKA bir CONSTRUCTOR çalışmalıdır.

            extends keyword kullanan bir class'da her constructor'in ilk satirinda
            MUTLAKA bir constructor call bulunur.

            EGER gorunur bir constructor call yoksa Java default olarak
            super() constructor call koyar yani default olarak once parent'daki
            parametresiz constructor'in caalismasini ister.
         */

        C07_Vectra vectra = new C07_Vectra();

        System.out.println(vectra.strGP);   //Car Class Grand parent
        System.out.println(vectra.strP);    //Opel class Parent
        System.out.println(vectra.strChild);    //Vectra class Child
        System.out.println(vectra.marka);   //Opel
        System.out.println(vectra.model);   //Vectra
    }
}
