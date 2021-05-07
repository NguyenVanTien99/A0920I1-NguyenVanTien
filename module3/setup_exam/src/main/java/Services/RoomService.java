package Services;

import model.Room;

import java.sql.SQLException;
import java.util.List;

public interface RoomService {
    List<Room> getAll();
    Room getOneById(int id);
    boolean deleteById(int id) throws SQLException;
    void insert(Room room);
    void update(Room room);
}
