package Ch11_OOP_Abstract;

public class Ch11_OOP_Abstract_task1 {
    public static void main(String[] args) {
        Chocolate snickers=new Chocolate("Snickers",200);
        Chocolate twix=new Chocolate("Twix",250);
        Burger firstBurger=new Burger("Burger King",3, 2);
        Burger secondBurger=new Burger("McDonalds",2, 1);
        Coke cola=new Coke("Coca-Cola", 500, true);
        Coke tea=new Coke("Fuse Tea", 500, false);
        Food food[]={snickers, twix, firstBurger, secondBurger, cola, tea};
        double max=food[0].getCalories();
        int count=0;
        for (int i=0;i<food.length;i++){
            System.out.print(food[i].name+" Calories=");
            System.out.println(food[i].getCalories());
            if(max<=food[i].getCalories()){
                max=food[i].getCalories();
                count=i;
            }
        }
        System.out.println("The highest calorie is "+food[count].name+" Calories="+food[count].getCalories());
    }

    public abstract static class Food {
        String name;

        public Food() {
            this.name="no name";
        }

        public Food(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Food{" +
                    "name='" + name + '\'' +
                    '}';
        }

        public abstract double getCalories();
    }

    public static class Chocolate extends Food {
        int weight;

        public Chocolate() {
            super();
            this.weight=0;
        }
        public Chocolate(String name, int weight) {
            super(name);
            this.weight = weight;
        }
        public double getCalories(){
            return weight*740;
        }
    }

    public static class Burger extends Food {
        private int meatAmount;
        private int meatType;
        private int kkal;
        public Burger() {
            super();
            this.meatAmount = 0;
            this.meatType = 0;
           // this.kkal = 0;
        }

        public Burger(String name, int meatAmount, int meatType) {
            super(name);
            this.meatAmount = meatAmount;
            this.meatType = meatType;

        }

        public int getMeatAmount() {
            return meatAmount;
        }

        public void setMeatAmount(int meatAmount) {
                this.meatAmount = meatAmount;
        }

        public int getMeatType() {
            return meatType;
        }

        public void setMeatType(int meatType) {
                this.meatType = meatType;
        }

        @Override
        public double getCalories() {
            if (meatType==1){
                kkal=840;
            } else if (meatType==2){
                kkal=560;
            } else {
                System.out.println("ERROR meatType");
            }
            if (meatAmount==1||meatAmount==2||meatAmount==3){
                this.meatAmount = meatAmount;
            } else {
                System.out.println("ERROR meatAmount");
            }
                return kkal*840;
        }
    }

    public static class Coke extends Food {
        double volumeLiters;
        boolean isSparkling;
        int kkal=0;

        public Coke() {
            super();
            this.volumeLiters = 0;
        }

        public double getVolumeLiters() {
            return volumeLiters;
        }

        public void setVolumeLiters(double volumeLiters) {
            this.volumeLiters = volumeLiters;
        }

        public boolean isSparkling() {
            return isSparkling;
        }

        public void setSparkling(boolean isSparkling) {
            this.isSparkling=isSparkling;
        }

        public Coke(String name, double volumeLiters, boolean isSparkling) {
            super(name);
            this.volumeLiters = volumeLiters;
            this.isSparkling = isSparkling;
        }
        @Override
        public double getCalories() {
            if (isSparkling){
                kkal=400;
            } else {
                kkal=100;
            }
            return kkal*volumeLiters;
        }
    }
}
//    Создайте простой абстрактный класс Food.java, с параметром:
//        - String name;
//        У данного класса есть абстрактный метод - getCalories().
//        + abstract double getCalories();
//        Метод возвращает количество калории.
//        Создайте класс Chocolate.java, который наследуется от класса Food.java.
//        У  класса Chocolate.java будет такой параметр как:
//        - int weight;
//        Нужно будет переопределить абстрактный метод getCalories().
//        Формула подсчета калорий для шоколада будет: weight * 740.
//        Создайте класса Burger.java который также наследуется от класса Food.java, и укажите такие параметры как:
//        - int meatAmount; // количество мяса 1,2 или 3
//        - int meatType; //тип мяса, 1 - это говядина, 2 - это курица.
//        Нужно будет переопределить абстрактный метод getCalories(). Формула подсчета калорий для бургера:
//        если тип мяса говядина, то meatAmount * 840, если курица, то meatAmount * 560.
//        Создайте класс Coke.java,  который наследуется от класса Food.java, и имеет такие параметры как:
//        - double volumeLiters;
//        - boolean isSparkling; // Газированная или нет
//        Нужно будет переопределить абстрактный метод getCalories(). Формула подсчета калорий
//        будет таким образом: если газированная, то volumeLiters * 400, если нет, то volumeLiters * 100.
//        В основном классе, создайте 2 шоколада (Snickers и Twix), 2 бургера (Burger King и McDonalds),
//        2 напитка (Coca Cola и Fuse Tea) с разными значениями. Затем, добавьте их в массив из абстрактного
//        класса Food. Выведите название всех товаров с их калориями. В конце отдельно выведите самую калорийную из них.