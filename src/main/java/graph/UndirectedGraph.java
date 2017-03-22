package graph;

import java.util.Iterator;
import java.util.List;
import java.util.Set;


public class UndirectedGraph implements IUndirectedGraph {
    
    private Graph graph;
    
    
    public UndirectedGraph()
    {
        this.graph = new Graph();
    }
    

    @Override
    public void addEdge(Node _node1, Node _node2) {
        graph.addArc(new Arc(_node1, _node2, null));
        graph.addArc(new Arc(_node2, _node1, null));
    }

    @Override
    public boolean hasEdge(Node _node1, Node _node2) {
        return graph.hasArc(_node1, _node2);
    }

    @Override
    public void addNode(Node node) {
        graph.addNode(node);
    }

    @Override
    public Set<Node> getAllNodes() {
        return graph.getAllNodes();
    }

    @Override
    public int getNbNodes() {
        return graph.getNbNodes();
    }

    @Override
    public List<Node> getAdjNodes(Node node) {
        return graph.getAdjNodes(node);
    }

    @Override
    public Iterator<Node> creerBFSIterator(Node node) {
        return graph.creerBFSIterator(node);
    }

    @Override
    public Iterator<Node> creerDFSIterator(Node node) {
        return graph.creerDFSIterator(node);
    }
    
}
