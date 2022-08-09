import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.sql.*;
/**
 * Write a description of class bee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bee extends Actor
{
    /**
     * Act - do whatever the bee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/greenfoot", "root", "");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select move FROM where id = 1");
            
            while (rs.next()) {
                String keyboard = rs.getString("keyboard");
                if (keyboard.equals("a")) { //jika klik key a akan bergerak ke kiri
                    setLocation(getX()-15, getY());
                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {
                        System.out.println("connection error");
                    }
                }
                
                if (keyboard.equals("d")) { //jika klik key a akan bergerak ke kanan
                    setLocation(getX()+15, getY());
                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {
                        System.out.println("connection error");
                    }
                }
                
                if (keyboard.equals("w")) { //jika klik key a akan bergerak ke atas
                    setLocation(getX(), getY()-15);
                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {
                        System.out.println("connection error");
                    }
                }
                
                if (keyboard.equals("s")) { //jika klik key a akan bergerak ke bawh
                    setLocation(getX(), getY()+15);
                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {
                        System.out.println("connection error");
                    }
                }
            }//end while (rs.next())
            conn.close();
            
        } catch (SQLException se) {
            System.out.println("connection error");
        }
        
        
    }//end public void act
    
    
    
}//end public class bee 