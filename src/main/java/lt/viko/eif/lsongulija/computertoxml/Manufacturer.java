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
public class Manufacturer {
    private String brand;
    private Models models;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Models getModels() {
        return models;
    }

    public void setModels(Models models) {
        this.models = models;
    }

    @Override
    public String toString() {
        return "Manufacturer{" + "brand=" + brand + ", models=" + models + '}';
    }
    
}
