/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.lsongulija.computertoxml;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author PC
 */
//pojo class. you need to anotate/mark ut with XmlRoot element for JAXB to work
//reikia prideti anotacijas. reikia nurodyt kad sitas Computers yra sakninis objektas
@XmlRootElement
public class Computers {
    //jaxb ppagal nutylejima pasiziuri ar pavadinimai sutampa su xml
    //private Manufacturers manufacturers turi taitikti xml pavadinima(manufacturers)
    private Manufacturers manufacturers;

    public Manufacturers getManufacturers() {
        return manufacturers;
    }

    public void setManufacturers(Manufacturers manufacturers) {
        this.manufacturers = manufacturers;
    }

    @Override
    public String toString() {
        return "Computers{" + "manufacturers=" + manufacturers + '}';
    }
    
    
    
}
