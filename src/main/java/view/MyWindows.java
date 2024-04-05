/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author thanh
 */
public class MyWindows extends JFrame{

    public MyWindows() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void showMyWindows(String title, int x, int y, int width, int height) {
        this.setVisible(true);
        this.setTitle(title);
        this.setBounds(x, y, width, height);
        this.setLocationRelativeTo(null);
    }
    
    public void AddSomethings() {
        
    }
    
    public void Flowlayout1() {
        FlowLayout layout_Flow = new FlowLayout();
        this.setLayout(layout_Flow);
        
        JButton jbtn1 = new JButton("1");
        JButton jbtn2 = new JButton("2");
        JButton jbtn3 = new JButton("3");
        
        this.add(jbtn1);
        this.add(jbtn2);
        this.add(jbtn3);
    }
    
    public void Flowlayout2() {
        FlowLayout layout_Flow = new FlowLayout(FlowLayout.LEFT);
        this.setLayout(layout_Flow);
        
        JButton jbtn1 = new JButton("1");
        JButton jbtn2 = new JButton("2");
        JButton jbtn3 = new JButton("3");
        
        this.add(jbtn1);
        this.add(jbtn2);
        this.add(jbtn3);
    }
    
    public void Flowlayout3() {
        FlowLayout layout_Flow = new FlowLayout(FlowLayout.CENTER , 20, 20);
        this.setLayout(layout_Flow);
        
        JButton jbtn1 = new JButton("1");
        JButton jbtn2 = new JButton("2");
        JButton jbtn3 = new JButton("3");
        
        this.add(jbtn1);
        this.add(jbtn2);
        this.add(jbtn3);
    }
    
    public void GridLayout() {
        GridLayout grid = new GridLayout();
        this.setLayout(grid);
        JButton jbtn1 = new JButton("1");
        JButton jbtn2 = new JButton("2");
        JButton jbtn3 = new JButton("3");
        
        this.add(jbtn1);
        this.add(jbtn2);
        this.add(jbtn3);
    }
    
    public void GridLayout2() {
        GridLayout grid = new GridLayout(4, 4);
        this.setLayout(grid);
        
        for (int i = 1; i <= 12; i++) {
            JButton jbtn = new JButton(i+"");
            this.add(jbtn);
        }
    }
    
    public void GridLayout3() {
        GridLayout grid = new GridLayout(4, 4, 25, 25);
        this.setLayout(grid);
        
        for (int i = 1; i <= 16; i++) {
            JButton jbtn = new JButton(i+"");
            this.add(jbtn);
        }
    }

    public void BorderLayout() {
        BorderLayout borderlayout = new BorderLayout();
        this.setLayout(borderlayout);
        
        JButton jbtn1 = new JButton("Top"); this.add(jbtn1, BorderLayout.NORTH);
        JButton jbtn2 = new JButton("Bot"); this.add(jbtn2, BorderLayout.SOUTH);
        JButton jbtn3 = new JButton("Left"); this.add(jbtn3, BorderLayout.WEST);
        JButton jbtn4 = new JButton("Right"); this.add(jbtn4, BorderLayout.EAST);
        JButton jbtn5 = new JButton("Center"); this.add(jbtn5, BorderLayout.CENTER);
    }
    
    public void BorderLayout2() {
        BorderLayout borderlayout = new BorderLayout(15, 15);
        this.setLayout(borderlayout);
        
        JButton jbtn1 = new JButton("Top"); this.add(jbtn1, BorderLayout.NORTH);
        JButton jbtn2 = new JButton("Bot"); this.add(jbtn2, BorderLayout.SOUTH);
        JButton jbtn3 = new JButton("Left"); this.add(jbtn3, BorderLayout.WEST);
        JButton jbtn4 = new JButton("Right"); this.add(jbtn4, BorderLayout.EAST);
        JButton jbtn5 = new JButton("Center"); this.add(jbtn5, BorderLayout.CENTER);
    }
}
