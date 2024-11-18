
package Tema2_EstructuraLineal;


public class CircularlyLinkedList <E> {
    private static class node<E>{
        private E element;
        private node<E> next;

        public node(E element, node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public node<E> getNext() {
            return next;
        }

        public void setNext(node<E> next) {
            this.next = next;
        }
                
    }
    

    private node<E> tail;
    private int size;


    public CircularlyLinkedList() {
    }
    
    public int size(){
        return size;
    }
    
    public boolean isEmpty(){
        return size == 0 ;
    }
    
    public E first(){
        if(isEmpty()) return null;        
        return tail.getNext().element;
    }
    
    public E last(){
        if(isEmpty()) return null;
        return tail.element;
    }
    
    public void addFirst(E e){  
        if (size == 0){
            tail = new node<E>(e, null);    
            tail.setNext(tail);
        }else{
            node<E> newest = new node<>(e, tail.getNext()); 
            tail.setNext(newest);            
        }
        size ++;
                    
    }
    
    public void addLast(E e){
        addFirst(e);
        tail = tail.getNext();
           
    }
    
    public E removeFirst(){        
        if (isEmpty()){ 
            return null;
        }
        node<E> head = tail.next;
        if (head == tail){
            tail = null;
        }else 
            tail.setNext(head.getNext());
            size--;
            return head.getElement();                                
    }
    
    public void rotate(){
        if(tail != null)
           tail =  tail.getNext();
        
        
    }
}
