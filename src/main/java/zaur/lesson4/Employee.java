package zaur.lesson4;

public class Employee {

    // переменная видна только внутри пакета
    int id;
    // переменная видна из всех классов и пакетов
    public String surname;
    public int age;
    // переменная видна только внутри класса
    private double salary;

    //access modofier - public (виден из всех пактов и классов);
    public Employee(int id, String surname, int age, double salary) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
    }

    public String department;

    //user defined конструктор с аргументами
    //access modofier - default (виден только внутри пакета);
    Employee(int id, String surname, int age, double salary, String department) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    //виден только внутри класса
    private Employee(int id, String surname, int age) {
        this.id = id;
        this.surname = surname;
        this.age = age;
    }

    // метод увеличения зарплаты вдвое
    double doublingSalary() {
        salary *= 2;
        return salary;
    }

    // метод вывода на экран
    public void showInfo() {
        System.out.println(surname + ", " + department + " otdel, " + "zarplata: " + salary);
    }
}

class EmployeeTest {
    public static void main(String[] args) {

        //cоздание объектов класса Employee
        // 1. На основании default - конструктора;

        Employee emp1 = new Employee(4, "Kokorin", 43, 54900, "33");
        Employee emp2 = new Employee(5, "Petuhov", 31, 48500, "41");
        emp1.showInfo();
        emp2.showInfo();
        emp1.doublingSalary();
        emp2.doublingSalary();
        emp1.showInfo();
        emp2.showInfo();

        //на основании консутруктора с access - modifier private
       // Employee emp3 = new Employee(3, "Vasin", 34);

        //на основании консутруктора с access - modifier default
        Employee emp4 = new Employee(43,"Grigoriev",23,23200);
        emp4.department = "13";

        emp4.showInfo();




    }
}
