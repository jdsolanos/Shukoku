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
public class Casilla {
    MySimpleLinkedList <Integer> posibles;
    int fijo;
    boolean llena;
    
    public Casilla (MySimpleLinkedList <Integer> posibles){
        this.posibles = posibles;
        fijo=0;
        llena= false;
    }
}
