package DAO;

import model.PaymentMethod;

import java.sql.SQLException;
import java.util.List;

public interface PaymentMethodDAO {
    List<PaymentMethod> getAll() throws SQLException;
}
