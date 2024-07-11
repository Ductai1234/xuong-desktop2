/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DBContext.DBContext;
import Model.Model_SanPham;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author lcinu
 */
public class Repo_BanHang {
    
    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;
    
    public Repo_BanHang() {
        try {
            conn = DBContext.getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public JPanel getAllSanPham() {
        JPanel newJPanel = new JPanel();
        
        try {
            ps = conn.prepareStatement("SELECT * FROM SanPham");
            rs = ps.executeQuery();
            
            while (rs.next()) {    
                
                JPanel newPanel = new JPanel();
                newPanel.setBackground(new Color(86,204,255));
                newPanel.setLayout(new BorderLayout());
                newPanel.setPreferredSize(new Dimension(162, 170));
 
                JLabel textLabel = new JLabel(rs.getString(2));
                
                newPanel.add(textLabel, BorderLayout.CENTER);
                newJPanel.setLayout(new GridLayout(0, 4, 10, 10));
                newJPanel.add(newPanel);

                newJPanel.setPreferredSize(new Dimension(newJPanel.getPreferredSize().width, 200 * (newJPanel.getComponentCount() / 4 )+ 190));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return newJPanel;
    }
    
    
}
