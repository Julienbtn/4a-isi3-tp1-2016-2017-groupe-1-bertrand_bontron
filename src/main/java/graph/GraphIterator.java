/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Stack;


public abstract class GraphIterator implements Iterator<Node>{
    
    private Set<Node> visited;
    private List<Node> toVisite;
    
    
    public void GraphIterator(IGraph graph, Node node)
    {
        this.visited = new HashSet<Node>();
        this.toVisite = new ArrayList<Node>();
    }
    
    
    
    public Node next()
    {

        return null;

    }
    
    
    
}
