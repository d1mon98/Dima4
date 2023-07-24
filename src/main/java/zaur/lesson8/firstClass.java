package zaur.lesson8;

public class firstClass {

    final static double PI = 3.14;

    double circleArea(double r) {
        System.out.print("Площадь круга с радиусом " + r + " = ");
        return PI * r * r;
    }

    static double circumference(double r) {
        System.out.print("Длина оккружности с радиусом " + r + " = ");
        return 2 * PI * r;
    }

    static int multipication(int a, int b, int c) {
        System.out.print("Произведение " + a + " * " + b + " * " + c + " = ");
        return a * b * c;
    }

    static void division(int a, int b) {
        System.out.println("При делении " + a + " на " + b + ", целая часть частного = " + (a / b) + ", остаток от деления = " + (a % b));
    }

    void combo(double r) {
        System.out.println("Радиус = " + r);
        System.out.println(circleArea(r));
        System.out.println(circumference(r));
    }

}

class firstClassTest {
    public static void main(String[] args) {

        System.out.println(firstClass.multipication(15, 4, 3));
        firstClass.division(10, 31);

        System.out.println();
        firstClass test1 = new firstClass();
        System.out.println(test1.circleArea(4));

        System.out.println();
        System.out.println(firstClass.circumference(7));

        System.out.println();
        test1.combo(5);

    }


}


