package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;




public class Graph implements IDirectedGraph {

    /**
     * A chaque cle=noeud est associe la liste des arcs sortants de ce noeud
     */
    private final Map<Node,List<Arc>> adjacence; 

    public Graph(){
        adjacence = new HashMap<>();
    }
    /**
     * 
     * @param _n1
     * @param _n2
     * @return vrai si graph possede arc de src _n1 et destination _n2
     */
    @Override
    public boolean hasArc(Node _n1, Node _n2){
            List<Arc> arretesAdj = adjacence.get(_n1);
        if (arretesAdj.stream()
                .anyMatch((_a) -> (_n1.equals(_a.getSource()) && _n2.equals(_a.getDestination())))) {
            return true;
        }
        return false;
    }

    /**
     * @param _node
     * ajoute le noeud passé en paramètre
     */
    @Override
    public void addNode(Node _node){
            adjacence.put(_node, new ArrayList<>());

    }
    /**
     * @param _edge
     * ajoute un arc dans le graphe
     */
    @Override
    public void addArc(Arc _edge){

            if (!hasArc(_edge.getSource(),_edge.getDestination()))
                    adjacence.get(_edge.getSource()).add(_edge);

    }
    /**
     * @return la collection de tous les noeuds présents dans le graphe 
     */
    @Override
    public Set<Node> getAllNodes(){
            return this.adjacence.keySet();
    }

    /**
     * @return le nombre de noeuds du graphe 
     */
    @Override
    public int getNbNodes(){
            return this.adjacence.size();
    }

    /**
     * @param _n
     * @return tous les arcs de source _n
     */
    @Override
    public List<Arc> getArc(Node _n){
            return adjacence.get(_n);
    }
    /**
     * @param _n
     * @return tous les noeuds qui sont destination d'un arc dont la source est _n
     */
    @Override
    public List<Node> getAdjNodes(Node _n){
            return getArc(_n)
                    .stream()
                    .map(Arc::getDestination)
                    .collect(Collectors.toList());
    }


    /**
     * @return un string contenant tout le graphe  
     */
    @Override
    public String toString() {
        StringBuilder builder  = new StringBuilder("Graph");
        for(Entry entry : adjacence.entrySet()){
            builder.append("\n[")
                    .append(entry.getKey())
                    .append(" : ");
            for(Arc arc: ((List<Arc>)entry.getValue())){
                builder.append('[')
                        .append(arc)
                        .append(']');
            }
            builder.append(']');
        }
        return builder.toString();
    }

    @Override
    public Iterator<Node> creerBFSIterator(Node n) {
        return new BFSIterator(this, n);
    }

    @Override
    public Iterator<Node> creerDFSIterator(Node n) {
        return new DFSIterator(this, n);
    }


	
}