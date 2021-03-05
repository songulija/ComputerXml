/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.lsongulija.computertoxml;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;


/**
 *
 * @author PC
 */
public class Client {
    public static void main(String args[]) throws IOException{
  //client accepts number from user . pass number to server. server calculates double of number(multiplies by two) and
  //returns back to client and client prints result
        Scanner sc = new Scanner(System.in);
        
        //first create connection. Create Socket.Its just interface that enables client. we will use same port number to connect these two
        Socket s = new Socket("localhost",9000);//and server comunicate, pass information to one another it takes localhost and port number
        //use socket to accept something from server
        Scanner sc1 = new Scanner(s.get);
        
    }
}
