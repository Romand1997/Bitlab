package Ch12_OOP_Interface;

public class HRManagers implements Workers {
    int id;
    String fullName;
    int salary;

    public HRManagers() {
    }

    public HRManagers(int id, String fullName, int salary) {
        this.id = id;
        this.fullName = fullName;
        this.salary = salary;
    }

    @Override
    public String getWorkerData() {
        return "HRManagers{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int getSalary() {
        return salary;
    }
}
//        HRManagers.java (Отдел кадров)
//        - int id;
//        - String fullName;
//        - int salary;