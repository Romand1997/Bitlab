package Ch11_OOP_Abstract;

public class Ch11_OOP_Abstract_task_3 {
    public static void main(String[] args) {


        RenaultEnigine r1 = new RenaultEnigine(3, 4, 104, 50);
        RenaultEnigine r2 = new RenaultEnigine(4, 6, 100, 50);
        RenaultEnigine r3 = new RenaultEnigine(5, 8, 160, 50);
        RenaultEnigine r4 = new RenaultEnigine(6, 12, 111, 50);
        RenaultEnigine r5 = new RenaultEnigine(6.5, 6, 180, 50);
        FerrariEngine f1 = new FerrariEngine(3, 4, 100);
        FerrariEngine f2 = new FerrariEngine(4, 6, 150);
        FerrariEngine f3 = new FerrariEngine(5, 8, 100);
        FerrariEngine f4 = new FerrariEngine(8, 12, 200);
        FerrariEngine f5 = new FerrariEngine(6, 6, 100);
        Engine e[] = {r1, r2, r3, r4, r5, f1, f2, f3, f4, f5};
        for (int i = 0; i < e.length;i++){
            System.out.println(e[i].getMaxSpeed());
        }
    }

    public abstract static class Engine {
        protected double engineVolume;
        protected int cylinderAmount;
        protected double engineWeight;

        public Engine() {
            this.engineVolume = 0;
            this.cylinderAmount = 0;
            this.engineWeight = 0;
        }

        public Engine(double engineVolume, int cylinderAmount, double engineWeight) {
            this.engineVolume = engineVolume;
            this.cylinderAmount = cylinderAmount;
            this.engineWeight = engineWeight;

        }

        public double getEngineVolume() {
            return engineVolume;
        }

        public void setEngineVolume(double engineVolume) {
            this.engineVolume = engineVolume;
        }

        public int getCylinderAmount() {
            return cylinderAmount;
        }

        public void setCylinderAmount(int cylinderAmount) {
            this.cylinderAmount = cylinderAmount;
        }

        public double getEngineWeight() {
            return engineWeight;
        }

        public void setEngineWeight(double engineWeight) {
            this.engineWeight = engineWeight;
        }
        public abstract double efficiency();
        public abstract double throttleEnergy();
        public abstract double breakEnergy();
        public double getMaxSpeed(){
            return (throttleEnergy()-breakEnergy())*efficiency();
        }
    }

    public static class FerrariEngine extends Engine {
        public FerrariEngine() {
            super();
        }

        public FerrariEngine(double engineVolume, int cylinderAmount, double engineWeight) {
            super(engineVolume, cylinderAmount, engineWeight);
        }

        @Override
        public double efficiency() {
            return 0.25;
        }

        @Override
        public double throttleEnergy() {
            return engineVolume*cylinderAmount*100;
        }

        @Override
        public double breakEnergy() {
            return engineWeight*2;
        }
    }

    public static class RenaultEnigine extends Engine {
        double extraTurboEnergy;
        public RenaultEnigine() {
            super();
            this.extraTurboEnergy=0;
        }

        public RenaultEnigine(double engineVolume, int cylinderAmount, double engineWeight, double extraTurboEnergy) {
            super(engineVolume, cylinderAmount, engineWeight);
            this.extraTurboEnergy=extraTurboEnergy;
        }

        @Override
        public double efficiency() {
            return 0.27;
        }

        @Override
        public double throttleEnergy() {
            return engineVolume*cylinderAmount*110 + extraTurboEnergy;
        }

        @Override
        public double breakEnergy() {
            return engineWeight*2.1;
        }
    }
}
//    Создайте абстрактный класс Engine.java с параметрами:
//        - double engineVolume;
//        - int cylinderAmount;
//        - double engineWeight;
//        Обязательно создайте конструкторы (с параметрами и по умолчанию).
//        Геттеры и сеттеры
//        У данного класса будут абстрактные методы как:
//        + abstract double efficiency();
//        + abstract double throttleEnergy();
//        + abstract double breakEnergy();
//        А также обычный метод как:
//        + double getMaxSpeed(){
//        return (throttleEnergy()-breakEnergy())*efficiency();
//        }
//        Создайте класс FerrariEngine.java который наследует от класса Engine.java.
//        Создайте конструктор с параметрами и конструктор по умолчанию
//        Реализуйте все абстрактные методы
//        В FerrariEngine.java вы вычислите абстрактные методы по формуле:
//        Efficiency: 0.25
//        Throttle energy: engineVolume*cylinderAmount*100
//        Break energy: engineWeight*2
//        Создайте класс RenaultEnigine.java который наследует от класса Engine.java.
//        Он имеет дополнительный параметр:
//        - double extraTurboEnergy;
//        Создайте конструктор с параметрами и конструктор по умолчанию.
//        Реализуйте все абстрактные методы
//        В RenaultEnigine.java вы вычислите абстрактные методы по формуле:
//        Efficiency: 0.27
//        Throttle energy: engineVolume*cylinderAmount*110 + extraTurboEnergy
//        Break energy: engineWeight*2.1
//        В основном классе Main.java, создайте по 5 объектов класса FerrariEngine.java и RenaultEnigine.java с разными значениями.
//        Добавьте все в массив класса Engine.java.
//        Выведите максимальные скорости каждого объекта