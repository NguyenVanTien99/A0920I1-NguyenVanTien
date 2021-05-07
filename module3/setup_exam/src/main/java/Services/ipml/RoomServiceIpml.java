package Services.ipml;

import DAO.RoomDAO;
import DAO.ipml.RoomDAOimpl;
import Services.RoomService;
import model.Room;

import java.sql.SQLException;
import java.util.List;

public class RoomServiceIpml implements RoomService {
    RoomDAO roomDAO = new RoomDAOimpl();

    @Override
    public List<Room> getAll() {
        try {
            return roomDAO.getAll();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    @Override
    public Room getOneById(int id) {
        List<Room> roomList = this.getAll();
        for (Room room: roomList){
            if (room.getId() == id){
                return room;
            }
        }
        return null;
    }

    @Override
    public boolean deleteById(int id) throws SQLException {
            return roomDAO.deleteById(id);
    }

    @Override
    public void insert(Room room) {
        try {
            roomDAO.insert(room);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void update(Room room) {
        try {
            roomDAO.update(room);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
