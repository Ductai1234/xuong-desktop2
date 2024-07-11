/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import View.JInternal_BanHang;
import View.JInternal_HoaDon;
import View.JInternal_Home;
import View.JInternal_KhachHang;
import View.JInternal_KhuyenMai;
import View.JInternal_NhanVien;
import View.JInternal_SanPham;
import View.JInternal_ThongKe;
import javax.swing.JDesktopPane;

/**
 *
 * @author lcinu
 */
public class Repo_Admin {
    
    public void home(JDesktopPane desktopPane) {
        JInternal_Home ketNoi = new JInternal_Home();
        desktopPane.add(ketNoi);
        ketNoi.setVisible(true);
    }
    
    public void banHang(JDesktopPane desktopPane) {
        JInternal_BanHang ketNoi = new JInternal_BanHang();
        desktopPane.add(ketNoi);
        ketNoi.setVisible(true);
    }
    
    public void hoaDon(JDesktopPane desktopPane) {
        JInternal_HoaDon ketNoi = new JInternal_HoaDon();
        desktopPane.add(ketNoi);
        ketNoi.setVisible(true);
    }
    
    public void sanPham(JDesktopPane desktopPane) {
        JInternal_SanPham ketNoi = new JInternal_SanPham();
        desktopPane.add(ketNoi);
        ketNoi.setVisible(true);
    }
    
    public void khuyenMai(JDesktopPane desktopPane) {
        JInternal_KhuyenMai ketNoi = new JInternal_KhuyenMai();
        desktopPane.add(ketNoi);
        ketNoi.setVisible(true);
    }
    
    public void thongKe(JDesktopPane desktopPane) {
        JInternal_ThongKe ketNoi = new JInternal_ThongKe();
        desktopPane.add(ketNoi);
        ketNoi.setVisible(true);
    }
    
    public void khachHang(JDesktopPane desktopPane) {
        JInternal_KhachHang ketNoi = new JInternal_KhachHang();
        desktopPane.add(ketNoi);
        ketNoi.setVisible(true);
    }
    
    public void nhanVien(JDesktopPane desktopPane) {
        JInternal_NhanVien ketNoi = new JInternal_NhanVien();
        desktopPane.add(ketNoi);
        ketNoi.setVisible(true);
    }
    
}
