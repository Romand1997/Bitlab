package Ch13_OOP_Try_Cath;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ch13_OOP_Try_cath_task1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        User users[]=new User[2];
        String a="";
        for(int i=0;i< users.length;i++) {
            users[i] = new User();
            System.out.println("vvedite name"+i);
            users[i].name = in.next();
            System.out.println("vvedite surname"+i);
            users[i].surname = in.next();
            System.out.println("vvedite age"+i);
            try {
                users[i].setAge(Integer.parseInt(in.next()));
            } catch (Exception e) {
                users[i].setAge(0);
               // a= in.next();
            }
        }
        int sum=0;
        int count=0;
        for (int i=0;i<users.length;i++){
                if (users[i].getAge()!=0){
                sum+=users[i].getAge();
                count++;
            }
        }
        System.out.println((double)sum/count);
        System.out.println("Right input users="+count);
//        for (int i=0;i<users.length;i++) {
//            System.out.println(users[i]);
//        }

    }
}
class User{
    String name;
    String surname;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<=0) {
            System.out.println("age is not correct");
            this.age=0;
        } else
        this.age = age;

    }

    public User() {
        this.name = "no name";
        this.surname = "no surname";
        this.age = 0;
    }

    public User(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
//    Создайте мини программу, в которой я ввожу свои данные через консоль, и заполняю массив пользователей.
//        У меня имеется класс пользователей
//        User.java
//        String name;
//        String surname;
//        int age;
//        А также конструктор для всех параметров.
//        В Main.java я имею массив пользователей, с максимальным размером 5 человек.
//        Моя программа запрашивает пользователя ввести данные этих 5 пользователей через консоль.
//        Используйте цикл, чтобы 5 раз повторить операцию заполнения данных пользователя и создания нового объекта.
//        Можно использовать цикл for, так будет намного легче.
//        Но если, я во время введения возраста, ввожу неверные данные (не целостное число),
//        то программа должна автоматом ввести число 0, в поле возраста и добавить объект в массив.
//        Используйте try-catch, чтобы узнать, ввел ли пользователь возраст правильно или налажал.
//        В конце ввода, программа должна вывести среднее значение возраста в массиве и мы сможем посмотреть,
//        где пользователь ввел неверные данные.