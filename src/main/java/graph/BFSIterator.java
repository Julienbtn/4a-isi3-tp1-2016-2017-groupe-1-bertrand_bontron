package graph;


public class BFSIterator extends GraphIterator {

    public BFSIterator(IGraph graph, Node source)
    {
        super(graph, source);
        toVisite = new QueueCourse<>();
        toVisite.add(source);
    }
    
    
}
