/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author lcinu
 */
public class Renderer extends DefaultTableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component com = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        if (row % 2 == 0) {
            com.setBackground(Color.WHITE);
        } else {
            com.setBackground(Color.LIGHT_GRAY);
        }
        
        if (isSelected) {
                    com.setBackground(new Color(0,204,255));
                    com.setForeground(Color.WHITE);
                } else {
                    com.setForeground(Color.BLACK);
                }
        return com;
    }
    
}
