package DAO.ipml;

import DAO.RoomDAO;
import model.Room;
import utils.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RoomDAOimpl implements RoomDAO {
    private static final String SELECT_ALL = "Select * from room";
    private static final String SELECT_BY_ID = "Select * from room where id = ?";
    private static final String INSERT_ROOM = "insert into room(id,renterName, Phone, rentDate, paymentMethod, remark) values(?,?,?,?,?,?)";
    private static final String UPDATE_ROOM = "update room set renterName = ?, Phone = ?, rentDate = ?, paymentMethod = ?, remark = ? where id = ?";
    private static final String DELETE_ROOM = "delete from room where id = ?";

    @Override
    public List<Room> getAll() throws SQLException {
        List<Room> List = new ArrayList<>();
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL);
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next()){
            int id = resultSet.getInt("id");
            String renterName = resultSet.getString("renterName");
            String phoneNumber = resultSet.getString("Phone");
            String rentDate = resultSet.getString("rentDate");
            String paymentMethod = resultSet.getString("paymentMethod");
            String remark = resultSet.getString("remark");
            List.add(new Room(id,renterName,phoneNumber,rentDate,paymentMethod,remark));
        }
        return List;
    }

    @Override
    public Room getOneById(int id) throws SQLException {
        List<Room> List = this.getAll();
        for(Room room : List){
            if(room.getId() == id){
                return room;
            }
        }
        return null;
    }

    @Override
    public boolean deleteById(int id) throws SQLException{
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(DELETE_ROOM);
        preparedStatement.setInt(1,id);
        return preparedStatement.executeUpdate() > 0;
    }

    @Override
    public void insert(Room room) throws SQLException {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_ROOM);
        preparedStatement.setInt(1, room.getId());
        preparedStatement.setString(2, room.getRenterName());
        preparedStatement.setString(3, room.getPhoneNumber());
        preparedStatement.setString(4, room.getRentDate());
        preparedStatement.setString(5, room.getPaymentMethod());
        preparedStatement.setString(6, room.getRemark());
        preparedStatement.executeUpdate();

    }

    @Override
    public void update(Room room) throws SQLException {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_ROOM);
        preparedStatement.setString(1, room.getRenterName());
        preparedStatement.setString(2, room.getPhoneNumber());
        preparedStatement.setString(3, room.getRentDate());
        preparedStatement.setString(4, room.getPaymentMethod());
        preparedStatement.setString(5, room.getRemark());
        preparedStatement.setInt(6, room.getId());
        preparedStatement.executeUpdate();
    }
}
