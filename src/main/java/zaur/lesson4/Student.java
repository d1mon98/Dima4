package zaur.lesson4;

public class Student {

   // конструктор №1
    public Student(int studentTicketNumber, String firstName, String lastName, int yearOfStudy, double averageRatingMath, double averageRatingEconomics, double averageRatingForeignLanguage) {
        this.studentTicketNumber = studentTicketNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfStudy = yearOfStudy;
        this.averageRatingMath = averageRatingMath;
        this.averageRatingEconomics = averageRatingEconomics;
        this.averageRatingForeignLanguage = averageRatingForeignLanguage;
    }

    // конструктор №2
    public Student(int studentTicketNumber, String firstName, String lastName, int yearOfStudy) {
        this.studentTicketNumber = studentTicketNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfStudy = yearOfStudy;
    }

    // конструктор №3
    public Student() {
    }

    // параметры класса
    int studentTicketNumber;
    String firstName;
    String lastName;
    int yearOfStudy;
    double averageRatingMath;
    double averageRatingEconomics;
    double averageRatingForeignLanguage;
}

class StudentTest {

    //метод для вычисления среднего арифметического
    double arithmeticMean(Student st) {
        return (st.averageRatingMath + st.averageRatingEconomics + st.averageRatingForeignLanguage) / 3;
    }

    // метод вывода на экран
    void showInfo(Student st) {
        System.out.printf("Средний балл " + st.firstName + " " + st.lastName + " = " + "%.2f", arithmeticMean(st));
        System.out.println();
    }

    public static void main(String[] args) {

        // создание объектов с помощью user-defined конструкторов
        Student student4 = new Student(99, "Igor", "Salnikov", 2009, 4.3, 3.4, 5);
        Student student5 = new Student(4, "Nikolay", "Petrov", 2007);
        student5.averageRatingMath = 4.3;
        student5.averageRatingEconomics =4.5;
        student5.averageRatingForeignLanguage = 4.84;

        Student student6 = new Student();
        student6.studentTicketNumber = 34;
        student6.firstName = "Савелий";
        student6.lastName ="Павлов";
        student6.yearOfStudy = 2012;
        student6.averageRatingMath = 4.85;
        student6.averageRatingEconomics = 3.4;
        student6.averageRatingForeignLanguage = 4.41;

        StudentTest sT = new StudentTest();
        sT.arithmeticMean(student4);
        sT.showInfo(student4);
        sT.arithmeticMean(student5);
        sT.showInfo(student5);
        sT.arithmeticMean(student6);
        sT.showInfo(student6);

        System.out.println("-----------");

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();


        student1.firstName = "Vasilii";
        student1.lastName = "Pumpkin";
        student1.yearOfStudy = 2009;
        student1.averageRatingMath = 4.85;
        student1.averageRatingEconomics = 4.75;
        student1.averageRatingForeignLanguage = 4.4;

        student2.firstName = "Alexander";
        student2.lastName = "Petrov";
        student2.yearOfStudy = 2008;
        student2.averageRatingMath = 5.0;
        student2.averageRatingEconomics = 4.3;
        student2.averageRatingForeignLanguage = 4.8;

        student3.firstName = "Elena";
        student3.lastName = "Kravchuk";
        student3.yearOfStudy = 2015;
        student3.averageRatingMath = 4.55;
        student3.averageRatingEconomics = 4.53;
        student3.averageRatingForeignLanguage = 5.0;

        StudentTest st = new StudentTest();
        st.arithmeticMean(student1);
        st.showInfo(student1);

        st.arithmeticMean(student2);
        st.showInfo(student2);

        st.arithmeticMean(student3);
        st.showInfo(student3);


        System.out.println("-----------");
//System.out.printf("%.3f",value);
        System.out.printf("Средний балл " + student1.firstName + " " + student1.lastName + " = " + "%.2f", (student1.averageRatingMath + student1.averageRatingEconomics + student1.averageRatingForeignLanguage) / 3);
        System.out.println();
        System.out.printf("Средний балл " + student2.firstName + " " + student2.lastName + " = " + "%.2f", (student2.averageRatingMath + student2.averageRatingEconomics + student2.averageRatingForeignLanguage) / 3);
        System.out.println();
        System.out.printf("Средний балл " + student3.firstName + " " + student3.lastName + " = " + "%.2f", (student3.averageRatingMath + student3.averageRatingEconomics + student3.averageRatingForeignLanguage) / 3);

    }


}

