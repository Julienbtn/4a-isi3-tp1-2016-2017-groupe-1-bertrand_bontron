package graph.iterator;

import java.util.Stack;

public class StackCourse<E> implements ICourse{

    private final Stack<E> stack;
    
    public StackCourse()
    {
        stack = new Stack<>();
    }
    
    
    @Override
    public boolean add(Object node) {
        if (stack.contains((E) node))
            stack.remove((E) node);
        stack.push((E) node);
        return true;
    }

    @Override
    public Object remove() {
        return stack.pop();
    }

    @Override
    public Object element() {
        return stack.peek();
    }

    @Override
    public boolean isEmpty() {
        return stack.empty();
    }
    
}
