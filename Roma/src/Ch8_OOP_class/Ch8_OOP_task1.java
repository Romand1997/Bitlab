package Ch8_OOP_class;
public class Ch8_OOP_task1 {
    public static void main(String[] args) {
        Phone p1=new Phone();
        Phone p2=new Phone("Iphone", "4s", 123);
        System.out.println(p1.getData());
        System.out.println(p2.getData());
    }
}
 class Phone {
    String name;
    String model;
    int price;
    public Phone(){
        this.name="No name";
        this.model="No model";
        this.price=0;
    }
     public Phone(String name, String model, int price){
         this.name=name;
         this.model=model;
         this.price=price;
     }
    public String getData(){
        return "Name is "+name+". Model is "+model+". Price="+price;
    }
}
//    Создайте класс Phone с параметрами:
//
//        Phone.java
//
//        String name;
//
//        String model;
//
//        int price;
//
//        Обязательно создайте конструкторы (с параметрами и по умолчанию).
//
//        Далее, создайте в этом классе метод getData() который возвращает все параметры (name, model, price) данного класса.