/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import static dao.BaseDAO.closeCon;
import static dao.BaseDAO.getCon;
//import model.Story;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.UUID;
import model.Course;
import model.User;

/**
 *
 * @author AERO
 */

public class CourseDAO {

    private static PreparedStatement st;
    private static Connection con;
    
    public void insertEntry(Course co) {
        
        try {
            
            String query = "insert into courses ( coid, name , kuota , cid, materi, soal ) "
                    + " values ('%s', '%s', '%d','%s', '%s', '%s') ";
            query = String.format(query, 
                    co.getCoid(),
                    co.getNama(),
                    co.getKuota(),
                    co.getPembuat().getUid(),
                    co.getMateri(),
                    co.getSoal());
            con = getCon();
            st = con.prepareStatement(query);
            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeCon(con);
        }
    }

/*    public static void updateEntry(Story s, Story old) {
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
    }*/

}
