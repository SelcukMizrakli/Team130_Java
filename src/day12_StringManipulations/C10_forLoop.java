package day12_StringManipulations;

public class C10_forLoop {
    public static void main(String[] args) {

        // 5 kere hello world yazdirin

        String str = "Hello World\n";

        System.out.println(str.repeat(5));

        // 1'den 10'a kadar olan sayilari tek tek yazdirin

        for (int i = 1; i <= 10 ; i++) {
            System.out.print(i + " ");
        }
        

    }
}
