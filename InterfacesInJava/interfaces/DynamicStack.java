package interfaces;

import java.util.ArrayList;

public class DynamicStack implements IntStack {
    public ArrayList<Integer> dynamicStack;
    public DynamicStack()
    {
        this.dynamicStack = new ArrayList<Integer>();

    }

    @Override
    public void push(int value) {
        dynamicStack.add(value);
    }

    @Override
    public int pop() {
        if(dynamicStack.isEmpty())
        {
            System.out.println("Stack Is Empty!");
            return -1;
        }
        else{

            int temp = this.dynamicStack.get(dynamicStack.size() - 1);
            this.dynamicStack.remove(dynamicStack.size() - 1);
            return temp;
        }


    }
}
