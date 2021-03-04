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
public class Subject {
    //private String subjectName ir credits turi atitikt xml pavadinimus
    private String subjectName;//in xml subject object has subjectName(string) and credits(int)
    private int credits;

   
    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    @Override
    public String toString() {
        return "Subject{" + "subjectName=" + subjectName + ", credits=" + credits + '}';
    }
     //overiding toString method of object. to print in another way 
    
    
}
