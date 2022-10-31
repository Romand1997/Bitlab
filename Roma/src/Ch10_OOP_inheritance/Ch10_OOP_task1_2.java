package Ch10_OOP_inheritance;

public class Ch10_OOP_task1_2 {
    public static void main(String[] args) {
        Car c[] = new Car[3];
        c[0]=new Car("opel","zafira", 130, 2008, 1.1);
        c[1]=new Toyota("toyota","4runner", 150, 2005, 1.5, "Japan");
        c[2]=new Mersedes("mersedes","gl350", 200, 2015, 2.0, "G-class");
        for (int i=0; i<c.length;i++){
            System.out.println(c[i].ride());
        }
    }
}
class Car{
    protected String name;
    protected String model;
    protected int maxSpeed;
    protected int year;
    protected double volume;

    public Car() {
        this.name = "no name";
        this.model = "no model";
        this.maxSpeed = 0;
        this.year = 0;
        this.volume = 0;
    }
    public Car(String name, String model, int maxSpeed, int year, double volume){
        this.name=name;
        this.model=model;
        this.maxSpeed=maxSpeed;
        this.year=year;
        this.volume=volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
    public String ride() {
        return  "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", year=" + year +
                ", volume=" + volume +
                "} car is riding";
    }
}
class Toyota extends Car{
    private String manufacturer;
    public Toyota(){
        super();
        this.manufacturer="non";
    }

    public Toyota(String name, String model, int maxSpeed, int year, double volume, String manufacturer){
        super(name, model, maxSpeed, year, volume);
        this.manufacturer=manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public String ride() {
        return "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", year=" + year +
                ", volume=" + volume +
                ", manufacturer=" + manufacturer+
                "} car is riding";
    }
}
class Mersedes extends Car{
    private String classType;
    public Mersedes(){
        super();
        this.classType="non";
    }

    public Mersedes(String name, String model, int maxSpeed, int year, double volume, String classType){
        super(name, model, maxSpeed, year, volume);
        this.classType=classType;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public String ride() {
        return "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", year=" + year +
                ", volume=" + volume +
                ", classType=" + classType+
                "} car is riding";
    }
}
//        Создайте класс Car.java с параметрами:
//        Car.java
//        String name;
//        String model;
//        int maxSpeed;
//        int year;
//        double volume;
//        Обязательно создайте конструкторы (с параметрами и по умолчанию).
//        Далее, создайте в этом классе метод ride() который выводит на экран все параметры
//        данного класса и имитирует езду в виде текста (Car is riding).
//        Создайте класс Toyota.java, который наследуется от класса Car.java.
//        У класса Toyota.java будет дополнительный параметр:
//        String manufacturer; // Japan, Europe, USA, United Arabian Emirates
//        Переопределите метод ride() для класса Toyota.
//        Создайте класс Mercedes.java, который наследуется от класса Car.java.
//        У класса Mercedes.java будет дополнительный параметр:
//        String classType; // E Class, S Class, M Class …
//        Переопределите метод ride() для класса Mercedes.java.
//Создать по 3 объекта класса Car.java, Toyota.java и Mercedes.java. Добавьте всех их в один общий массив из класса Car.java,
//        и вызовите общий метод ride() для всех объектов в этом массиве.