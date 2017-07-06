/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shukoku;

/**
 *
 * @author lenovo
 */
public class Shukoku {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MySimpleLinkedList <Integer> l = new MySimpleLinkedList<>();
        for (int i=9;i>0;i--){
            l.addFirst(i);
        }
        for(int i=0;i<9;i++){
            System.out.println(l.del(i+1));
        }   
        Kheue <Integer> k = new Kheue<>();
        k.add(3);
        k.add(5);
        k.add(123);
        k.add(765);
        for(int i=0;i<5;i++){
            System.out.println(k.remove());
        }   
    }
    
}
