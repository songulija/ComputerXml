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
public class Motherboard {
    private String brand;
    private String compatibleCpuBrand;
    private String ramType;
    private int maxRams;
    private int memorySlotsNumer;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCompatibleCpuBrand() {
        return compatibleCpuBrand;
    }

    public void setCompatibleCpuBrand(String compatibleCpuBrand) {
        this.compatibleCpuBrand = compatibleCpuBrand;
    }

    public String getRamType() {
        return ramType;
    }

    public void setRamType(String ramType) {
        this.ramType = ramType;
    }

    public int getMaxRams() {
        return maxRams;
    }

    public void setMaxRams(int maxRams) {
        this.maxRams = maxRams;
    }

    public int getMemorySlotsNumer() {
        return memorySlotsNumer;
    }

    public void setMemorySlotsNumer(int memorySlotsNumer) {
        this.memorySlotsNumer = memorySlotsNumer;
    }

    @Override
    public String toString() {
        return "Motherboard{" + "brand=" + brand + ", compatibleCpuBrand=" + compatibleCpuBrand + ", ramType=" + ramType + ", maxRams=" + maxRams + ", memorySlotsNumer=" + memorySlotsNumer + '}';
    }
    
    
}
