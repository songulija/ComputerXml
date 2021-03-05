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
public class Ram {
    private int capacity;
    private double memoryVoltage;
    private int tacticalFrequency;

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getMemoryVoltage() {
        return memoryVoltage;
    }

    public void setMemoryVoltage(double memoryVoltage) {
        this.memoryVoltage = memoryVoltage;
    }

    public int getTacticalFrequency() {
        return tacticalFrequency;
    }

    public void setTacticalFrequency(int tacticalFrequency) {
        this.tacticalFrequency = tacticalFrequency;
    }

    @Override
    public String toString() {
        return "Ram{" + "capacity=" + capacity + ", memoryVoltage=" + memoryVoltage + ", tacticalFrequency=" + tacticalFrequency + '}';
    }
    
    
}
