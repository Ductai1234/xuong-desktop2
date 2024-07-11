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

/**
 *
 * @author lcinu
 */
public class Repo_SanPham {
    
    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;
    
    public Repo_SanPham() {
        try {
            conn = DBContext.getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public ArrayList<Model_SanPham> getAllSanPham() {
        
        ArrayList<Model_SanPham> list = new ArrayList<>();
        
        try {
            
            ps = conn.prepareStatement("SELECT maSanPham, tenSanPham, loaiSanPham, donGia, moTa, ghiChu, trangThai FROM SanPham");
            rs = ps.executeQuery();
            
            while (rs.next()) {                
                list.add(new Model_SanPham(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getInt(7)));
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        
        return list;
    }
    
    public int themSanPham(Model_SanPham m) {
        
        try {
            ps = conn.prepareStatement("INSERT INTO SanPham (maSanPham, tenSanPham, loaiSanPham, donGia, moTa, ghiChu, trangThai, ngayTao) VALUES (?, ?, ?, ?, ?, ?, ?" + ", GETDATE())");
            
            ps.setString(1, m.getMaSanPham());
            ps.setString(2, m.getTenSanPham());
            ps.setString(3, m.getLoaiSanPham());
            ps.setInt(4, m.getDonGia());
            ps.setString(5, m.getMoTa());
            ps.setString(6, m.getGhiChu());
            ps.setInt(7, m.getTrangThai());
            
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}