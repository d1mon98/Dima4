package zaur.lesson9;


public class Test0 {

    //instance variables;
    int a = 55;
    boolean b = false;

    // static variables;
    static double c = 0.1;
    static String d = "Как дела?";

    //метод с parametrs и local varibables
    int sum(int a, int b2) {
        String d2 = "Привет!";
        int c2 = this.a;
        System.out.println(d2);
        System.out.println("Cумма " + a + " и " + b2 + " = " + (a + b2));
        System.out.print((a + b2) + "*" + c2 + " = ");
        return c2 * (a + b2);
    }

    public static void main(String[] args) {

        Test0 tst = new Test0();
        System.out.println(tst.sum(11, 3));
        System.out.println(c + " " + d);
        System.out.println(tst.a + " " + tst.b);
        tst = null;
        System.out.println(tst.a + " " + tst.b);
        // System.out.println(a1+b1+c1+d1);



    }
}
