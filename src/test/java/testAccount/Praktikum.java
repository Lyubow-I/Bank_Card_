package testAccount;

import org.example.Account;

public class Praktikum {
    public static void main(String[] args) {
        String name = "Тимоти Шаламе";
        Account account = new Account(name);
        System.out.println("Можно ли напечатать '" + name + "'? " + account.checkNameToEmboss());
    }
}
