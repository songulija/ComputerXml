/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.lsongulija.computertoxml;

import java.util.List;

/**
 *
 * @author PC
 */
public class Manufacturers {
    //manufacturers have many manufacturer objects inside it
    //so we create List of Manufacturer objects
    private List<Manufacturer> manufacturer;

    public List<Manufacturer> getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(List<Manufacturer> manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Manufacturers{" + "manufacturer=" + manufacturer + '}';
    }

}
