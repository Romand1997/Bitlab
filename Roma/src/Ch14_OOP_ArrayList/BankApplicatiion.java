package Ch14_OOP_ArrayList;

import java.util.ArrayList;

public class BankApplicatiion {
    String name;
    ArrayList<Account> accounts = new ArrayList();
    public BankApplicatiion() {
        this.name = "no name";
    }

    public BankApplicatiion(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void addAccount(Account a){
        accounts.add(a);
    }
    public void removeAccount(int i){
        accounts.remove(i);
    }
    public Account getMaxAccount(){
        double max=accounts.get(0).getBalance();
        int count=0;
        for (int i=0;i<accounts.size();i++){
            if (max<accounts.get(i).getBalance()){
                max=accounts.get(i).getBalance();
                count=i;
            }
        }
        return accounts.get(count);
    }
    public double getAverageBalance(){
        double sum=0;
        for (int i=0;i<accounts.size();i++){
            sum+=accounts.get(i).getBalance();
        }
        return sum/accounts.size();
    }
    public double getTotalBalance(){
        double sum=0;
        for (int i=0;i<accounts.size();i++){
            sum+=accounts.get(i).getBalance();
        }
        return sum;
    }
    public int totalAccounts(){
        return accounts.size();
    }
    public String getBankData(){
        return "BankApplicatiion{"+"\n"+
                "name of bank is " + name + "\n"+
                "amount of account=" + totalAccounts() +"\n"+
                "balanse of the bank="+getTotalBalance()+"\n"+
                "Average of balance="+getAverageBalance()+
                '}';
    }
//    public int compareTo(BankApplicatiion x){
//        if(x.getAverageBalance() > this.getAverageBalance()) return -1;
//        else return 1;
//    }
    public int compareTo(BankApplicatiion x){
        if (this.getAverageBalance()>x.getAverageBalance()){
            return 1;
        } else return -1;

    }
}
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