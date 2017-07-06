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
        len = len+1;
    }
    private int posInList(T t){
        if(!isEmpty()){
            Node aux = first;
            Node aux1;
            int cont=0;
            while (!isEmpty()){
                if (aux.data.equals(t)){
                return cont;
                }
                aux1 = aux.getNext();
                aux = aux1;
                cont++;
            }
        }
        return -1;
    }
    
    public T del(T t){
        int pos = posInList(t);
        if (pos == -1)
            return null;
        
        return delPos(pos);
                
    }
    
    public T delPos(int pos){
 
        Node<T> aux = first;
        Node<T> prev = null;
        int cont = 0;
 
        if(pos<0 || pos >= len){
            System.out.println("La posicion insertada no es correcta");
        }else{
            while(aux!= null){
                if (pos == cont){
                    if (prev == null){
                        first = first.getNext();
                    }else {
                        //Actualizamos el anterior
                        prev.setNext(aux.getNext());
                    }
                    len--;
                    return aux.getData();
                }else{
                    prev=aux;
                    aux=aux.getNext();
                    cont++;
                }
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
