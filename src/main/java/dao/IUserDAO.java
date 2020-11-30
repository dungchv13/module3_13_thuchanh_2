package dao;

import model.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserDAO {
    public void insertUser(User user) throws SQLException;

    public User selectUser(int id);

    public List<User> selectAllUsers();

    public boolean deleteUser(int id) throws SQLException;

    public boolean updateUser(User user) throws SQLException;

    public void addUserTransaction(User user, int[] permision);

    public void insertUpdateWithoutTransaction();

    public boolean updateUserStore(int id,String name,String email,String country);

    public List<User> selectAllUsersStore();

    public boolean deleteUserStore(int id);
}
