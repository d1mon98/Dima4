package zaur.lesson10.p4;

import zaur.lesson10.p1.A;
import static zaur.lesson10.p1.p2.B.*;
import zaur.lesson10.p1.p2.B;
import zaur.lesson10.p1.p2.p3.C;
import zaur.lesson10.p4.p5.E;

public class D {
    int a = 5;

    public static void main(String[] args) {
        A a = new A();
        C c = new C();
        D d = new D();
        E e = new E();

        double result = a.a * B.a * b * c.a * d.a * e.a;

        System.out.println(a.a + "*" + B.a + "*" + b + "*" + c.a + "*" + d.a + "*" + e.a + "=" + result);
    }
}
