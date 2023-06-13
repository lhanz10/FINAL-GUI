/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import com.sun.jdi.connect.spi.Connection;

/**
 *
 * @author hp
 */
public class DBConnection {//start class
    
    Connection con;
    private String _DRIVER_;

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
    //Variables
    private static final String _CONURL = "jdbc:mysql://localhost/InventorySystemMenu";
     private static final String _DRIVER = "com.mysql.jdbc.Driver";
     
     //create connection
     
     public void _connection(Object _CONURL_) {//Starty
         //sync connection
         synchronized (_CONURL_){//start
             try {
             Class.forName(_DRIVER_);//driver
             setCon(DriverManager.getConnection(_CONURL_, "root", "polaris"));
             
         } catch (Exception e) {
             
         } 
             
         }//end
                
     }
    private static class DriverManager {

        private static Connection getConnection(Object _CONURL_, String root, String polaris) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public DriverManager() {
        }
    }
    
    
}
