package graph.iterator;

import graph.IGraph;
import graph.Node;


public class DFSIterator extends GraphIterator {

    public DFSIterator(IGraph graph, Node source) {
        super(graph, source);
        toVisite = new StackCourse<>();
        toVisite.add(source);
    }
    
}
