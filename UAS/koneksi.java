import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.sql.*; 
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * rite a description of class koneksi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 * koneksi gak jadi dipakai
 */



public class koneksi extends World
{

    /**
     * Constructor for objects of class koneksi.
     * 
     */
    public koneksi()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }
    
    private static Connection koneksi;
    public static Connection getkoneksi(){
        if(koneksi==null){
            try{
                String url = new String();
                String user = new String();
                String password = new String();
                url = "jdbc:mysql://localhost:3306/greenfoot";//greenfoot nama db
                user = "root";
                password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = (Connection) DriverManager.getConnection(url, user, password);
            }catch(SQLException t){
                System.out.println("Koneksi Error!");
            }
        }
        return koneksi;
    }//end public static Connection getkoneksi()
    
    
}// end public class koneksi extends world
