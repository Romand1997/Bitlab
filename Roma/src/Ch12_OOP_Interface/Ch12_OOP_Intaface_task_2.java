package Ch12_OOP_Interface;

public class Ch12_OOP_Intaface_task_2 {
    public static void main(String[] args) {
        Programmers p1=new Programmers(1, "roma", 200, 34, 0.1);
        Programmers p2=new Programmers(2, "vanya", 200, 34, 0.2);
        Programmers p3=new Programmers(3, "miras", 200, 34, 0.3);
        Programmers p4=new Programmers(4, "anya", 200, 34, 0.4);
        Programmers p5=new Programmers(5, "kolya", 200, 34, 0.5);
        Staff s1=new Staff(1, "Roma", "staff", 101);
        Staff s2=new Staff(2, "vanya", "staff", 102);
        Staff s3=new Staff(3, "miras", "staff", 103);
        Staff s4=new Staff(4, "anya", "staff", 104);
        Staff s5=new Staff(5, "kolya", "staff", 105);
        HRManagers h1=new HRManagers(1,"RomaHR", 150);
        HRManagers h2=new HRManagers(1,"vanyaHR", 150);
        HRManagers h3=new HRManagers(1,"mirasHR", 150);
        HRManagers h4=new HRManagers(1,"anyaHR", 150);
        HRManagers h5=new HRManagers(1,"kolyaHR", 150);
        Workers []w= {h1, p2, s5, s4, p3, p1, s2, s3, p4, p5, s1, h2, h3, h4, h5};
        Workers sFirst=new Staff();
        int count=0;
        for (int i=0;i<w.length;i++){
            if(w[i]instanceof Staff){
                sFirst=w[i];
                count=i;
                break;
            }
        }
        int max= sFirst.getSalary();
        for(int i=0;i<w.length;i++){
            if (max<w[i].getSalary()&&w[i]instanceof Staff){
                max=w[i].getSalary();
                count=i;
            }
        }
        System.out.println(w[count].getWorkerData());
        System.out.println("----------");
        Workers nov=new Staff();
        for(int i=0;i< w.length;i++){
            for(int j=i+1;j<w.length;j++){
                if(w[i].getSalary()<w[j].getSalary()&&w[i]instanceof Staff&&w[j]instanceof Staff) {
                    nov=w[i];
                    w[i]=w[j];
                    w[j]=nov;
                }
            }
        }
        for (int i=0; i<w.length;i++) {
            if (w[i]instanceof Staff)
            System.out.println(w[i].getWorkerData());
        }
    }
}

//        Получается, вы создаете несколько классов, которые наследуют от интерфейса Workers.java:




//        В основном классе Main.java создайте по 5 объектов рабочих, отдела кадров и программистов.
//        a. Выведите данные рабочего, у которого самая высокая зарплата.
//        b. Отсортируйте рабочих, по зарплате, по убыванию.