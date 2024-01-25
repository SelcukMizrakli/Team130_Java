package day28_passByValue;

public class C01_StaticBlocks {

    C01_StaticBlocks(){
        System.out.println("Constructor Çalıştı.");
    }

    public static void main(String[] args) {

        System.out.println("Main method Calisti");

        C01_StaticBlocks obj = new C01_StaticBlocks();
    }

    static {

        /*
        BU YAPIYA STATIC BLOCK DENIR
        static blocklar herseyden, hatta main method'dan bile once calisir.
        Eger bir class icin main method calismadan yapilmasi gereken on ayar varsa
        static block kullanilarak yapilir.

        Bir Class'da birden fazla static block olabilir. Eger birden fazla static block
        varsa, kendi iclerinde once yukaridaki calisir.
         */
        System.out.println("Static block calisti.");
    }

    static {
        System.out.println("2. Static block calisti");
    }

    public static void method1(){
        System.out.println("Method1 calisti.");
    }
}
