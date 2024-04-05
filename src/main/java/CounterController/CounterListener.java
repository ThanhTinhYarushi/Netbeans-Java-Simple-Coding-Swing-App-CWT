/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CounterController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.CounterView;

/**
 *
 * @author thanh
 */
public class CounterListener implements ActionListener{
    private CounterView counterView;

    public CounterListener(CounterView counterView) {
        this.counterView = counterView;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Ban da nhan nut");
        
        String str = e.getActionCommand();
        System.out.println("Ban da nhan nut: " + str);
        
        if (str.equals("Up")) {
            this.counterView.increment();
        } else if (str.equals("Down")) {
            this.counterView.decrement();
        } else {
            this.counterView.reset();
        }
    }
    
}
