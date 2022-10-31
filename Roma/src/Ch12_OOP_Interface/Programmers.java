package Ch12_OOP_Interface;

public class Programmers implements Workers {
    int id;
    String nickname;
    int salary;
    int bonusSalary;
    double KPIValue;

    public Programmers() {
    }

    public Programmers(int id, String nickname, int salary, int bonusSalary, double KPIValue) {
        this.id = id;
        this.nickname = nickname;
        this.salary = salary;
        this.bonusSalary = bonusSalary;
        this.KPIValue = KPIValue;
    }

    @Override
    public String getWorkerData() {
        return "Programmers{" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                ", salary=" + salary +
                ", bonusSalary=" + bonusSalary +
                ", KPIValue=" + KPIValue +
                '}';
    }

    @Override
    public int getSalary() {
        return (int)(salary + KPIValue*bonusSalary);
    }
}
//        Programmers.java (Программисты)
//        - int id;
//        - String nickname;
//        - int salary;
//        - int bonusSalary;
//        - double KPIValue;
//        Получается у каждого класса есть свои особенности, но ваша задача реализовать абстрактные методы.
//        В принципе при вызове метода getSalary() у всех классов возвращается значение зарплаты, но у
//        программистов подсчет зарплаты идет таким образом: salary + KPIValue*bonusSalary. KPIValue -
//        это коэффициент объема работы, выполненный за определенный период, и его значение от 0 до 1 включительно.