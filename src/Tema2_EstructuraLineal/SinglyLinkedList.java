/*ITESS-TICS
 AGOSTO-DICIEMBRE 2024
 E Y OD
 FRANCISCO JAVIER MONTECILLO PUENTE
 23/09/2024
*/

package Tema2_EstructuraLineal;

public class SinglyLinkedList <E>{// desde aqui se declara que abra un topo de dato de tipo e generic cualquiera 
    
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
    
   private node<E> head;
   private node<E> tail;
   private int size;

    public SinglyLinkedList() {
    }
   
   public int size (){
       return size;
   }
    public boolean isEmpty(){
        return size ==0;
    }
    public E first (){
        if (isEmpty())
            return null;
        return head.element;
    }
    
    public E last (){
        if (isEmpty())
            return null;
        return tail.element;
    }
    public void addFirst(E e){
       // node <E> newest = new node <E>(e,null);
        head= new node (e,head);
        if(size==0)  
            tail=head;
        size++;
        // newest.next=head;
        // head = newest;
        //if (isEmpty())
         //   tail = head;
         //size = size ++;
        // size = size +1;
        
        
    }
    public void addLast(E e){
        node<E> newest = new node <> (e, null);
        if ( isEmpty())
            head = newest;
        else 
            tail.setNext(newest);
        tail = newest;
        size ++;
    }
    public E removeFirst(){
        if (isEmpty()) return null;
        E answer= head.getElement();
        head = head.next;
        size --;
        if (size == 0)
            tail=null;
        return answer;
    }
    
    
}