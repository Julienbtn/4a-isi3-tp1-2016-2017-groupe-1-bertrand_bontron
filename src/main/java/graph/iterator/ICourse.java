package graph.iterator;

/**
 * @param <E>
 */
public interface ICourse<E> {
    
    /**
     * Ajoute un node dans le parcours
     */
    public boolean add(E node);
    /**
     * retire et retourne le node en t�te
     */
    public E remove();
    /**
     * retourne le node en t�te sans le retirer du parcours
     */
    public E element();
    /**
     * Indique si le parcours est vide
     */
    public boolean isEmpty();
    
}
