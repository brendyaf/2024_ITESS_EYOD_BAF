
package Tema2_EstructuraLineal;

public class DoubleLinkedList<E> {
    private static class node <E> {
        private E element;
        private node <E> prev;
        private node <E> next;

        public node(E element, node<E> prev, node<E> next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
           
        }
        
        
        public E getElement() {
            return element;
        }
        
            public node<E> getPrev() {
            return prev;
        }

        public node<E> getNext() {
            return next;
        }
        
          public void setPrev(node<E> prev) {
            this.prev = prev;
        }
      
        public void setNext(node<E> next) {
            this.next = next;
        }

      
        
        
    }
    
  
        private node <E> header;
        private node <E> trailer;
        private int size;

        public DoubleLinkedList() {
            header = new node <E>(null,null,null);
            trailer = new node <E> (null, header, null);
            header.setNext(trailer);
            
        }
        
        public int size(){
            return size;
        }
        
        public boolean isEmpty(){
        return size == 0 ? true : false ; // usalo para los faciles ya que es más rapido que hacer el if,OPERADOR CONDICIONAL TERNARIO ( ? : ;) 
        }
        
        public E first(){
            if (isEmpty()) return null;
           return header.getNext().getElement();
        }
        
        public E Last(){
           if (isEmpty()) return null;
           return trailer.getPrev().getElement();
           // return trailer.prev.element; Esta forma se puede porque es privada.
       
         }
        
        public void addBetween ( E e, node<E>predecessor,node<E> sucessor){
           
            node <E> newest = new node<E> (e, predecessor, sucessor);
            predecessor.setNext(newest);
            sucessor.setPrev(newest);
            size++; 
        }
        
        public void addFirst( E e){
            addBetween(e,header,header.getNext());
            
        }
        
        public void addLast(E e ){
            addBetween(e, trailer.getPrev(), trailer);
        }
        
        private E remove (node<E> node){
            node<E> predecessor = node.getPrev();
            node<E> sucessor = node.getNext();
            
            predecessor.setNext(sucessor);
            sucessor.setPrev(predecessor);
           
            node.setNext(null);
            node.setPrev(null);
           
           
            size--;
            return node.getElement();
        }
        public E removeFirst(){
            if (isEmpty()) return null;
            return remove(header.getNext());
        }
        
        public E removeLast(){
            if (isEmpty()) return null;
            return remove(trailer.getPrev());
        }
        
    
    
    
}
