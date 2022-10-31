package Ch12_OOP_Interface;

public class Ch12_OOP_Interface_task_1 {
    public static void main(String[] args) {
        Users u1=new Users("Roma", "Danov");
        Users u2=new Users("petr", "Danov");
        Users u3=new Users("ivan", "Danov");
        Users u4=new Users("alexey", "zDanov");
        Users u5=new Users("kolya", "hDanov");
        Users u6=new Users("misha", "vDanov");
        Users u7=new Users("vasya", "nDanov");
        Users u8=new Users("pasha", "Danov");
        Users u9=new Users("vitya", "Danov");
        Users u10=new Users("anna", "Danov");

//        Users allU[]={u1, u2, u3, u4, u5, u6, u7, u8, u9, u10};
      UserBeanImp ubi=new UserBeanImp();
        ubi.addUser(u1);
        ubi.addUser(u2);
        ubi.addUser(u3);
        ubi.addUser(u4);
        ubi.addUser(u5);
        ubi.addUser(u6);
        ubi.addUser(u7);
        ubi.addUser(u8);
        ubi.addUser(u9);
        ubi.addUser(u10);
        ubi.getAllUsers();
        System.out.println("----------");
        ubi.getUsersByName("petr");
        System.out.println("----------");
        ubi.getUsersBySurname("danov");
    }
}



//        В главном классе создайте массив из минимум 10 объектов класса Users.java.
//        Создайте объект класса UserBeanImp.java. Используя данный класс, выведите список всех пользователей,
//        и всех пользователей на имя "John", и выведите список людей на фамилию "Smith".