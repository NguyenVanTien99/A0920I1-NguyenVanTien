package DAO.ipml;

import DAO.PaymentMethodDAO;
import model.PaymentMethod;
import utils.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PaymentMethodDAOimpl implements PaymentMethodDAO {
    private static final String SELECT_ALL = "Select * from payment";
    @Override
    public List<PaymentMethod> getAll() throws SQLException {
        List<PaymentMethod> List = new ArrayList<>();
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL);
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next()){
            String paymentName = resultSet.getString("name");
            List.add(new PaymentMethod(paymentName));
        }
        return List;
    }
}
