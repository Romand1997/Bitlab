//package OOP;
//
//import java.util.Scanner;
//
//
//public class Ch8_OOP_task2 {
//    public static void main(String[] args) {
//        Scanner in=new Scanner(System.in);
//        Phone1 p[]=new Phone1[3];
//        for(int i=0;i<p.length;i++){
//            p[i]=new Phone1(in.nextLine(), in.nextLine(), Integer.parseInt(in.nextLine()));
//            System.out.println(p[i].getData());
//        }
////         p[0]=new Phone1("Iphone","4s", 20000);
////         p[1]=new Phone1("Iphon","4s", 20000);
////         p[2]=new Phone1("Iphne","4s", 20000);
////         p[3]=new Phone1("p","4s", 20000);
////         p[4]=new Phone1("phone","4s", 20000);
//    }
//}
//class Phone1{
//    String name;
//    String model;
//    int price;
//    public Phone1(String name, String model, int price){
//        this.name=name;
//        this.model=model;
//        this.price=price;
//    }
//    public String getData(){
//        return "Name is "+name+". Model is "+ model+". Price="+price;
//    }
//}
//Создайте 5 объектов из класса Phone которую мы объявили выше. Задайте им разные значения (name, model, price).
//        Затем, выведите на консоль данные о каждом телефоне при помощи метода getData().







//package OOP;
//import java.util.Scanner;
//public class Ch8_OOP_task2 {
//    public static void main(String[] args) {
//        Scanner in=new Scanner(System.in);
//         Student p0=new Student("Igor","Ivanov", 4);
//         Student p1=new Student("Ivan","Ivanov", 4.3);
//         Student p2=new Student("Petr","Ivanov", 1);
//         Student p3=new Student("Roman","Ivanov", 4.4);
//         Student p4=new Student("Anna","Ivanova", 5);
//        Student p5=new Student("Sergey","Ivanov", 4.4);
//        Student p6=new Student("Konstantin","Ivanov", 4.6);
//        Student p7=new Student("Lew","Ivanov", 3);
//        Student p8=new Student("Vasiliy","Ivanov", 3.9);
//        Student p9=new Student("Pavel","Ivanov", 2.1);
//         Student all[]={p0,p1,p2,p3,p4,p5,p6,p7,p8,p9};
//
//            System.out.println(topStudent(all));
//        }
//
//    public static Student topStudent(Student student[]){
//        double gpaMax=student[0].gpa;
//        Student best=new Student();
//        for (int i=0;i<student.length;i++){
//            if (gpaMax<student[i].gpa){
//                gpaMax=student[i].gpa;
//                best=student[i];
//            }
//        }
//        return best;
//    }
//}
//class Student{
//    int id;
//    String name;
//    String surname;
//    double gpa;
//    public Student(){
//        this.name="no name";
//        this.surname="no surname";
//        this.gpa=0;
//    }
//    public Student(String name, String surname, double gpa){
//        this.name=name;
//        this.surname=surname;
//        this.gpa=gpa;
//    }
//    public  String toString(){
//        return "Name is "+name+". Surname is "+ surname+". gpa="+gpa;
//    }
//    public String getData(){
//        return "Name is "+name+". Surname is "+ surname+". gpa="+gpa;
//    }
//}
//    Создайте класс Student.java с параметрами:
//        Student.java
//        int id;
//        String name;
//        String surname;
//        double gpa;
//        Обязательно создайте конструкторы (с параметрами и по умолчанию).
//        Создайте метод String getStudentData();
//        Данный метод возвращает все данные студента.
//        В классе Main, вы должны создать 5 объектов разных студентов с разными параметрами.
//        Создайте массив из класса Student, заполните массив 5 объектами класса Student которые
//        мы создали до этого, и используя цикл, выведите данные по каждому студенту.
//    Используйте предыдущий класс Student.java.
//        Создайте в классе Main.java специальный метод:
//        static Student topStudent(Student students[]);
//        Данный метод принимает в аргументы массив из студентов. Метод должен возвращать из списка
//        самого лучшего студента, у которого высокий gpa.
//        Создайте 10 объектов разных студентов с разными параметрами. Примените этот метод.





package Ch8_OOP_class;
import java.util.Scanner;
public class Ch8_OOP_task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = 1;
        Student all[]=new Student[1000];
        int count=0;
        while (x != 0) {
            System.out.println("PRESS [1] TO ADD STUDENT");
            System.out.println("PRESS [2] TO LIST STUDENT");
            System.out.println("PRESS [0] TO ADD STUDENT");
            x = in.nextInt();
            if (x == 1) {
                System.out.println("Insert name?");
                String name = in.next();
                System.out.println("Insert surname?");
                String surname = in.next();
                System.out.println("Insert GPA?");
                double gpa = in.nextDouble();
                all[count] = new Student(name, surname, gpa);
                count++;
            }
            if (x == 2){
                for(int i=0;i<count;i++){
                    System.out.println(all[i].getData());
                }
            }
        }
    }


    public static Student topStudent(Student student[]){
        double gpaMax=student[0].gpa;
        Student best=new Student();
        for (int i=0;i<student.length;i++){
            if (gpaMax<student[i].gpa){
                gpaMax=student[i].gpa;
                best=student[i];
            }
        }
        return best;
    }
}
class Student{
    int id;
    String name;
    String surname;
    double gpa;
    public Student(){
        this.name="no name";
        this.surname="no surname";
        this.gpa=0;
    }
    public Student(String name, String surname, double gpa){
        this.name=name;
        this.surname=surname;
        this.gpa=gpa;
    }
    public  String toString(){
        return "Name is "+name+". Surname is "+ surname+". gpa="+gpa;
    }
    public String getData(){
        return "Name is "+name+". Surname is "+ surname+". gpa="+gpa;
    }
}
//    Создайте мини программу, с меню панелью отображенным ниже.
//        PRESS [1] TO ADD STUDENT
//        PRESS [2] TO LIST STUDENT
//        PRESS [0] TO EXIT
//        При нажатии [1]:
//        Insert name?
//        Вводите имя с консоли
//        Insert surname?
//        Вводите фамилию с консоли
//        Insert GPA?
//        Вводите GPA с консоли
//        После введения данных, программа должна добавить в список нашего студента.
//        При нажатии [2]:
//        Программа должна вывести список всех студентов.
//        1) Ilyas Zhuanyshev 4.0
//        2) Aruzhan Yelemes 3.9
//        3) Eldar Khassen 3.5
//        4) Anel Mukhamejanova 3.4
//        5) Aybek Bagit 3.2
//        При нажатии [0]:
//        Программа должна выйти.



//package OOP_class;
//
//public class Ch8_OOP_task2 {
//    public static void main(String[] args) {
//        Player p0=new Player(1,"Igor","Ivanov", "?");
//        Player p1=new Player(2,"Petr","Ivanov", "?");
//        Player p2=new Player(3,"Roman","Ivanov", "?");
//        Player p3=new Player(4,"Anna","Ivanova", "?");
//        Player p4=new Player(5,"Sergey","Ivanov", "?");
//        Player p5=new Player(6,"Konstanyin","Ivanov", "?");
//        Player p6=new Player(7,"Lew","Ivanov", "?");
//        Player p7=new Player(8,"Vasiliy","Ivanov", "?");
//        Player p8=new Player(9,"Pavel","Ivanov", "?");
//        Player p9=new Player(10,"Zoya","Ivanova", "?");
//        Player allPlayers1[]={p0, p1, p2, p3, p4};
//        Player allPlayers2[]={p5, p6, p7, p8, p9};
//        Club club1=new Club("BestClub", "Kazahstan", 153, allPlayers1);
//        Club club2=new Club("breakfast", "USA", 150, allPlayers2);
//        club1.printClubData();
//        club2.printClubData();
//    }
//}
//class Player{
//    int number;
//    String name;
//    String surname;
//    String position;
//
//    public Player(){
//        this.number=0;
//        this.name="no name";
//        this.surname="no surname";
//        this.position="no position";
//    }
//    public Player(int number,String name, String surname, String position){
//        this.number=number;
//        this.name=name;
//        this.surname=surname;
//        this.position=position;
//    }
//    public  String toString(){
//        return "Number ="+number+" Name is "+name+". Surname is "+ surname+". Position"+position;
//    }
//    public String getDataPlayer(){
//        return "Number ="+number+" Name is "+name+". Surname is "+ surname+". Position"+position;
//    }
//}
//class Club {
//    String name;
//    String country;
//    int ratingPoints;
//    Player []players;
//
//    public Club(){
//       this.name="no name";
//       this.country="no country";
//       this.ratingPoints=0;
//       this.players= new Player[]{};
//    }
//    public Club(String name, String country, int ratingPoints, Player players[]){
//        this.name=name;
//        this.country=country;
//        this.ratingPoints=ratingPoints;
//        this.players=players;
//    }
//    public String toString(){
//        return "Name is "+name+". Country is "+country+". ratingPoints="+ratingPoints+"Players are"+players;
//    }
//    public void printClubData(){
//        System.out.println("Name is "+name+". Country is "+country+". ratingPoints="+ratingPoints);
//        System.out.println("players are:");
//        for(int i=0;i<players.length;i++){
//            System.out.println(players[i]);
//        }
//    }
//}
//    Создайте класс Player.java с параметрами:
//        Player.java
//        int number;
//        String name;
//        String surname;
//        String position;
//        Обязательно создайте конструкотры (с параметрами и по умолчанию).
//        Создайте метод String toString(). Данный метод возвращает данные по каждому игроку, то есть все поля в один ряд.
//        Создайте класс Club.java с параметрами:
//        Club.java
//        String name;
//        String country;
//        int ratingPoints;
//        Player []players;
//        Обязательно создайте конструкотры (с параметрами и по умолчанию).
//        Создайте метод void printClubData(). Данный метод выводит данные о клубе,
//        включая список всех игроков, которые присутствуют в массиве.
//        В главном классе Main.java, создайте 2 массива из разных игроков. (В каждом из них по 5 игроков).
//        Далее, создайте два клуба и присвойте к ним массивы из игроков.
//        Далее, создайте массив из клубов, и добавьте туда те 2 наших клуба.
//        В конце, при помощи цикла, выведите данные каждого клуба.