package zaur.lesson4;

public class Student {

    int studentTicketNumber;
    String firstName;
    String lastName;
    int yearOfStudy;
    double averageRatingMath;
    double averageRatingEconomics;
    double averageRatingForeignLanguage;

}

class StudentTest {
    public static void main(String[] args) {
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

//System.out.printf("%.3f",value);
        System.out.printf("Средний балл " + student1.firstName + " " + student1.lastName + " = " + "%.2f",(student1.averageRatingMath + student1.averageRatingEconomics + student1.averageRatingForeignLanguage) / 3);
        System.out.println();
        System.out.printf("Средний балл " + student2.firstName + " " + student2.lastName + " = " + "%.2f",(student2.averageRatingMath + student2.averageRatingEconomics + student2.averageRatingForeignLanguage) / 3);
        System.out.println();
        System.out.printf("Средний балл " + student3.firstName + " " + student3.lastName + " = " + "%.2f",(student3.averageRatingMath + student3.averageRatingEconomics + student3.averageRatingForeignLanguage) / 3);

    }


}

