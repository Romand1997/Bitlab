package Ch10_OOP_inheritance;

public class Ch10_OOP_task3_4 {
    public static void main(String[] args) {
        Sportsman c[] = new Sportsman[9];
        c[0]=new Footballer("футболист",23, "Russia", "2008", "nor");
        c[1]=new Gymnast("гимнаст",3, "RK", 05, 100, "br");
        c[2]=new Swimmer("swimmer", 34, "dgh","dsgfd", 23);
        c[3]=new Footballer("футболист",25, "Ru", "28", "nor");
        c[4]=new Gymnast("гимнаст",34, "RK", 20, 100, "br");
        c[5]=new Swimmer("plovets", 34, "dgh","dsgfd", 23);
        c[6]=new Footballer("футист",23, "ssia", "8", "nor");
        c[7]=new Gymnast("гимнаст",34, "Rb", 30, 100, "br");
        c[8]=new Swimmer("plov", 34, "dgh","dsgfd", 23);
        OlympicGames p=new OlympicGames("Tokyo" , 2016, c);
        for (int i=0; i<c.length;i++){
            System.out.println(p.getSportsmansList()[i].play());
        }
    }
}
class Sportsman{
    protected String fullName;
    protected int age;
    protected String country;

    public Sportsman() {
        this.fullName = "no name";
        this.age = 0;
        this.country = "no country";
    }

    public Sportsman(String fullName, int age, String country) {
        this.fullName = fullName;
        this.age = age;
        this.country = country;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    public String play(){
        return "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                "} is running";
    }
}


class Gymnast extends Sportsman{
    private int height;
    private int weight;
    private String style;
    public Gymnast() {
        super();
        this.height = 0;
        this.weight = 0;
        this.style = "style";
    }

    public Gymnast(String fullName, int age, String country, int height, int weight, String style) {
        super(fullName, age, country);
        this.height = height;
        this.weight = weight;
        this.style = style;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }
    public String play(){
        return "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                ", height='"+ height + '\'' +
                ", weight='"+ weight+
                ", style='"+ style+
                "} is running";
    }
}
class Footballer extends Sportsman{

    private String position;
    private String club;
    public Footballer() {
        super();
        this.position = "non";
        this.club ="non";

    }

    public Footballer(String fullName, int age, String country, String position, String club) {
        super(fullName, age, country);
        this.position = position;
        this.club = club;

    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String play(){
        return "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                ", position='"+ position + '\'' +
                ", club='"+ club+
                "} is running";
    }
}
class Swimmer extends Sportsman{

    private String style;
    private double recordTime;
    public Swimmer() {
        super();
        this.style = "non";
        this.recordTime =0;

    }

    public Swimmer(String fullName, int age, String country, String style, double recordTime) {
        super(fullName, age, country);
        this.style = style;
        this.recordTime = recordTime;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public double getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(double recordTime) {
        this.recordTime = recordTime;
    }

    public String play(){
        return "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                ", style='"+ style + '\'' +
                ", recordTime='"+ recordTime+
                "} is running";
    }
}
class OlympicGames{
    private String city;
    private int year;
    private Sportsman []sportsmansList;

    public OlympicGames() {
    }

    public OlympicGames(String city, int year, Sportsman[] sportsmansList) {
        this.city = city;
        this.year = year;
        this.sportsmansList = sportsmansList;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Sportsman[] getSportsmansList() {
        return sportsmansList;
    }

    public void setSportsmansList(Sportsman[] sportsmansList) {
        this.sportsmansList = sportsmansList;
    }
}
//    Создайте класс Sportsman.java с параметрами:
//        String fullName;
//        int age;
//        String country;
//        Метод play() - которая будет выводить данные спортсмена о том что он играет.
//        Далее, создайте класс Gymnast.java который наследует от класса Sportsman.java с параметрами:
//        int height;
//        int weight;
//        String style;
//        Переопределите метод play() для класса Gymnast.java.
//        Далее, создайте класс Footballer.java который наследует от класса Sportsman.java с параметрами:
//        String position;
//        String club;
//        Переопределите метод play() для класса Footballer.
//        Далее, создайте класс Swimmer.java который наследует от класса Sportsman.java с параметрами:
//        String style;
//        double recordTime;
//        Переопределите метод play() для класса Swimmer.java.



//    Создайте класс OlympicGames.java с параметрами:
//        String city;
//        int year;
//        Sportsman sportsmansList[];
//        Получается в главном классе, вы создадите по 3 гимнаста (Gymnast.java), футболиста (Footballer.java)
//        и пловца (Swimmer.java). Далее нужно создать один объект OlympicGames.java и заполнить внутренний массив спортсменами.
//        Затем, в главном классе заставьте всех спортсменов играть при помощи метода play().