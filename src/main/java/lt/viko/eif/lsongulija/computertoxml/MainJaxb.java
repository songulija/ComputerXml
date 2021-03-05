/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.lsongulija.computertoxml;
import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;


/**
 *
 * @author PC
 */
//PAGRINDINE KLASE KURI YRA VYKDOMOJI
public class MainJaxb {
   public static void main(String[] args) throws JAXBException, IOException{//JAXBException jeigu bus metamas exception tada programa nustos veikt
       //bet tikimybe tokiam mazam proekte maza. IOException kad skaitant failaa gali kilti toks exception
       //STEP 1 - Create JAXB context
       //have JAXB instance. and we parse class that we'l use for XML parsing
       JAXBContext jaxbContext = JAXBContext.newInstance(Computers.class);
       
       //STEP 2 - Create Unmarshaller. Atliksim unmarshallinga. Turima xml faila, bandysim nuskaityt, ir convertuoti
       //i egzistuojanti objecta
       Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
       
       //STEP 3. Nuskaityti faila student.xml . Skaitom visa xml faila kaip viena eilute
       Path fileName = Path.of("kompiuteriai.xml");
       String actual = Files.readString(fileName);
       System.out.println(actual);//ir atspausdinam failo turini
       
       //STEP 4. Sukurti objektu medi. Reader skaitys gabaliukais(chunks paduos Unmarshalleriui ir jis padarys savo darba
       StringReader reader = new StringReader(actual);
       Computers student = (Computers)unmarshaller.unmarshal(reader);
       //unmarshaller paims is reader xml faila atliks unmarshallinga ir Sukurs objekta Student
       
       System.out.println(student);
       
       //dabar galetume atlikti kitus veiksmus
       //student.setFirstName("New First Name");//duodam nauja FirstName
       //System.out.println(student);
       
       //toliau galetume padaryti marshalleri kuris is sito Student objekto sukur XML 
       
       
       
       
   } 
}
