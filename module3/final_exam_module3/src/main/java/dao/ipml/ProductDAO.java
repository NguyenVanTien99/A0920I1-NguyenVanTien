package dao.ipml;

import dao.IProductDAO;
import model.Product;
import utils.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO implements IProductDAO {
    private static final String SELECT_ALL = "Select * from product";

    private static final String INSERT_ROOM = "insert into product(id,name, price, discount, stock) values(?,?,?,?,?)";

    private static final String TOP_5 = "SELECT id,name,ProductID, SUM(ctdh.SoLuongBan) AS soluong\n" +
            "FROM CHITIET_DONHANG ctdh join PRODUCT p ON ctdh.ProductID = p.id\n" +
            "GROUP BY ctdh.ProductID\n" +
            "ORDER BY soluong desc\n" +
            "limit 5 ";

    @Override
    public List<Product> getAll() throws SQLException {
        List<Product> list = new ArrayList<>();
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL);
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next()){
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            int price = resultSet.getInt("price");
            int discount = resultSet.getInt("discount");
            int stock = resultSet.getInt("stock");
            list.add(new Product(id,name,price,discount,stock));
        }
        return list;

    }

    @Override
    public void insert(Product product) throws SQLException {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_ROOM);
        preparedStatement.setInt(1, product.getId());
        preparedStatement.setString(2, product.getName());
        preparedStatement.setInt(3, product.getPrice());
        preparedStatement.setInt(4, product.getDiscount());
        preparedStatement.setInt(5, product.getStock());
        preparedStatement.executeUpdate();
    }


}
