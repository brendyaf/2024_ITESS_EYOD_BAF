//
//package Unidad3.GrafosArboles;
//
//import java.util.NoSuchElementException;
//
//
//
///**
// *
// * @author Brandy
// */
//public class ArrayIterador implements iteradorSample<E> {
//    private int j = 0; // index of the next element to report
//    private boolean removable = false; // can remove be called at this time?
//
//  
//     public boolean hasNext() { 
//        return j < size; 
//        } // size is field of outer instance
//     
//
//     public E next( ) throws NoSuchElementException {
//     if (j == size) throw new NoSuchElementException("No next element");
//     removable = true; // this element can subsequently be removed
//     return data[j++]; // post-increment j, so it is ready for future call to next
//}
//
//    public void remove( ) throws IllegalStateException {
//    if (!removable) throw new IllegalStateException("nothing to remove");
//    ArrayList.this.remove(j-1); // that was the last one returned
//    j--; // next element has shifted one cell to the left
//    removable = false; // do not allow remove again until next is called
//    }
//   } //------------ end of nested ArrayIterator class ------------
//
//
//     public Iterator<E> iterator( ) {
//     return new ArrayIterator( ); // create a new instance of the inner class
//    }
//}
