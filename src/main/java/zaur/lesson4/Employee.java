package zaur.lesson4;

public class Employee {

    int id;
    String surname;
    int age;
    double salary;
    String department;

    //user defined конструктор с аргументами
    public Employee(int id, String surname, int age, double salary, String department) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    // метод увеличения зарплаты вдвое
    double dobulingSalary() {
        return salary*2;
    }

    // метод вывода на экран
    void showInfo() {
        System.out.println(surname + ", " + department + " otdel, "+ "zarplata: " + salary);
    }
}

class EmployeeTest {
    public static void main(String[] args) {

        Employee emp1 = new Employee(4, "Kokorin", 43, 54900, "33");
        Employee emp2 = new Employee(5, "Petuhov",31, 48500, "41");
        emp1.showInfo();
        emp2.showInfo();
        emp1.dobulingSalary();
        emp2.dobulingSalary();
        emp1.showInfo();
        emp2.showInfo();
    }
}
