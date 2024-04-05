/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author thanh
 */
public class MyCalucator extends MyWindows{
    public MyCalucator() {
        super();
    }
    
    public void addInterfaceCal() {
        JTextField inputText = new JTextField(50);
        
        JPanel jPanel_Head = new JPanel();
        jPanel_Head.setLayout(new BorderLayout());
        jPanel_Head.add(inputText, BorderLayout.CENTER);
        
        JPanel jPanel_buttons = new JPanel();
        jPanel_buttons.setLayout(new GridLayout(5, 3));
        
//        Add btns to Panel jPanel_buttons
        // Nhập 0 -> 9
        for (int i = 0; i < 10; i++) {
            JButton jbtn = new JButton(i+"");
            jPanel_buttons.add(jbtn);
        }
        JButton jbtn_cong = new JButton("+");
        jPanel_buttons.add(jbtn_cong);
        JButton jbtn_tru = new JButton("-");
        jPanel_buttons.add(jbtn_tru);
        JButton jbtn_nhan = new JButton("*");
        jPanel_buttons.add(jbtn_nhan);
        JButton jbtn_chia = new JButton("/");
        jPanel_buttons.add(jbtn_chia);
        JButton jbtn_bang = new JButton("=");
        jPanel_buttons.add(jbtn_bang);
        
//        Add Layout to this
        this.setLayout(new BorderLayout());
        this.add(jPanel_Head, BorderLayout.NORTH);
        this.add(jPanel_buttons, BorderLayout.CENTER);
    }
}
