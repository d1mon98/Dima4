package zaur.lesson3;

public class lesson3 {
    public static void main(String[] args) {
        int i1=5; int i2=11;
        double d1 = 5.5;
        double d2 = 1.3;
        long l = 20L;
        double result;
        result = i2 / d1 + d2 % i1 - l; //    2 + 1.3 - 20 = -16.7

        System.out.println(result);

        int a = 5;
        int b = 8;
        int res2= a-- - --a + ++a + a++ + a;    //       15
        int res3= ++b - b++ + ++b - --b;         // 9-9  +11- 10       /1

        System.out.println(res2);
        System.out.println(res3);


    }
}
