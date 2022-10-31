package Ch13_OOP_Try_Cath;

import java.util.Arrays;
import java.util.Scanner;

public class Ch13_OOP_Try_cath_task2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Library lib=new Library();
        System.out.println("Insert library name");
        lib.setName(in.next());
        System.out.println("Insert library city");
        lib.setCity(in.next());
        Book b = null;
        lib.addBooks(b);
        while (true){
            System.out.println("insert index of book or press 0 to end programm");
            int a= in.nextInt();
            if (a==0) {
                break;
            }
            System.out.println("insert book's name then book's author");
            lib.addBooks(a, in.next(), in.next());
        }
        System.out.print(lib);
    }
}
class Book{
    int id;
    String name;
    String author;
    public Book() {
        this.id = 0;
        this.name = "no name";
        this.author = "no author";
    }

    public Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getData() {
        return  "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\''
                ;
    }
}
class Library{
    String name;
    String city;
    Book books[] = new Book[20];
    int index = 0;
    public Library() {
        this.name = "no name";
        this.city = "no city";
    }

    public Library(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public void addBooks(int id, String name, String author){
        try {
        books[index]=new Book();
        books[index].id = id;
        books[index].name = name;
        books[index].author = author;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The library is full");
        }
        index++;
    }
    public void addBooks(Book b){
        books[index] = b;
        index++;
    }
    public String printBooks() {
        String ans = "Books are:" + "\n";
        for (int i = 0; i < index; i++) {
            try {
                ans += books[i].getData() + "\n";
            } catch (NullPointerException e) {
                ans += "The book is empty" + "\n";
            }

        }
        return ans;
    }


    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                "\n"+printBooks()+
                '}';
    }
}
//    Создайте класс Book с параметрами:
//        int id;
//        String name;
//        String author;
//        Добавьте геттеры и сеттеры и оба конструктора
//        + String getData();   ////данный метод возвращает все данные по книге
//        Создайте класс Library с параметрами:
//        String name;
//        String city;
//        Book books[] = new Book[20];
//        int index = 0;
//        Добавьте геттеры и сеттеры для каждого поля кроме index и массива books.
//        Создайте метод addBook(Book book), который добавляет книгу в список, и увеличивает значение index на 1.
//        Создайте метод printBooks(); //// данный метод списком выводит данные по всем книгам
//        В ходе разработки и запуска, есть вероятность что человек может добавить в список не инициализированный
//        объект класса Book (т.е. Book b = null), что приводит выбросу исключения NullPointerException, если мы
//        хотим вывести его данные с помощью метода getData().
//        Ваша задача состоит в том, чтобы метод printBooks() самостоятельно отлавливала эту ошибку и вместо выброса
//        из цикла программы, метод должен просто вывести сообщение: "The book is empty".
//        При добавлении книги в список книг при помощи метода addBook(Book book), вы должны отлавливать ошибку
//        ArrayIndexOutOfBoundsException, которая выбрасывается при превышении размера массива. и вместо исключения,
//        мы должны вывести на экран: "The library is full".