package graph;

public class DoubleLabel  implements Label {
    double label;

    public DoubleLabel(double label) {
        super();
        this.label = label;
    }

    @Override
    public Object getLabel() {
        return label;
    }

    @Override
    public void setLabel(Object label) {
        this.label = (Double) label;
    }
        
    @Override
    public String toString(){
        return Double.toString(label) ;
    }
}
