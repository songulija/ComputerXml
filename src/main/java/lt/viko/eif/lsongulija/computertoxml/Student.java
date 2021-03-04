/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.lsongulija.computertoxml;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author PC
 */
//pojo class. you need to anotate/mark it with XmlRoot element for JAXB to work
//reikia prideti anotacijas. reikia nurodyt kad sitas Student yra sakninis xml objektas anotacijos taip pat yra klases
@XmlRootElement
public class Student {
    //jaxb pagal nutylejima pasiziuri ar pavadinimai sutampa su xml
    //private String firstName turi atitikt xml pavadinimus
    private String firstName;//kiekvienam sugeneruoti get  
    
    //xml yra atributas kuris vadinas last-name. TURIME panaudoti anotacija XML element. kad nurodyti
    //kad sito elemento pavadinimas xml faile atrodys kitaip. ir tada nurodom name = "" nurodom kita 
    //@XmlElement(name="")
    private String lastName;
    
    private int age;
    private Subject subject;//student turi savyje subject objekta
    
    //in xml student has multiple grade objects
    private List<Grade> grade;//so we create array of Grade objects calling it also grade

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Grade> getGrade() {
        return grade;
    }

    public void setGrade(List<Grade> grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" + "firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", subject=" + subject + ", grade=" + grade + '}';
    }

    

   
    

    
}
