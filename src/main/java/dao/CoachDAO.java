/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package dao;
import model.Coach;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.UUID;
//import model.User;

import dao.BaseDAO;
import static dao.BaseDAO.closeCon;
import static dao.BaseDAO.getCon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.UUID;

/**
 *
 * @author Dewi
 */

/*
public class CoachDAO extends BaseDAO {

    private static PreparedStatement st;
    private static Connection con;
    
    public static void insertEntry(Coach c) {
        
        try {
            
            String query = "insert into stories (cid, us,pw,nama,gender,usia,pengalaman) "
                    + " values ('%s', '%s', '%s','%s','%s','%s','%s') ";
            query = String.format(query, 
                    c.getCid(),
                    c.getUs(),
                    c.getPw(),
                    c.getNama(),
                    c.getGender(),
                    c.getUsia(),
                    c.getPengalaman()
                    );
            con = getCon();
            st = con.prepareStatement(query);
            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeCon(con);
        }
    }

    public static void updateEntry(Coach c, Coach old) {
        try {
            con = getCon();
            String query = " update stories set sdate = '%s', descrip = '%s' "
                    + "where uid like '%s' and sdate = '%s' and descrip like '%s' ";
            query = String.format(query, 
                    s.getSdate(),
                    s.getDescrip(),
                    old.getOwner().getUid(),
                    old.getSdate(),
                    old.getDescrip());
            st = con.prepareStatement(query);
            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeCon(con);
        }
    }

    public static LinkedList<Story> getAll(User u) {
        LinkedList<Story> res = new LinkedList<>();
        try {
            con = getCon();
            String query = "select * from stories "
                    + "where uid = '%s'";

            query = String.format(query, u.getUid().toString());
            st = con.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Story s = new Story(UUID.fromString(rs.getString("sid")),
                            rs.getDate("sdate"),
                            rs.getString("descrip"),
                            u);
                res.add(s);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeCon(con);
        }
        return res;
    }


    public static void removeEntry(Story s) {
        try {
            con = getCon(); 
            String query = "delete from stories"
                    + " where uid like '%s' and descrip like '%s' ";
            query = String.format(query, s.getOwner().getUid(),
                    s.getDescrip());
            st = con.prepareStatement(query);
            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeCon(con);
        }
    }

    public static LocalDate getDate(UUID uid, String desc) {
        LocalDate res = null;
        try {
            con = getCon(); 
            String query = "select sdate from stories "
                + " where uid like '%s' and descrip like '%s' ";
            query = String.format(query, 
                    uid,
                    desc);
            st = con.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                res = rs.getDate("sdate").toLocalDate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeCon(con);
        }
        return res;
    }

}
*/