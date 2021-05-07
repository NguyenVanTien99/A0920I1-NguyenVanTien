package DAO;

import model.Room;

import java.sql.SQLException;
import java.util.List;

public interface RoomDAO {
    List<Room> getAll() throws SQLException;
    Room getOneById(int id) throws SQLException;
    boolean deleteById(int id) throws SQLException;
    void insert(Room room) throws SQLException;
    void update(Room room) throws SQLException;
}
