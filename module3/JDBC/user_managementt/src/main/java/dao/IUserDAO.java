package dao;

import model.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserDAO {
    void insertUser(User user) throws SQLException;
    User selectUser(int id);
    List<User> selectAllUser();
    Boolean deleteUser(int id) throws SQLException;
    Boolean updateUser(User user) throws SQLException;
}
