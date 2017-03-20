package graph;

import java.util.Stack;

public class StackCourse<E> implements ICourse{

    private final Stack<E> stack;
    
    public StackCourse()
    {
        stack = new Stack<>();
    }
    
    
    @Override
    public boolean add(Object e) {
        stack.push((E) e);
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
