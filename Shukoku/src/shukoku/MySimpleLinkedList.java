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
public class MySimpleLinkedList <T>{
    Node <T> first;
    int len;
    public MySimpleLinkedList(){
        emptyList();
    }
    private void emptyList(){
        first = null;
        len   = 0;
    }
    public boolean isEmpty(){
        return first == null;
    }
    public void addFirst(T t){
        Node <T> n = new Node<>(t);
        if(!isEmpty()){
            n.setNext(first);
        }
        first = n;
    }
    public boolean inList(T t){
        if(!isEmpty()){
            Node aux = first;
            Node aux1;
            while (!isEmpty()){
                if (aux.data.equals(t)){
                return true;
                }
                aux1 = aux.getNext();
                aux = aux1;
            }
        }
        return false;
    }
    
    public T del(T t){
        if(!isEmpty()){
            Node aux = first;
            Node aux1;
            if(aux.getData().equals(t)){
                first = aux.getNext();
            }
            while (aux.getNext()!= null){
                if (aux.getNext().getData().equals(t)){
                    aux1 = aux.getNext();
                    aux.setNext(aux1.getNext());
                    return t;
                }
                aux1 = aux.getNext();
                aux = aux1;
            }
        }
        return null;
    }
    public static class Node <T>{
        private T data;
        private Node <T> next;
        
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
    }
}
