package Ch12_OOP_Interface;

public class Users {
    private String name;
    private String surname;

    public Users() {
        this.name = "name";
        this.surname = "surname";
    }

    public Users(String name, String surname) {
        this.name = name;
        this.surname = surname;
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
    public String getUsers(){
        return "name is "+name+" surname is "+surname;
    }
}
//    Создайте класс Users.java с параметрами:
//        - String name;
//        - String surname;
//        Конструкторы по умолчанию и с параметрами.
//        Создайте геттеры и сеттеры