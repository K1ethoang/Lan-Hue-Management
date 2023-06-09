package dao.Staff;

import dao.DBConnection;
import dao.Role.RoleDAOImpl;
import java.util.List;
import model.StaffModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.RoleModel;

public class StaffDAOImpl implements StaffDAO {

    public static StaffDAOImpl getInstance() {
        return new StaffDAOImpl();
    }

    @Override
    public List<StaffModel> getList() {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "SELECT * FROM staff\n"
                    + "ORDER BY StaffID DESC;";

            List<StaffModel> list = new ArrayList<>();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            while (rs.next()) {
                RoleModel roleModel;
                roleModel = RoleDAOImpl.getInstance().getByID(rs.getInt("RoleID"));

                StaffModel staff = new StaffModel();
                staff.setID(rs.getInt("StaffID"));
                staff.setName(rs.getString("Name"));
                staff.setSex(rs.getInt("Sex"));
                staff.setPhoneNumber(rs.getString("UN_PhoneNumber"));
                staff.setCitizenNumber(rs.getString("UN_CitizenNumber"));
                staff.setAddress(rs.getString("Address"));
                staff.setRole(roleModel);

                list.add(staff);
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
    public boolean insert(StaffModel staff) {
        boolean isOk = false;
        try {
            Connection con = DBConnection.getConnection();
            String sql = "INSERT INTO staff(Name, Sex, UN_PhoneNumber, UN_CitizenNumber, Address, RoleID) "
                    + "VALUES (?,?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, staff.getName());
            ps.setInt(2, staff.getSex());
            ps.setString(3, staff.getPhoneNumber());
            ps.setString(4, staff.getCitizenNumber());
            ps.setString(5, staff.getAddress());
            ps.setInt(6, staff.getRole().getRoleID());

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
            String sql = "DELETE FROM Staff WHERE StaffID = ?";
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
    public boolean update(StaffModel staff) {
        boolean isUpdated = false;
        try {
            Connection con = DBConnection.getConnection();
            String sql = "UPDATE STAFF SET Name = ?, Sex = ?, UN_PhoneNumber = ?, UN_CitizenNumber = ?, Address = ?, RoleID = ? WHERE StaffID = ?";
            PreparedStatement ps = con.prepareStatement(sql);

            if (!staff.getName().isEmpty() && !staff.getPhoneNumber().isEmpty() && (staff.getSex() == 0 || staff.getSex() == 1) && !staff.getCitizenNumber().isEmpty() && !staff.getAddress().isEmpty() && !staff.getRole().getRoleName().isEmpty()) {
                ps.setString(1, staff.getName());
                ps.setInt(2, staff.getSex());
                ps.setString(3, staff.getPhoneNumber());
                ps.setString(4, staff.getCitizenNumber());
                ps.setString(5, staff.getAddress());
                ps.setInt(6, staff.getRole().getRoleID());
                ps.setInt(7, staff.getID());
                int rs = ps.executeUpdate();
                if (rs > 0) {
                    isUpdated = true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isUpdated;
    }

}
