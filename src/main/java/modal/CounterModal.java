/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modal;

/**
 *
 * @author thanh
 */
public class CounterModal {
    private int value;

    public CounterModal() {
        this.value = 0;
    }
    
    public CounterModal(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    
    public void incresment() {
        this.value++;
    }
    
    public void decresment() {
        this.value--;
    }
    public void reset() {
        this.value = 0;
    }
}
