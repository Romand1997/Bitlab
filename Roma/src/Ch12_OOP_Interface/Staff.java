package Ch12_OOP_Interface;

public class Staff implements Workers{
    int id;
    String name;
    String surname;
    int salary;

    public Staff() {
    }

    public Staff(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String getWorkerData() {
        return "Staff{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int getSalary() {
        return salary;
    }
}
//        Staff.java (Рабочие)
//        - int id;
//        - String name;
//        - String surname;
//        - int salary;