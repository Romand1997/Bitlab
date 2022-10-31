package Ch12_OOP_Interface;

public class UserBeanImp implements UserBean{
    Users user[];
    int count=0;

    public UserBeanImp() {
        this.user =new Users[1000];
    }


    public void addUser(Users user) {
        this.user[count] = user;
        count++;
    }

    @Override
    public void getAllUsers() {
        for (int i=0;i< count;i++){
            System.out.println(user[i].getUsers());
        }
    }
    @Override
    public void getUsersByName(String name) {
        for (int i=0;i<count;i++) {
            if (user[i].getName().equalsIgnoreCase(name)) {
                System.out.println(user[i].getUsers());
            }
        }
    }
    @Override
    public void getUsersBySurname(String surname) {
        for (int i=0;i< count;i++) {
            if (user[i].getSurname().equalsIgnoreCase(surname)) {
                System.out.println(user[i].getUsers());
            }
        }
    }
}
//        Создайте класс UserBeanImp.java который реализовывает интерфейс UserBean(UserBeanImp implements от UserBean)
//        - Users[] users;
//        +UserBeanImp(Users[] users) - конструктор улыбаюсь
//        Реализуйте все методы.