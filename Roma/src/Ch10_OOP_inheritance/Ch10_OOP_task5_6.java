//package OOP_inheritance;
//
//import java.util.Arrays;
//
//public class Ch10_OOP_task5 {
//    public  static void main(String[] args) {
//        Staff st1 = new Staff(1, "Roma", "fdfd", "Roma", "Danov", 2);
//        Staff st2 = new Staff(2, "Roma", "fdfd", "Roma", "Danov", 2);
//        Staff st3 = new Staff(3, "Roma", "fdfd", "Roma", "Danov", 2);
//        Staff st4 = new Staff(4, "Roma", "fdfd", "Roma", "Danov", 2);
//        Staff st5 = new Staff(5, "Roma", "fdfd", "Roma", "Danov", 2);
//        Studen s1 = new Studen(1, "Roma", "fdfd", "Roma", "Danov", 2);
//        Studen s2 = new Studen(2, "Roma", "fdfd", "Roma", "Danov", 2);
//        Studen s3 = new Studen(3, "Roma", "fdfd", "Roma", "Danov", 2);
//        Studen s4 = new Studen(4, "Roma", "fdfd", "Roma", "Danov", 2);
//        Studen s5 = new Studen(5, "Roma", "fdfd", "Roma", "Danov", 2);
//        User u1 = new User(1, "Roma", "fdfd", "Roma", "Danov");
//        User u2 = new User(2, "Roma", "fdfd", "Roma", "Danov");
//        User u3 = new User(3, "Roma", "fdfd", "Roma", "Danov");
//        User u4 = new User(4, "Roma", "fdfd", "Roma", "Danov");
//        User u5 = new User(5, "Roma", "fdfd", "Roma", "Danov");
//        User[] users = {st1, st2, st3, st4, st5, s1, s2, s3, s4, s5, u1, u2, u3, u4, u5};
//        s1.addCourses("book1");
//        s1.addCourses("book2");
//        s1.addCourses("book3");
//        s1.addCourses("book4");
//        s1.addCourses("book3");
//        st1.addSubject("qwe1");
//        st1.addSubject("qwe2");
//        st1.addSubject("qwe3");
//        st1.addSubject("qwe4");
//        st1.addSubject("qwe5");
//        st1.addSubject("qwe6");
//        for(int i=0;i<users.length;i++){
//        System.out.println(users[i].getData());
//        }
//    }
//}
//class User{
//    protected int id;
//    protected String login;
//    protected String password;
//    protected String name;
//    protected String surname;
//
//    public User() {
//        this.id = 0;
//        this.login = "no login";
//        this.password = " no password";
//        this.name = "no name";
//        this.surname = "no surname";
//    }
//
//    public User(int id, String login, String password, String name, String surname) {
//        this.id = id;
//        this.login = login;
//        this.password = password;
//        this.name = name;
//        this.surname = surname;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getLogin() {
//        return login;
//    }
//
//    public void setLogin(String login) {
//        this.login = login;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getSurname() {
//        return surname;
//    }
//
//    public void setSurname(String surname) {
//        this.surname = surname;
//    }
//    public String getData() {
//        return "User{" +
//                "id=" + id +
//                ", login='" + login + '\'' +
//                ", password='" + password + '\'' +
//                ", name='" + name + '\'' +
//                ", surname='" + surname + '\'' +
//                '}';
//    }
//}
//class Staff extends User{
//    private double salary;
//    private String subjects[] = new String[100];
//    private int indexOfSubject = 0;
//
//    public Staff() {
//        super();
//        this.salary = 0;
//        this.subjects = new String[]{};
//    }
//
//    public Staff(int id, String login, String password, String name, String surname, double salary) {
//        super(id, login, password, name, surname);
//        this.salary = salary;
//      //  this.subjects = subjects;
//    }
//
//    public double getSalary() {
//        return salary;
//    }
//
//    public void setSalary(double salary) {
//        this.salary = salary;
//    }
//    public int getIndexOfSubject() {
//        return indexOfSubject;
//    }
//
//    public void setIndexOfSubject(int indexOfSubject) {
//        this.indexOfSubject = indexOfSubject;
//    }
//
//
//    public String getData() {
//        String ans = "\n";
//        for (int i=0;i<indexOfSubject;i++) {
//            ans += String.valueOf(i+1) + ") " + getSubject(i) + "\n";
//        }
//        return "Staff{" +
//                ", id=" + id +
//                ", login='" + login + '\'' +
//                ", password='" + password + '\'' +
//                ", name='" + name + '\'' +
//                ", surname='" + surname + '\'' +
//                "salary=" + salary +
//                ", subjects=" + ans +
//                ", indexOfSubject=" + indexOfSubject +
//                '}';
//
//    }public String getSubject(int index){
//        return subjects[index];
//    }
//
//    public void addSubject(String sub){
//        subjects[indexOfSubject]=sub;
//        indexOfSubject++;
//    }
//}
//class Studen extends User{
//    private double gpa;
//    private String courses[] = new String[100];
//    private int indexOfCourses = 0;
//
//    public Studen() {
//        super();
//        this.gpa = 0;
//        this.courses = new String[]{};
//        //this.indexOfCourses = 0;
//    }
//
//    public Studen(int id, String login, String password, String name, String surname, double gpa) {
//        super(id, login, password, name, surname);
//        this.gpa = gpa;
////        this.courses = courses;
////        this.indexOfCourses = indexOfCourses;
//    }
//
//    public double getGpa() {
//        return gpa;
//    }
//
//    public void setGpa(double gpa) {
//        this.gpa = gpa;
//    }
//    public String getData() {
//        String ans="\n";
//        for (int i=0;i<indexOfCourses;i++){
//            ans+=String.valueOf(i+1)+") "+getCourses(i)+"\n";
//        }
//        return "Studen{" +
//                ", id=" + id +
//                ", login='" + login + '\'' +
//                ", password='" + password + '\'' +
//                ", name='" + name + '\'' +
//                ", surname='" + surname + '\'' +
//                "gpa=" + gpa +
//                ", courses=" + ans +
//                ", indexOfCourses=" + indexOfCourses +
//                '}';
//    }
//    public String getCourses(int index){
//        return courses[index];
//    }
//    public void addCourses(String co){
//        courses[indexOfCourses]=co;
//        indexOfCourses++;
//    }
//}
//    Создайте класс User.java с параметрами:
//protected int id;
//protected String login;
//protected String password;
//protected String name;
//protected String surname;
//Обязательно создайте конструкторы (с параметрами и по умолчанию).
//Создайте все геттеры и сеттеры.
//Далее, создайте в этом классе метод getData() который выводит на экран все параметры данного пользователя
//        Далее, создайте класс Staff.java который наследует от класса User.java с параметрами:
//private double salary;
//private String subjects[] = new String[100];
//private int indexOfSubject = 0;
//Создайте геттеры и сеттеры.
//Переопределите метод getData()  для класса Staff.java.
//Далее, создайте класс Student.java который наследует от класса User.java с параметрами:
//private double gpa;
//private String courses[] = new String[100];
//private int indexOfCourses = 0;
//Создайте геттеры и сеттеры.
//Переопределите метод getData()  для класса Student.java.
//Подсказка*
//Для массивов subjects & courses вам не нужно создавать геттеры и сеттеры,
//а также вам нельзя его указывать в конструкторе. Если мы укажем массив
//в конструкторе - нам придется создавать массив на мейне и передавать
//уже готовый массив в наш конструктор, а мы этого не хотим! Нам нужен хардкор!
//Что тогда делать?
//Создаем специальную переменную index, которая следит за тем, сколько на самом деле
//было добавлено курсов/уроков. А это означает, что нужно создать методы
//addSubject(String subject) & addCourse(String course), которые будут добавлять
//по одному subject & course, в наши массивы, а еще будет фиксировать сколько на
//самом деле было добавлено курсов. Для вывода всех данных из массивов создайте
//cециальные методы, которые запускают цикл и выводят на экран все данные. И да,
//в цикле должен использоваться index, вдруг у вас там всего 5 книг, а не все 100!
//В вашем основном классе Main.java, вы должны создать как минимум по 5 объектов класса
//Student.java, Staff.java и User.java, и добавить их в массив из класса User.java.
//Чтобы добавить курсы пользователям, просто вызовите методы addSubject() & addCourse() для каждого объекта!






package Ch10_OOP_inheritance;

import java.util.Scanner;

public class Ch10_OOP_task5_6 {
    public  static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        User[] users = new User[1000];
        int count=0;
        while (true){
            System.out.println(
                    "PRESS [1] ADD USER\n" +
                    "PRESS [2] TO LIST USERS\n" +
                    "PRESS [0] TO EXIT");
            int a= in.nextInt();
            if (a==1){
                System.out.println(
                        "PRESS [1] TO ADD STUDENT\n" +
                        "PRESS [2] TO ADD STAFF\n" +
                        "PRESS [0] TO EXIT");
                a= in.nextInt();
                if (a==1){
                    System.out.println("Insert id");
                    int id= in.nextInt();
                    System.out.println("Insert login");
                    String login= in.next();
                    System.out.println("Insert password");
                    String password= in.next();
                    System.out.println("Insert name");
                    String name= in.next();
                    System.out.println("Insert surname");
                    String surname = in.next();
                    System.out.println("Insert gpa");
                    double gpa= in.nextDouble();
                    Studen x = new Studen(id,login,password,name,surname, gpa);
                    while (true){
                        System.out.println("Insert Courses, when insert 'end' will break");
                        String cource = in.next();
                        if (cource.equalsIgnoreCase("end")) break;
                        x.addCourses(cource);
                    }
                    users[count] = x;
                    count++;
                }
                else if(a==2) {
                    System.out.println("Insert id");
                    int id= in.nextInt();
                    System.out.println("Insert login");
                    String login= in.next();
                    System.out.println("Insert password");
                    String password= in.next();
                    System.out.println("Insert name");
                    String name= in.next();
                    System.out.println("Insert surname");
                    String surname = in.next();
                    System.out.println("Insert salary");
                    double salary= in.nextDouble();
                    Staff y= new Staff(id, login, password, name, surname, salary);
                    while (true){
                        System.out.println("Insert Subjects, when insert 'end' will break");
                        String subject = in.next();
                        if(subject.equalsIgnoreCase("end")){
                            break;
                        }
                        y.addSubject(subject);
                    }
                    users[count]=y;
                    count++;
                } else if(a==0) {
                    break;
                }
            } else if(a==2) {
                System.out.println(
                        "PRESS [1] TO LIST STUDENTS\n" +
                        "PRESS [2] TO LIST STAFF\n" +
                        "PRESS [0] TO EXIT");
                a= in.nextInt();
                if (a==1){
                    for(int i=0;i<users.length;i++){
                        if (users[i]instanceof Studen){
                            System.out.println(users[i].getData());
                        }
                    }

                } else if(a==2) {
                    for(int i=0;i<users.length;i++){
                        if (users[i]instanceof Staff){
                            System.out.println(users[i].getData());
                        }
                    }
                } else if(a==0) {
                    break;
                }
            } else if(a==0) {
                break;
            }
        }
    }
}
class User{
    protected int id;
    protected String login;
    protected String password;
    protected String name;
    protected String surname;

    public User() {
        this.id = 0;
        this.login = "no login";
        this.password = " no password";
        this.name = "no name";
        this.surname = "no surname";
    }

    public User(int id, String login, String password, String name, String surname) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

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
    public String getData() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
class Staff extends User{
    private double salary;
    private String subjects[] = new String[100];
    private int indexOfSubject = 0;

    public Staff() {
        super();
        this.salary = 0;
        this.subjects = new String[]{};
    }

    public Staff(int id, String login, String password, String name, String surname, double salary) {
        super(id, login, password, name, surname);
        this.salary = salary;
        //  this.subjects = subjects;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public int getIndexOfSubject() {
        return indexOfSubject;
    }

    public void setIndexOfSubject(int indexOfSubject) {
        this.indexOfSubject = indexOfSubject;
    }


    public String getData() {
        String ans = "\n";
        for (int i=0;i<indexOfSubject;i++) {
            ans += String.valueOf(i+1) + ") " + getSubject(i) + "\n";
        }
        return "Staff{" +
                ", id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                "salary=" + salary +
                ", subjects=" + ans +
                ", indexOfSubject=" + indexOfSubject +
                '}';

    }
    public String getSubject(int index){
        return subjects[index];
    }

    public void addSubject(String sub){
        subjects[indexOfSubject]=sub;
        indexOfSubject++;
    }
}
class Studen extends User{
    private double gpa;
    private String courses[] = new String[100];
    private int indexOfCourses = 0;

    public Studen() {
        super();
        this.gpa = 0;
        this.courses = new String[]{};
        //this.indexOfCourses = 0;
    }

    public Studen(int id, String login, String password, String name, String surname, double gpa) {
        super(id, login, password, name, surname);
        this.gpa = gpa;
//        this.courses = courses;
//        this.indexOfCourses = indexOfCourses;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public String getData() {
        String ans="\n";
        for (int i=0;i<indexOfCourses;i++){
            ans+=String.valueOf(i+1)+") "+getCourses(i)+"\n";
        }
        return "Studen{" +
                ", id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                "gpa=" + gpa +
                ", courses=" + ans +
                ", indexOfCourses=" + indexOfCourses +
                '}';
    }
    public String getCourses(int index){
        return courses[index];
    }
    public void addCourses(String co){
        courses[indexOfCourses]=co;
        indexOfCourses++;
    }
}
//Создайте меню для первого задания, где вы управляете студентами, рабочими и пользователями.
//PRESS [1] ADD USER
//PRESS [1] TO ADD STUDENT
//PRESS [2] TO ADD STAFF
//PRESS [2] TO LIST USERS
//PRESS [1] TO LIST STUDENTS
//PRESS [2] TO LIST STAFF
//PRESS [0] TO EXIT
//(Подсказка: Фильтр вывода студента или рабочего нужно реализовать с помощью ключевого слова: instanceof)
//instanceof - специальное ключевое слово, которая возвращает true, если объект является типом данного класса.
//Например:
//Dog d = new Dog();
//if(d instanceof Dog){
//System.out.println("I am a Dog");
//}else{
//System.out.println("I am not a Dog");
//}
//В данном примере, объект d является экземпляром класса Dog.java, соответственно возвращает true.