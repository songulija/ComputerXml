/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.lsongulija.computertoxml;

/**
 *
 * @author PC
 */
public class Grade {
   //in xml student has multiple grade objects
    //private int value,int maxValue turi atitikt xml pavadinimus value,maxValue
    private int value;
    private int maxValue;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }

    @Override
    public String toString() {
        return "Grade{" + "value=" + value + ", maxValue=" + maxValue + '}';
    }
    //overiding toString method of object. to print in another way 
    
    
}
