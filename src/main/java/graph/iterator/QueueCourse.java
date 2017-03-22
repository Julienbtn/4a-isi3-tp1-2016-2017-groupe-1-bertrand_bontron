package graph.iterator;

import java.util.concurrent.ConcurrentLinkedQueue;

public class QueueCourse<E> extends ConcurrentLinkedQueue implements ICourse{
    
    @Override
    public boolean add(Object node)
    {
        return this.contains(node) || super.add(node);
    }
    
}
