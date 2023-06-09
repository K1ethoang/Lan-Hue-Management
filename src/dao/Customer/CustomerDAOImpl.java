package dao.Customer;

import dao.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.CustomerModel;

/**
 *
 * @author Admin
 */
public class CustomerDAOImpl implements CustomerDAO {

    public static CustomerDAOImpl getInstance() {
        return new CustomerDAOImpl();
    }

    @Override
    public List<CustomerModel> getList() {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "SELECT * FROM customer\n"
                    + "ORDER BY CustomerID DESC;";
            List<CustomerModel> list = new ArrayList<>();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            while (rs.next()) {
                CustomerModel customer = new CustomerModel();

                customer.setID(rs.getInt("CustomerID"));
                customer.setName(rs.getString("Name"));
                customer.setPhoneNumber(rs.getString("UN_PhoneNumber"));
                customer.setSex(rs.getInt("Sex"));
                customer.setCitizenNumber(rs.getString("UN_CitizenNumber"));
                customer.setAddress(rs.getString("Address"));

                list.add(customer);
            }
            ps.close();
            rs.close();
            con.close();
            return list;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public CustomerModel getByID(int ID) {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "SELECT * FROM customer WHERE CustomerID = ?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, ID + "");

            ResultSet rs = ps.executeQuery();

            CustomerModel customer = null;
            if (rs.next()) {
                customer = new CustomerModel();
                customer.setID(rs.getInt("CustomerID"));
                customer.setName(rs.getString("Name"));
                customer.setPhoneNumber(rs.getString("UN_PhoneNumber"));
                customer.setSex(rs.getInt("Sex"));
                customer.setCitizenNumber(rs.getString("UN_CitizenNumber"));
                customer.setAddress(rs.getString("Address"));
            }

            ps.close();
            rs.close();
            con.close();
            return customer;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean insert(CustomerModel customer) {
        boolean isOk = false;
        try {
            Connection con = DBConnection.getConnection();
//            String sql = "insert into Customer(?, ?, ?, ?, ?, ?)";
            String sql = "INSERT INTO Customer(Name, UN_PhoneNumber, Sex, UN_CitizenNumber, Address)\n"
                    + "VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, customer.getName());
            ps.setString(2, customer.getPhoneNumber());
            ps.setInt(3, customer.getSex());
            ps.setString(4, customer.getCitizenNumber());
            ps.setString(5, customer.getAddress());

            int rs = ps.executeUpdate();
            if (rs > 0) {
                isOk = true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return isOk;
    }

    @Override
    public boolean delete(int id) {
        boolean isDelete = false;
        try {
            Connection con = DBConnection.getConnection();
            String sql = "DELETE FROM Customer WHERE CustomerID = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            int rs = ps.executeUpdate();
            if (rs > 0) {
                isDelete = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isDelete;
    }

    @Override
    public boolean update(CustomerModel customer) {
        boolean isUpdated = false;
        try {
            Connection con = DBConnection.getConnection();
            String sql = "UPDATE CUSTOMER SET Name = ?, UN_PhoneNumber = ?, Sex = ?, UN_CitizenNumber = ?, Address = ? WHERE CustomerID = ?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, customer.getName());
            ps.setString(2, customer.getPhoneNumber());
            ps.setInt(3, customer.getSex());
            ps.setString(4, customer.getCitizenNumber());
            ps.setString(5, customer.getAddress());
            ps.setInt(6, customer.getID());
            int rs = ps.executeUpdate();
            if (rs > 0) {
                isUpdated = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isUpdated;
    }
}
