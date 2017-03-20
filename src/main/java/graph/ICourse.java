package graph;

/**
 * @param <E>
 */
public interface ICourse<E> {
    
    public boolean add(E e);
    public E remove();
    public E element();
    public boolean isEmpty();
    
}
