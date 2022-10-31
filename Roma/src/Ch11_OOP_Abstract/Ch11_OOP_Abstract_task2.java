package Ch11_OOP_Abstract;

public class Ch11_OOP_Abstract_task2 {
    public static void main(String[] args) {
        SphereGold s1=new SphereGold(3);
        SphereGold s2=new SphereGold(5);
        SphereGold s3=new SphereGold(9);
        CubeGold c1=new CubeGold(3);
        CubeGold c2=new CubeGold(5);
        CubeGold c3=new CubeGold(9);
        GoldShape shapes[]={s1,s2,s3,c1,c2,c3};
        for (int i=0;i<shapes.length;i++){
            System.out.println(shapes[i].getPrice());
        }
    }
    public abstract static class GoldShape {

        public abstract double getVolume();
        public  double getPrice(){
            return getVolume()*250+1200;
        }
    }
    public static class CubeGold extends GoldShape{
        double side;

        public CubeGold() {
            this.side = 0;
        }
        public CubeGold(double side) {
            this.side = side;
        }
        @Override
        public double getVolume() {
            return side*side*side;
        }
    }
    public static class SphereGold extends GoldShape {
        double radius;

        public SphereGold() {
            this.radius =0;
        }

        public SphereGold(double radius) {
            this.radius = radius;
        }
        @Override
        public double getVolume() {
            return 4/3*3.14*radius*radius*radius;
        }
    }
}
//    Создайте абстрактный класс GoldShape (золотая фигура), с абстрактным методом double getVolume().
//        + abstract double getVolume()
//        Метод возвращает объем золотой фигуры. В этом классе есть уже реализованный метод  double getPrice().
//        + double getPrice()
//        Метод возвращает цену за это золото.
//        Формула цены за золото выглядит таким образом:
//        volume * 250 + 1200
//        Создайте  класс SphereGold (Сферическое золото) который наследуется от класса GoldShape, и имеет такой параметр как:
//        - double radius;
//        Нужно будет переопределить абстрактный метод getVolume() используя формулу вычисления объема сферы из геометрии.
//        Далее создайте класс CubeGold (Кубическое золото) который также наследуется от класса GoldShape, и имеет такой параметр как:
//        - double side;
//        Реализуйте метод getVolume() используя формулу вычисления объема куба из геометрии.
//        А теперь, в основном классе Main, создайте по 3 объекта класса SphereGold и CubeGold с разными параметрами.
//        Добавьте всех их в массив из абстрактного класса GoldShape, и выведите все цены на них при помощи метода - getPrice()