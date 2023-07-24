package zaur.lesson9;

public class Test0_2 {
    public static void abc() {
        String s1 = new String("123");
        String s2 = "456";
        System.out.println(s1 + " " + s2);
    }

    public static void main(String[] args) {
        abc();
        abc();
        Test0_2 tst = new Test0_2();
        String s1 = "555";
        abc();
        System.out.println(s1 + " " + s1);
        System.out.println(tst + " " + tst);
    }

}
