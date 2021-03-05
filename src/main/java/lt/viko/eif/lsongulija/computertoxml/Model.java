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
public class Model {
    private String name;
    private Specifications specifications;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Specifications getSpecifications() {
        return specifications;
    }

    public void setSpecifications(Specifications specifications) {
        this.specifications = specifications;
    }

    @Override
    public String toString() {
        return "Model{" + "name=" + name + ", specifications=" + specifications + '}';
    }
    
    
}
