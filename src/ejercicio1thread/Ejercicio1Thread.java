/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1thread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nabor
 */
public class Ejercicio1Thread extends Thread{

    public Ejercicio1Thread(String str){
        super(str);
    }
    public void run(){
         for (int i = 0;i<10;i++)
              try {
            System.out.println(i+" "+getName());
        System.out.println("Termina el thread : "+getName());
       
           Ejercicio1Thread.sleep((long) (Math.random()*5000));
        } catch (InterruptedException ex) {
            Logger.getLogger(Ejercicio1Thread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void main(String[] args) {
        new Ejercicio1Thread("Nabor").start();
        new Ejercicio1Thread("Bobi").start();
       
}
}
    

