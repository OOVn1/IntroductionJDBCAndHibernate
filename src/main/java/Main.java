import dao.UserDao;
import dao.UserDaoJDBCImpl;
import model.User;

public class Main {
    public static void main(String[] args) {
        UserDao userDao = new UserDaoJDBCImpl();
        userDao.createUserTable();
        userDao.saveUser("Иван", "Иванов", (byte) 35);
        userDao.saveUser("nameOne", "Сидоров", (byte) 15);
        userDao.saveUser("nameTwo", "Кузнецов", (byte) 25);
        userDao.saveUser("mameTree", "Смирнов", (byte) 105);
        userDao.removeUserById(1);
        userDao.getAllUsers().forEach(System.out::println);
        userDao.clearUserTable();
        userDao.dropUserTable();

    }
}
