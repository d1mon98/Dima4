package zaur.lesson4;

// основной класс, в котором заданы переменные для default конструктора
public class BankAccount {

    //переменные для default конструктора
    int id;
    String name;
    double balance;

    // метод для пополнения счёта
    void popolnenieShceta(double PlusAmount) {
        balance += PlusAmount;
    }

    // метод для снятия со счёта
    void snyatieSoScheta(double MinusAmount) {
        balance -= MinusAmount;
    }

    // метод для вывода на печать информации о счёте
    void showInfo() {
        System.out.println("Баланс " + name + " = " + balance);
    }
}

/* класс - "тестирование", в котором создаются объекты класса BankAccount и применяются методы, созданные
в основном классе. */
class BankAccountTest {
    public static void main(String[] args) {

        BankAccount MyAccount = new BankAccount();
        BankAccount YourAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();

        MyAccount.id = 1;
        MyAccount.name = "Dmitrii";
        MyAccount.balance = 580000;

        YourAccount.id = 2;
        YourAccount.name = "Ivan";
        YourAccount.balance = 34000;

        HisAccount.id = 3;
        HisAccount.name = "Svetlana";
        HisAccount.balance = 58000.32;


        MyAccount.showInfo();
        MyAccount.popolnenieShceta(550.31);
        MyAccount.showInfo();
        MyAccount.snyatieSoScheta(5905.17);
        MyAccount.showInfo();


    }
}



