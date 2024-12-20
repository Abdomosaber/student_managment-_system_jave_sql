
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Student 
{
   public void insertUpdateDeleteStudent(char operation, Integer Id, String fname,String lname,String sex,String bdate,String phone,
                                         String address)
   
   {
       Connection con = MyConnection.getConnection();
       PreparedStatement ps;
       // i for insert
       if(operation == 'u')
       {
           try 
           {
               ps  = con.prepareStatement("UPDATE Student SET FirstName = ?,LastName = ?,Sex = ?,Birthdate = ?,Phone = ?,Address = ? WHERE id = ?");
               ps.setString(1, fname);
               ps.setString(2, lname);
               ps.setString(3, sex);
               ps.setString(4, bdate);
               ps.setString(5, phone);
               ps.setString(6, address);
               ps.setInt(7,Id);
               
               if(ps.executeUpdate() > 0)
               {
                   JOptionPane.showMessageDialog(null,"Student Data Updated");
               }
           } 
           catch (SQLException ex) 
           {
              ex.printStackTrace();
           }
       }
      if(operation == 'i')
       {
           try 
           {
               ps  = con.prepareStatement("INSERT INTO Student([FirstName],[LastName],[Sex],[Birthdate],[Phone],[Address])\n" +
                       "VALUES (?,?,?,?,?,?);");
               ps.setString(1, fname);
               ps.setString(2, lname);
               ps.setString(3, sex);
               ps.setString(4, bdate);
               ps.setString(5, phone);
               ps.setString(6, address);
               
               if(ps.executeUpdate() > 0)
               {
                   JOptionPane.showMessageDialog(null,"New Student Added");
               }
           } 
           catch (SQLException ex) 
           {
              ex.printStackTrace();
           }
       }
           if(operation == 'd')
       {
           int yesOrNo = JOptionPane.showConfirmDialog(null,"Scores will also be deleted","Delete Student",JOptionPane.OK_CANCEL_OPTION,0);
           if(yesOrNo == 0)
           {
                        try 
           {
               ps  = con.prepareStatement("DELETE FROM Student WHERE id = ?");
               ps.setInt(1,Id);
               
               if(ps.executeUpdate() > 0)
               {
                   JOptionPane.showMessageDialog(null,"Student Deleted");
               }
           } 
           catch (SQLException ex) 
             {
              ex.printStackTrace();
             }
           }
       }
   }
   public void fillStudentJtable(JTable table, String valueToSearch)
   {
       try {
           Connection con = MyConnection.getConnection();
           PreparedStatement ps;
           ps = con.prepareStatement("SELECT * FROM Student WHERE CONCAT([FirstName],[LastName],[Sex],[Birthdate],[Phone],[Address])\n" +
           "LIKE ?");
           ps.setString(1, "%"+valueToSearch+"%");
           
           ResultSet rs = ps.executeQuery();
           DefaultTableModel model = (DefaultTableModel)table.getModel();
           Object row [];
           while(rs.next())
           {
               row = new Object[7];
               row[0] = rs.getInt(1);
               row[1] = rs.getString(2);
               row[2] = rs.getString(3);
               row[3] = rs.getString(4);
               row[4] = rs.getString(5);
               row[5] = rs.getString(6);
               row[6] = rs.getString(7);
               
               model.addRow(row);
           }
       } 
       catch (SQLException ex) 
       {
           Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
   
   }
