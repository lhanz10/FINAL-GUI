/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.util.Vector;
import javax.naming.spi.DirStateFactory.Result;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class Details extends DBConnection implements DetailsImp {

    private byte id;
    private String name;
    private String peripherals;
    private String pos;
    private String number;
    private String poss;
    private Vector data;

    //Setter and Getter
    public byte getId() {
        return id;
    }

    public void setId(byte id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPeripherals() {
        return peripherals;
    }

    public void setPeripherals(String peripherals) {
        this.peripherals = peripherals;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPoss() {
        return poss;
    }

    public void setPoss(String poss) {
        this.poss = poss;
    }

    public Vector getData() {
        return data;
    }

    public void setData(Vector data) {
        this.data = data;
    }

    public void _insert() {//Start
        //call connection
        super._connection(con);
        String sql = "insert into details(name, peripherals, pos, number, poss)=values(?,?,?,?,?)";

        try {
            PreparedStatement pst = null;
            //pst = con.preparestatement(sql);
            pst.setString(1, name);
            pst.setString(2, peripherals);
            pst.setString(3, pos);
            pst.setString(4, number);
            pst.setString(5, poss);
            pst.executeUpdate();
            pst.close();
            message("Successfully Added");

        } catch (Exception e) {
            message(e.getMessage());
        }
    }//end

    public void _update() {//start
      
    //call connection
        super._connection(con);
        String sql = "update details name=?, peripherals=?, pos=?, number=?, poss=?)=wherre id=?";

        try {
            PreparedStatement pst = null;
            //pst = con.preparestatement(sql);
            pst.setString(1, name);
            pst.setString(2, peripherals);
            pst.setString(3, pos);
            pst.setString(4, number);
            pst.setString(5, poss);
            pst.executeUpdate();
            pst.close();
            message("Successfully Updated");

        } catch (Exception e) {
            message(e.getMessage());
        }
      
    }//end

    public void _delete() {//start
       
    //call connection
        super._connection(con);
        String sql = "delete from details wherre id=?";

        try {
            PreparedStatement pst = null;
            //pst = con.preparestatement(sql);
            pst.setByte(1, id);
            pst.executeUpdate();
            pst.close();
            message("Successfully Deleted");

        } catch (Exception e) {
            message(e.getMessage());
        }
    }
//load function from DetailsImps
    public void _LoadList() {//start
  
    //set new vector values
        this.setData(new Vector ());
        super._connection(con);
        String sql = "select * from Details";
        byte rowCounter = 0;
        try {
            PreparedStatement pst = null;
            Result rs = pst.executeQuery();
            while (next()) {
                rowCounter++;//increment row counter
                
                byte _id = getByte("id");
                String _name = String("name");
                String _peripherals = String("peripherals");
                String _pos = String("pos");;
                String _number = String("number");
                String _poss = String("poss");
                
                Vector row = new Vector();
                row.add(_id);
                row.add(_name);
                row.add(_peripherals);
                row.add(_pos);
                row.add(_number);
                row.add(_poss);
                this.getData().add(row);
                
            }//end while
           // rs.close();
            pst.close();
            
        } catch (Exception e) {
            message(e.getMessage());
        }
    
    }//end
//get specified of the employee
    public void _getDetails(byte id) {//start
    
        super._connection(con);
        String sql = "select * from Details where id" +id;
        
        try {
            PreparedStatement pst = null;
            Result rs = pst.executeQuery();
            if (next()) {
             
                
                byte _id = getByte("id");
                String _name = String("name");
                String _peripherals = String("peripherals");
                String _pos = String("pos");;
                String _number = String("number");
                String _poss = String("poss");
               //set values
                this.setId(_id);
                this.setName(_name);
                this.setPeripherals(_peripherals);
                this.setPos(_pos);
                this.setNumber(_number);
                this.setPoss(_poss);
                
                
                
            }//end while
           // rs.close();
            pst.close();
            
        } catch (Exception e) {
            message(e.getMessage());
        }
    
    }//end

    private boolean next() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private byte getByte(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String String(String name) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void message(String message) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void _search(String key) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
