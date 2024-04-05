/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import CounterController.CounterListener;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import modal.CounterModal;
/**
 *
 * @author thanh
 */
public class CounterView extends MyWindows{
    private CounterModal counterModal;
    
    private JButton btnUp;
    private JButton btnDown;
    private JLabel jlanel_value;
    private JButton btnReset;
    
    public CounterView(String title, int x, int y, int width, int height) {
        super();
        this.counterModal = new CounterModal();
        this.AddSomethings();
        this.showMyWindows(title, x, y, width, height);
    }

    @Override
    public final void AddSomethings() {
        super.AddSomethings();
        btnUp = new JButton("Up");
        btnDown = new JButton("Down");
        btnReset = new JButton("Reset");
        jlanel_value = new JLabel(this.counterModal.getValue()+"", JLabel.CENTER);
        
        // layout panel
        JPanel jpanel = new JPanel();
        jpanel.setLayout(new BorderLayout());
        jpanel.add(btnUp, BorderLayout.WEST);
        jpanel.add(btnDown, BorderLayout.EAST);
        jpanel.add(jlanel_value, BorderLayout.CENTER);
        jpanel.add(btnReset, BorderLayout.SOUTH);
        
        // layout this
        this.setLayout(new BorderLayout());
        this.add(jpanel, BorderLayout.CENTER);
        
        // ActionListener 
        ActionListener actionListener = new CounterListener(this);
        btnUp.addActionListener(actionListener);
        btnDown.addActionListener(actionListener);
        btnReset.addActionListener(actionListener);
        
    }
    
    public void increment() {
        this.counterModal.incresment();
        this.jlanel_value.setText(this.counterModal.getValue()+"");
    }
    
    public void decrement() {
        this.counterModal.decresment();
        this.jlanel_value.setText(this.counterModal.getValue()+"");
    }
    public void reset() {
        this.counterModal.reset();
        this.jlanel_value.setText(this.counterModal.getValue()+"");
    }
}
