/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph.iterator;

import graph.IGraph;
import graph.Node;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public abstract class GraphIterator implements Iterator<Node>{
    
    protected Set<Node> visited;
    protected ICourse<Node> toVisite;
    protected IGraph graph;
    
    
    public GraphIterator(IGraph graph, Node node) {
        this.graph = graph;
        this.visited = new HashSet<>();
    }
    
    @Override
    public boolean hasNext() {
        return !toVisite.isEmpty();
    }
    
    @Override
    public Node next() {
        Node next = toVisite.remove();
        visited.add(next);
        graph
            .getAdjNodes(next)
            .stream()
            .filter((n) -> (!visited.contains(n)))
            .forEach((n) -> {
                toVisite.add(n);
            });
        return next;
    }
    
    
    
}
