package zaur.lesson6;

import zaur.lesson4.Employee;

public class summaOverloadedMethods {
    //overload методы
    int sum(int a1, int a2, int a3, int a4, int a5) {
        int result = a1 + a2 + a3 + a4 + a5;
        System.out.println("Сумма чисел " + a1 + " " + a2 + " " + a3 + " " + a4 + " " + a5 + " равняется " + result);
        return result;
    }

    int sum(int a1, int a2, int a3, int a4) {
        int result = a1 + a2 + a3 + a4;
        System.out.println("Сумма чисел " + a1 + " " + a2 + " " + a3 + " " + a4 + " равняется " + result);
        return result;
    }

    int sum(int a1, int a2, int a3) {
        int result = a1 + a2 + a3;
        System.out.println("Сумма чисел " + a1 + " " + a2 + " " + a3 + " равняется " + result);
        return result;
    }

    int sum(int a1, int a2) {
        int result = a1 + a2;
        System.out.println("Сумма чисел " + a1 + " " + a2 + " равняется " + result);
        return result;
    }

    int sum(int a1) {
        int result = a1;
        System.out.println("Результат равняется " + result);
        return result;
    }

    int sum() {
        int result = 0;
        System.out.println("Результат равняется " + result);
        return 0;
    }

}


class summaOverloadedMethodsTest {
    public static void main(String[] args) {

        summaOverloadedMethods sum1 = new summaOverloadedMethods();
        sum1.sum(1, 2, 3, 4, 5);
        sum1.sum(1, 2, 3, 4);
        sum1.sum(1, 2, 3);
        sum1.sum(1, 2);
        sum1.sum(1);
        sum1.sum();



    //zaur.lesson4.Employee emp1 = new Employee(4,"Koko",32,32500,"cleaning");
      //  System.out.println("ЗП " + emp1.surname + " "+ emp1.salary);
        zaur.lesson4.Employee emp1= new Employee(12,"Petrov",54,245000);
        emp1.department = "Rukovodstvo";
        emp1.showInfo();
    }

}
