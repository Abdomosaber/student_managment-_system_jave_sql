
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */

public class Course 
{
   public void insertUpdateDeleteCourse(char operation,Integer id,String label,Integer hours)
   
   {
       Connection con = MyConnection.getConnection();
       PreparedStatement ps;
       // i for insert
       if(operation == 'i')
       {
           try 
           {
               ps  = con.prepareStatement("INSERT INTO Courses([Coursename],[Hours])"
                       + "VALUES(?,?)");
               ps.setString(1,label);
               ps.setInt(2, hours);
     
               if(ps.executeUpdate() > 0)
               {
                   JOptionPane.showMessageDialog(null,"New Course Added");
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
               ps  = con.prepareStatement("UPDATE Courses SET Coursename = ?, Hours = ? WHERE ID  = ?");
               ps.setString(1,label);
               ps.setInt(2,hours);
               ps.setInt(3,id);

               
               if(ps.executeUpdate() > 0)
               {
                   JOptionPane.showMessageDialog(null,"Course data updated");
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
                    if(yesOrNo == JOptionPane.OK_OPTION)
                    {              
                try
                    
                {
                    ps = con.prepareStatement("DELETE FROM Courses WHERE ID = ?");
                    ps.setInt(1,id);
                    if(ps.executeUpdate() > 0)
                    {
                      JOptionPane.showMessageDialog(null, "Course Deleted");
                    } 
                }
                catch(Exception ex)
                {
                    ex.printStackTrace();
                   
                }
           
            }
         }
       }
    public boolean courseExist(String courseName)
    {
        boolean exists = false;
        try {
           Connection con = MyConnection.getConnection();
           PreparedStatement ps;
           ps = con.prepareStatement("SELECT * FROM Courses WHERE Coursename=?");
           ps.setString(1, courseName);
           ResultSet rs = ps.executeQuery();
           if(rs.next())
           {
             exists = true;
           }
    
       } 
       catch (SQLException ex) 
       {
           Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
       }
       return exists;
    }
   public void fillCourseJTable(JTable table)
   {
       DefaultTableModel model;
      try
      {     
       Connection con = MyConnection.getConnection();
       PreparedStatement ps;
       ps = con.prepareStatement("SELECT * FROM Courses");
       ResultSet rs = ps.executeQuery();
       model = (DefaultTableModel)table.getModel();
       Object row [];
       while(rs.next())
       {
           row = new Object[3];
           row[0] = rs.getInt(1);
           row[1] = rs.getString(2);
           row[2] = rs.getString(3);
           model.addRow(row);
       }
      }
      catch(SQLException ex)
           {
               ex.printStackTrace();
            }
        }
     public int getCourseId(String courseLabel)
     {
         int courseId = 0;
         Connection con = MyConnection.getConnection();
         PreparedStatement ps;
         try
         {
             ps = con.prepareStatement("SELECT * FROM Courses WHERE Coursename = ?");
             ps.setString(1,courseLabel);
             ResultSet rs = ps.executeQuery();
             if(rs.next())
             {
                 courseId = rs.getInt("ID");
             }
         }
         catch(Exception ex)
         {
             ex.printStackTrace();
         }
         return courseId;
     }
   public void fillComboBox(JComboBox combo)
   {
       Connection con = MyConnection.getConnection();
       PreparedStatement ps;
      try
      {     
       ps = con.prepareStatement("SELECT * FROM Courses");
       ResultSet rs = ps.executeQuery();
        while(rs.next())
       {
          combo.addItem(rs.getString(2));
       }
      }
      catch(SQLException ex)
           {
               ex.printStackTrace();
            }
        }
    
}
