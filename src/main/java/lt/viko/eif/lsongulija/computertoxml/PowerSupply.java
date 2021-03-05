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
public class PowerSupply {
    private String producer;
    private int powerWats;
    private String inputVoltage;
    private String operatingTemperature;

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getPowerWats() {
        return powerWats;
    }

    public void setPowerWats(int powerWats) {
        this.powerWats = powerWats;
    }

    public String getInputVoltage() {
        return inputVoltage;
    }

    public void setInputVoltage(String inputVoltage) {
        this.inputVoltage = inputVoltage;
    }

    public String getOperatingTemperature() {
        return operatingTemperature;
    }

    public void setOperatingTemperature(String operatingTemperature) {
        this.operatingTemperature = operatingTemperature;
    }

    @Override
    public String toString() {
        return "PowerSupply{" + "producer=" + producer + ", powerWats=" + powerWats + ", inputVoltage=" + inputVoltage + ", operatingTemperature=" + operatingTemperature + '}';
    }
    
    
}
