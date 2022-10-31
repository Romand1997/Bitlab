//package OOP_encapsulation;
//
//public class Ch9_OOP_task1 {
//    public static void main(String[] args) {
//        Phone f=new Phone();
//        f.setName("Sumsung");
//        f.setModel("s20");
//        f.setPrice(20000);
//        f.setMemory(256);
//        System.out.println(f);
//    }
//}
//class Phone{
//    private String name;
//    private String model;
//    private int price;
//    private int memory;
//
//    public Phone() {
//        this.name = "no name";
//        this.model = "no model";
//        this.price = 0;
//        this.memory = 0;
//    }
//
//    public Phone(String name, String model, int price, int memory) {
//        this.name = name;
//        this.model = model;
//        this.price = price;
//        this.memory = memory;
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
//    public String getModel() {
//        return model;
//    }
//
//    public void setModel(String model) {
//        this.model = model;
//    }
//
//    public int getPrice() {
//        return price;
//    }
//
//    public void setPrice(int price) {
//        this.price = price;
//    }
//
//    public int getMemory() {
//        return memory;
//    }
//
//    public void setMemory(int memory) {
//        this.memory = memory;
//    }
//
//    @Override
//    public String toString() {
//        return "Phone{" +
//                "name='" + name + '\'' +
//                ", model='" + model + '\'' +
//                ", price=" + price +
//                ", memory=" + memory +
//                '}';
//    }
//}
//    Создайте простой класс - Phone.java с параметрами:
//        Phone.java
//        - String name;
//        - String model;
//        - int price;
//        - int memory;
//        Нужно будет добавить конструкторы, геттеры и сеттеры для каждого параметра.




//package OOP_encapsulation;
//
//public class Ch9_OOP_task1 {
//    public static void main(String[] args) {
//    //    Phone f=new Phone();
//        Phone f=new Phone("Sumsung","s20", 1000, 256);
////        f.setName("Sumsung");
////        f.setModel("s20");
////        f.setPrice(20000);
////        f.setMemory(256);
//        System.out.println(f);
//        System.out.println(f.getCategory());
//    }
//
//}
//class Phone{
//    private String name;
//    private String model;
//    private int price;
//    private int memory;
//
//    public Phone(){
//      this.name="no name";
//      this.model="no mode";
//      this.price=0;
//      this.memory=0;
//    }
//    public Phone(String name, String model, int price, int memory){
//        this.name=name;
//        this.model=model;
//        this.price=price;
//        this.memory=memory;
//    }
//    public String getName(){
//        return name;
//    }
//    public void setName(String name){
//        this.name=name;
//    }
//    public String getModel(){
//        return model;
//    }
//    public void setModel(String model){
//        this.model=model;
//    }
//    public int getPrice(){
//        return price;
//    }
//    public void setPrice(int price){
//        this.price=price;
//    }
//    public int getMemory(){
//        return memory;
//    }
//    public void setMemory(int memory) {
//        this.memory = memory;
//    }
//    public String toString(){
//        return "Name "+name+". model "+model+" price="+price+". memory"+memory;
//    }
//    public String getCategory(){
//        if(price>1000){
//            return "TOP";
//        }  else if (price>500){
//            return "MEDIUM";
//        } else {
//            return "SIMPLE";
//        }
//    }
//}


//    Продолжайте работать с предыдущим классом Phone.java. Добавьте специальный метод String getCategory(),
//        который возвращает категорию в зависимости от цены телефона.
//        Алгоритм вычисления категории (метода getCategory()) будет таким:
//        Если цена выше 1000 долларов, то метод будет возвращать текст - "ТОП".
//        Если между 1000 долларов и 500 долларов, то "MEDIUM".
//        Ниже будет "SIMPLE".





//package OOP_encapsulation;
//
//public class Ch9_OOP_task1 {
//    public static void main(String[] args) {
//        Phone p0=new Phone("sums", "s20", 20000, 256);
//        Phone p1=new Phone("nokia", "s20", 100, 256);
//        Phone p2=new Phone("motorolla", "s20", 550, 256);
//        Phone p3=new Phone("huawei", "s20", 500, 256);
//        Phone p4=new Phone("honor", "s20", 1000, 256);
//        Phone p5=new Phone("oppo", "s20", 1, 256);
//        Phone p6=new Phone("iphone", "s20", 28900, 256);
//        Phone p7=new Phone("oneplus", "s20", 20900, 256);
//        Phone p8=new Phone("xiaomi", "s20", 20990, 256);
//        Phone p9=new Phone("siemens", "s20", 28888, 256);
//        Phone allPh[]= {p0,p1,p2,p3,p4,p5,p6,p7,p8,p9};
//        for (int i=0;i<allPh.length;i++) {
//            System.out.println(allPh[i]);
//        }
//    }
//}
//class Phone{
//private String name;
//private String model;
//private int price;
//private int memory;
//    public Phone() {
//       this.name = "name";
//       this.model = "model";
//       this.price = 0;
//       this.memory = 0;
//    }
//    public Phone(String name, String model, int price, int memory) {
//       this.name = name;
//       this.model = model;
//       this.price = price;
//       this.memory = memory;
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
//    public String getModel() {
//        return model;
//    }
//
//    public void setModel(String model) {
//        this.model = model;
//    }
//
//    public int getPrice() {
//        return price;
//    }
//
//    public void setPrice(int price) {
//        this.price = price;
//    }
//
//    public int getMemory() {
//        return memory;
//    }
//
//    public void setMemory(int memory) {
//        this.memory = memory;
//    }
//    public String getCategory() {
//        if (this.price > 1000) {
//            return "TOP";
//        } else if (this.price > 500) {
//            return "MEDIUM";
//        } else {
//            return "SIMPLE";
//        }
//    }
//
//
//    public String toString() {
//        return "Phone{" +
//                "name='" + name + '\'' +
//                ", model='" + model + '\'' +
//                ", price=" + price +
//                ", memory=" + memory +
//                ", category="+ getCategory()+
//                '}';
//    }
//}


//    Продолжайте работать с предыдущим заданием. Создайте отдельный основной класс - Main.java,
//        где мы создадим 10 объектов класса Phone.java с разными значениями параметров.
//        Нужно будет все эти объекты поместить в массив. Затем, через обычный цикл вывести
//        наименования и их категории (через метод getCategory()) в консоль.




package Ch9_OOP_encapsulation;

public class Ch9_OOP_task1 {
    public static void main(String[] args) {
        Phone p0=new Phone("sums", "s20", 20000, 256);
        Phone p1=new Phone("nokia", "s20", 100, 256);
        Phone p2=new Phone("motorolla", "s20", 550, 256);
        Phone p3=new Phone("huawei", "s20", 500, 256);
        Phone p4=new Phone("honor", "s20", 1000, 256);
        Phone p5=new Phone("oppo", "s20", 1, 256);
        Phone p6=new Phone("iphone", "s20", 28900, 256);
        Phone p7=new Phone("oneplus", "s20", 20900, 256);
        Phone p8=new Phone("xiaomi", "s20", 20990, 256);
        Phone p9=new Phone("siemens", "s20", 28888, 256);
        Phone allPh[]= {p0,p1,p2,p3,p4,p5,p6,p7,p8,p9};
        for (int i=0;i<allPh.length;i++) {
            allPh[i].notAllCategory();
        }
    }
}
class Phone{
    private String name;
    private String model;
    private int price;
    private int memory;
    public Phone() {
        this.name = "name";
        this.model = "model";
        this.price = 0;
        this.memory = 0;
    }
    public Phone(String name, String model, int price, int memory) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.memory = memory;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }
    public String getCategory() {
        if (this.price > 1000) {
            return "TOP";
        } else if (this.price > 500) {
            return "MEDIUM";
        } else {
            return "SIMPLE";
        }
    }
    public void notAllCategory(){
        if(getCategory()=="TOP"||getCategory()=="SIMPLE") {
            System.out.println( toString());
        }
    }
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", memory=" + memory +
                ", category="+ getCategory()+
                '}';
    }
}
//        Продолжайте работать с предыдущим заданием.
//        Нужно будет вывести данные телефона только с категориями "TOP" и "SIMPLE".