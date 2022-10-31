package Ch14_OOP_ArrayList;

import Ch12_OOP_Interface.Users;

import java.util.ArrayList;

public class Ch14_OOP_ArrayList_task_1 {
    public static void main(String[] args) {
        ArrayList<Players> a=new ArrayList<>();
        Players a1=new Players("roma",21,33);
        Players a2=new Players("fari",21,33);
        Players a3=new Players("madi",21,33);
        Players a4=new Players("madina",21,33);
        Players a5=new Players("tim",21,33);
        Players a6=new Players("ivan",21,33);
        Players a7=new Players("ali",21,33);
        Players a8=new Players("rayan",21,33);
        Players a9=new Players("hasan",21,33);
        Players a10=new Players("vasya",21,33);
        a.add(a1);
        a.add(a2);
        a.add(a3);
        a.add(a4);
        a.add(a5);
        a.add(a6);
        a.add(a7);
        a.add(a8);
        a.add(a9);
        a.add(a10);
        int sumPrice=0;
        int sumAge=0;
        int count=0;
        for (int i=0;i<a.size();i++){
            sumPrice+=a.get(i).getPrice();
            count++;
            sumAge+=a.get(i).getAge();
        }
        System.out.println("srednee arifmet price="+sumPrice/count);
        System.out.println("summa age="+sumAge);
    }
}
class Players{
    String name;
    double price;
    int age;
    public Players() {
        this.name = "no name";
        this.price = 0;
        this.age = 0;
    }
    public Players(String name, double price, int age) {
        this.name = name;
        this.price = price;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
//    Создайте динамический массив из класса Players.java с параметрами:
//        Players.java
//        -String name;
//        -double price;
//       -int age;
//        Создайте конструктор, геттеры и сеттеры.
//        Добавьте 10 объектов из класса Players.java, затем найдите среднее значение цены, и сумму возраста игроков в массиве.
