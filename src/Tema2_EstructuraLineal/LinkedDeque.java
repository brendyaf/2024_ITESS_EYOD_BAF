
package Tema2_EstructuraLineal;

public class LinkedDeque<E> implements Deque<E> {
    private DoubleLinkedList<E> list = new DoubleLinkedList<>();
     public LinkedDeque( ) { }
     
     public int size( ) { 
        return list.size( ); 
    }
    public boolean isEmpty( ) {
        return list.isEmpty( ); 
    }
    
    public E first( ) { 
        return list.first( ); 
    }
    
    public E last (){
        return list.Last();
    }
    
    public void addFirst(E element){
        list.addFirst(element);
    }
    
    public void addLast(E element){
        list.addLast(element);
    }
    
    public E removeFirst(){
        return list.removeFirst();
    }
    
    public E removeLast(){
        return list.removeLast();
    }
}
