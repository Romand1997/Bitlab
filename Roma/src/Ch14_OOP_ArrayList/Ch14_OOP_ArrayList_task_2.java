package Ch14_OOP_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Ch14_OOP_ArrayList_task_2 {
    public static void main(String[] args) {
        BankApplicatiion bank1=new BankApplicatiion("bank1");
        BankApplicatiion bank2=new BankApplicatiion("bank2");
        BankApplicatiion bank3=new BankApplicatiion("bank3");
        bank1.addAccount(new Account(1,"roma","danov",1500));
        bank1.addAccount(new Account(2,"aldiyar","danov",1600));
        bank1.addAccount(new Account(3,"vanya","danov",1700));
        bank1.addAccount(new Account(4,"madi","danov",1800));
        bank1.addAccount(new Account(5,"fari","danov",1900));
        bank1.addAccount(new Account(6,"madina","danov",2000));
        bank1.addAccount(new Account(7,"hasan","danov",2100));
        bank1.addAccount(new Account(8,"tim","danov",2200));
        bank1.addAccount(new Account(9,"rayan","danov",2300));
        bank1.addAccount(new Account(10,"miras","danov",2400));


        bank2.addAccount(new Account(1,"roma","bank2",3000));
        bank2.addAccount(new Account(2,"aldiyar","bank2",3100));
        bank2.addAccount(new Account(3,"vanya","bank2",3200));
        bank2.addAccount(new Account(4,"madi","bank2",3300));
        bank2.addAccount(new Account(5,"fari","bank2",3400));
        bank2.addAccount(new Account(6,"madina","bank2",3500));
        bank2.addAccount(new Account(7,"hasan","bank2",3600));
        bank2.addAccount(new Account(8,"tim","bank2",3700));
        bank2.addAccount(new Account(9,"rayan","bank2",3800));
        bank2.addAccount(new Account(10,"miras","bank2",3900));


        bank3.addAccount(new Account(1,"roma","bank3",4000));
        bank3.addAccount(new Account(2,"aldiyar","bank3",4100));
        bank3.addAccount(new Account(3,"vanya","bank3",4200));
        bank3.addAccount(new Account(4,"madi","bank3",4300));
        bank3.addAccount(new Account(5,"fari","bank3",4400));
        bank3.addAccount(new Account(6,"madina","bank3",4500));
        bank3.addAccount(new Account(7,"hasan","bank3",4600));
        bank3.addAccount(new Account(8,"tim","bank3",4700));
        bank3.addAccount(new Account(9,"rayan","bank3",4800));
        bank3.addAccount(new Account(10,"miras","bank3",4900));
        ArrayList <BankApplicatiion> allBanks=new ArrayList();
//        allBanks.add(bank1);
//        allBanks.add(bank2);
//        allBanks.add(bank3);
        BankApplicatiion bankI=new BankApplicatiion();
        BankApplicatiion bankJ=new BankApplicatiion();
//        for (int i=0;i<allBanks.size()-1;i++){
//            for (int j=i+1;j<allBanks.size();j++){
//                if (allBanks.get(i).getAverageBalance()<allBanks.get(j).getAverageBalance()){
//                    bankI=allBanks.get(i);
//                    bankJ=allBanks.get(j);
//                    allBanks.set(i,bankJ);
//                    allBanks.set(j,bankI);
//                }
//            }
//        }

        Collections.addAll(allBanks,bank1,bank2,bank3);
    //    Collections.sort(allBanks, new roma_comparator());
Collections.sort(allBanks, new Vanya_Comporator());



        for(int i=0;i<allBanks.size();i++){
            System.out.println(allBanks.get(i).getBankData()+"\n");
        }
    }
}
//    Создайте класс Account.java с параметрами:
//        - int id;
//        - String name;
//        - String surname;
//        - double balance;
//        Геттеры и сеттеры
//        + String toString(); //// Данный метод все значения полей
//        Создайте класс BankApplication.java с параметрами:
//        - String name;
//        - ArrayList accounts = new ArrayList();
//        + void addAccount(Account a); // Добавляет новый объект Account
//        + void removeAccount(int i); // Удаляет объект со списка под индексом i
//        + Account getMaxAccount(); // Возвращает объект Account у кого самый высокий баланс
//        + double getAverageBalance(); // Возвращает среднее значение баланса пользователей
//        + double getTotalBalance(); // Возвращает сумму баланса пользователей
//        + int totalAccounts();  // Возвращает количество пользователей
//        + String getBankData(); // Возвращает имя банка, количество счетов, сумму баланса и среднее значение баланса
//        В основном классе Main, создайте 3 объекта BankApplication.java, добавьте туда по 10 новых счетов, с разным балансом.
//        Добавьте все эти банки в массив из банков ArrayList<BankApplication> allBanks;
//        Выведите данные по каждому банку, отсортировав их по среднему значению баланса, по убыванию.