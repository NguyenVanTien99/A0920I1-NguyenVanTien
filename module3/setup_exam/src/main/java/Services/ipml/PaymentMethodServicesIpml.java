package Services.ipml;

import DAO.PaymentMethodDAO;
import DAO.ipml.PaymentMethodDAOimpl;
import Services.PaymentMethodServices;
import model.PaymentMethod;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PaymentMethodServicesIpml implements PaymentMethodServices {
    PaymentMethodDAO paymentMethodDAO = new PaymentMethodDAOimpl();

    @Override
    public List<PaymentMethod> getAll() {
        try {
            return paymentMethodDAO.getAll();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
}
