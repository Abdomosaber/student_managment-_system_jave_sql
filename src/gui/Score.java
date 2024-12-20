
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Score 
{
 public void insertUpdateDeleteScore(char operation,Integer sid,Integer cid,Double scr,String description)
   
   {
       Connection con = MyConnection.getConnection();
       PreparedStatement ps;
       // i for insert
       if(operation == 'i')
       {
           try 
           {
               ps  = con.prepareStatement("INSERT INTO Scores([StudentId],[CourseId],[StudentScore],[Description])VALUES(?,?,?,?)");
               ps.setInt(1,sid);
               ps.setInt(2,cid);
               ps.setDouble(3, scr);
               ps.setString(4,description);
     
               if(ps.executeUpdate() > 0)
               {
                   JOptionPane.showMessageDialog(null,"Score Added");
               }
           } 
           catch (SQLException ex) 
           {
              ex.printStackTrace();
           }
       }
      if(operation == 'u')
       {
           try 
           {
               ps  = con.prepareStatement("UPDATE Scores SET StudentScore = ?, Description = ? WHERE StudentId = ? AND CourseId = ?");
               ps.setDouble(1, scr);
               ps.setString(2,description);
               ps.setInt(3,sid);
               ps.setInt(4,cid);
               
               if(ps.executeUpdate() > 0)
               {
                   JOptionPane.showMessageDialog(null,"Score updated");
               }
           } 
           catch (SQLException ex) 
           {
              ex.printStackTrace();
           } 
       }
      if(operation == 'd')
       {
           try 
           {
               ps  = con.prepareStatement("DELETE FROM Scores WHERE StudentId = ? AND CourseId = ?");
               ps.setInt(1,sid);
               ps.setInt(2,cid);
               
               if(ps.executeUpdate() > 0)
               {
                   JOptionPane.showMessageDialog(null,"Score Deleted");
               }
           } 
             catch (SQLException ex) 
           {
              ex.printStackTrace();
           } 
     }
  }
  public void fillScoreJTable(JTable table)
   {
      try
      {     
       Connection con = MyConnection.getConnection();
       PreparedStatement ps;
       ps = con.prepareStatement("SELECT * FROM Scores");
       ResultSet rs = ps.executeQuery();
       DefaultTableModel model = (DefaultTableModel)table.getModel();
       Object row [];
       while(rs.next())
        {
           row = new Object[4];
           row[0] = rs.getInt(1);
           row[1] = rs.getInt(2);
           row[2] = rs.getDouble(3);
           row[3] = rs.getString(4);
           model.addRow(row);
        }
      }
      catch(SQLException ex)
           {
               ex.printStackTrace();
            }
        }
  public void fillShowScoreJTable(JTable table)
   {
      try
      {     
       Connection con = MyConnection.getConnection();
       PreparedStatement ps;
       ps = con.prepareStatement("SELECT s.id,s.FirstName,s.LastName,c.Coursename,sc.StudentScore\n" +
                                   "FROM(Student as s INNER JOIN Scores as sc on s.id = sc.StudentId)\n" +
                                   "INNER JOIN Courses AS c ON c.ID = sc.CourseId;");
       ResultSet rs = ps.executeQuery();
       DefaultTableModel model = (DefaultTableModel)table.getModel();
       Object row [];
       while(rs.next())
        {
           row = new Object[5];
           row[0] = rs.getInt(1);
           row[1] = rs.getString(2);
           row[2] = rs.getString(3);
           row[3] = rs.getString(4);
           row[4] = rs.getDouble(5);
           model.addRow(row);
        }
      }
      catch(SQLException ex)
           {
               ex.printStackTrace();
            }
        }
    
}
