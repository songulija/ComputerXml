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
public class Models {
    //models have many model object inside
    private List<Model> model;

    public List<Model> getModel() {
        return model;
    }

    public void setModel(List<Model> model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Models{" + "model=" + model + '}';
    }
    
}
