package day30_timeDate_varargs;

public class C07_varargs {
    public static void main(String[] args) {
        islemYap(1,2,3,4,5,6,7); // 1 + 5 = 6

        islemYap(5,0,4); // 9
    }
    public static void islemYap(int a, int b, int... c){

        System.out.println(a + c[b]);

    }
}
