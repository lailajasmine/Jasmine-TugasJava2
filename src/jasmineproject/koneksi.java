/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jasmineproject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Statement;
/**
 *
 * @author user
 */
public class koneksi {
     public Connection bukakoneksi (){
        Connection con=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con= (Connection)DriverManager.getConnection("jdbc:mysql://localhost:8080/jasmine","root","");
            System.out.println("koneksi berhasil");
            return con;
        }
        catch (Exception e){
            System.out.println("koneksi gagal");
            return null;
            
        }
    }
}
