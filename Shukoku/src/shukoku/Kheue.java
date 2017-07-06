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
public class Kheue <T> {
    Node <T> first;
    Node <T> last;
    
    public Kheue(){
        first=null;
        last= null;
    }
    public void add(T t){
        if (first== null){
            first = new Node<>(t);
            last = first;
        }else{
            Node <T> aux= new Node<>(t);
            last.setNext(aux);
            aux.setPrev(last);
            last = aux;
        }
    }
    public T remove(){
        if (first == null){
            return null;
        }else{
            Node <T> aux= first;
            if(first.next==null){
                first=null;
            }else{
                first=first.getNext();
            }
            return aux.getData();
        }
    }
    public static class Node <T>{
        private T data;
        private Node <T> next;
        private Node <T> prev;
        public Node( T d){
            data = d;
        }
        public T getData(){
            return data;
        }
        public void setData( T data){
             this.data=data;
        }
        public Node <T> getNext(){
            return next;
        }
        public void setNext( Node <T> next){
             this.next=next;
        }
        public Node <T> getPrev(){
            return prev;
        }
        public void setPrev( Node <T> next){
             this.prev=prev;
        }
    }
    
}
