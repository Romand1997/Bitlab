package Ch11_OOP_Abstract;

import java.util.Scanner;

public class Ch11_OOP_Abstract_task_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ERPSystem erp = new ERPSystem();
        while (true) {
            System.out.println("PRESS [1] TO ADD USER");
            System.out.println("PRESS [2] TO LIST USERS");
            System.out.println("PRESS [0] TO EXIT");
            int second = in.nextInt();
            if (second == 1) {
                while (true) {
                    System.out.println("PRESS [1] TO ADD STUDENT");
                    System.out.println("PRESS [2] TO ADD TEACHER");
                    System.out.println("PRESS [0] TO EXIT IN MAIN MENU");
                    int first = in.nextInt();
                    if (first == 1) {

                        Student stud = new Student();
                        System.out.println("Insert login");
                        stud.login = in.next();
                        System.out.println("Insert password");
                        stud.password = in.next();
                        System.out.println("Insert name");
                        stud.setName(in.next());
                        System.out.println("Insert surname");
                        stud.setSurname(in.next());
                        System.out.println("Insert group");
                        stud.setGroup(in.next());
                        System.out.println("Insert GPA");
                        stud.setGpa(Double.parseDouble(in.next()));
                        erp.addUsers(stud);
                    } else if (first == 2) {
                        Teacher teach = new Teacher();
                        System.out.println("Insert login");
                        teach.login = in.next();
                        System.out.println("Insert password");
                        teach.password = in.next();
                        System.out.println("Insert NickName");
                        teach.setNickName(in.next());
                        System.out.println("Insert status");
                        teach.setStatus(in.next());
                        erp.addUsers(teach);
                        System.out.println("PRESS [1] TO ADD SUBJECT");
                        System.out.println("PRESS [0] TO DON'T ADDING SUBJECT");

                        int fourth = in.nextInt();
                        if (fourth == 1) {
                            while (true) {
                                System.out.println("PRESS [0] TO FINISH ADDING SUBJECT");
                                String subject = in.next();
                                if (subject.equals("0")) {
                                    break;
                                }else {
                                    teach.addSubject(subject);
                                }
                            }
                        } //else if (fourth == 0) {
                           // break;
                   // }
                    } else if (first==0){
                        break;
                    }
                }
            } else if (second == 2) {
                while (true){
                    System.out.println("PRESS [1] TO LIST STUDENTS");
                    System.out.println("PRESS [2] TO LIST TEACHERS");
                    System.out.println("PRESS [3] TO LIST USER BY INDEX");
                    System.out.println("PRESS [0] TO EXIT IN MAIN MENU");
                    int third= in.nextInt();
                    if (third==1){
                        erp.printByClass(third);
                    } else if (third==2) {
                        erp.printByClass(third);
                    } else if (third==3) {
                        System.out.println("ENTER INDEX:");
                        erp.printUser(in.nextInt());
                    } else if (third==0) {
                        break;
                    }
//
//
                }
            }
            // erp.addUsers(s);
        }
    }

    public static class ERPSystem {
        User []memory = new User[1000]; ////максимум 1000 пользователей
        int sizeOfUsers = 0;
        public ERPSystem() {

        }

        public void addUsers(User u){
            memory[sizeOfUsers]=u;
            sizeOfUsers++;
        }

        public void printByClass(int x){
            for(int i = 0; i < sizeOfUsers;i++)
                if(x == 1) {
                    if (memory[i] instanceof Student) {
                        System.out.println(memory[i].getUSerData());
                    }
                }else if(x == 2) {
                if (memory[i] instanceof Teacher) {
                    System.out.println(memory[i].getUSerData());
                }
            }

        }
        public void printAllUsers() {
            for(int i=0;i<sizeOfUsers;i++)
                System.out.println(memory[i].getUSerData());
        }
        public void printUser(int index){
            if (index<sizeOfUsers) {
                System.out.println(memory[index].getUSerData());
            } else System.out.println("No such user in this index");
        }

    }

    public abstract static class User {
        protected int id;
        protected String login;
        protected String password;
        public User() {
            this.id = 0;
            this.login = "No login";
            this.password = "No password";
        }

        public User(int id, String login, String password) {
            this.id = id;
            this.login = login;
            this.password = password;
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

        public abstract String getUSerData();
    }

    public static class Student extends User {
        private String name;
        private String surname;
        private String group;
        private double gpa;
        public Student() {
            super();
            this.name = "No name";
            this.surname = "No surname";
            this.group = "No group";
            this.gpa = 0;
        }

        public Student(int id, String login, String password, String name, String surname, String group, double gpa) {
            super(id, login, password);
            this.name = name;
            this.surname = surname;
            this.group = group;
            this.gpa = gpa;
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

        public String getGroup() {
            return group;
        }

        public void setGroup(String group) {
            this.group = group;
        }

        public double getGpa() {
            return gpa;
        }

        public void setGpa(double gpa) {
            this.gpa = gpa;
        }

        @Override
        public String getUSerData() {
            return "Student{" +
                    "id=" + id +
                    ", login='" + login + '\'' +
                    ", password='" + password + '\'' +
                    ", name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", group='" + group + '\'' +
                    ", gpa=" + gpa +
                    '}';
        }
    }

    public static class Teacher extends User {
        private String nickName;
        private String status; //// например: Professor, Lecturer, Tutor, Assistant.
        private String subjects[] = new String[10]; //// Предметы которые он ведет, максимум 10
        private int sizeOfSubjects = 0;
        private String allSubjects="";

        public Teacher() {
            super();
            this.nickName = "nickName";
            this.status = "status";
        }
        public Teacher(int id, String login, String password, String nickName, String status) {
            super(id, login, password);
            this.nickName = nickName;
            this.status = status;
        }

        public String getNickName() {
            return nickName;
        }

        public void setNickName(String nickName) {
            this.nickName = nickName;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

    //    public String getSubjects() {
    //        return subjects;
    //    }
        public void addSubject(String subject){
            subjects[sizeOfSubjects]=subject;
            sizeOfSubjects++;
        }

        @Override
        public String getUSerData() {
            for(int i=0;i<sizeOfSubjects;i++){
            allSubjects+=i+1+") "+subjects[i]+"\n";
                System.out.println(subjects[i] + " I em here");
        }
            return "Teacher{" +
                    "id=" + id +
                    ", login='" + login + '\'' +
                    ", password='" + password + '\'' +
                    ", nickName='" + nickName + '\'' +
                    ", status='" + status + '\'' +
                    ", allSubjects='" +"\n"+
                    allSubjects + '\'' +
                    '}';
        }

    }
}
//        В главном классе Main.java, создайте один объект класса ERPSystem.java, где вы управляете
//        пользователями и реализуйте мини приложение:
//        PRESS [1] TO ADD USER
//            PRESS [1] TO ADD STUDENT
//            Login:
//            Password:
//            Name:
//            Surname:
//            Group:
//            GPA:
//            PRESS [2] TO ADD TEACHER
//            Login:
//            Password:
//            Nick Name:
//            Status:
//                PRESS [1] TO ADD SUBJECT
//                Subject:
//                PRESS [0] TO FINISH ADDING SUBJECT
//        PRESS [2] TO LIST USERS
//             PRESS [1] TO LIST STUDENTS
//             PRESS [2] TO LIST TEACHERS
//             PRESS [3] TO LIST USER BY INDEX
//             ENTER INDEX:
//        PRESS [0] TO EXIT



//    Создайте абстрактный класс User.java с параметрами:
//        - int id;
//        - String login;
//        - String password;
//        Создайте абстрактный метод:
//        + abstract String getUserData();
//        Создайте конструкторы по умолчанию и с параметрами.
//        Создайте геттеры и сеттеры.
//        Cоздайте класс Student.java которая наследует от класса User.java с параметрами.
//        - String name;
//        - String surname;
//        - String group;
//        - double gpa;
//        Создайте конструкторы по умолчанию и с параметрами.
//        Создайте геттеры и сеттеры.
//        Реализуйте метод getUserData() которая должна возвращать все параметры пользователя.
//        Создайте класс Teacher.java которая наследует от класса User.java с параметрами.
//        - String nickName;
//        - String status; //// например: Professor, Lecturer, Tutor, Assistant.
//        - String subjects[] = new String[10]; //// Предметы которые он ведет, максимум 10
//        - int sizeOfSubjects = 0;
//        Создайте конструкторы по умолчанию и с параметрами
//        Создайте геттеры и сеттеры
//        Для полей sizeOfSubjects и subjects[] создайте только геттеры.
//        Создайте специальный метод addSubject(String subject), которая добавляет предмет в массив subjects.
//        Реализуйте метод getUserData() которая должна возвращать все параметры пользователя, включая все предметы которые он ведет.
//        Создайте класс ERPSystem.java которая управляет пользователями, с параметрами и методами:
//        - User []memory = new User[1000]; ////максимум 1000 пользователей
//        - int  = 0;
//        void addUser(User u); //// метод добавляет пользователя
//        void printAllUsers(); //// метод выводит на экран всех пользователей
//        void printUser(int index); //// метод выводит на экран одного пользователя, но если пользователь
//         по данному индексу не существует, то выводит сообщение: "No such user in this index"


