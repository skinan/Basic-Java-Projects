package interfaces;

public class FixedQueue implements IntQueue {
    public int array[];
    public int rear;
    public int size;
    public int front;

    public FixedQueue(int size)
    {
        this.size = size;
        this.array = new int [size];
        this.rear = 0;
        this.front = 0;
    }

    @Override
    public void push(int value) {
        if(rear != size)
        {
         array[rear] = value;
         rear ++;
        }
        else{
            System.out.println("The Queue is full! Overloaded!");
        }
    }

    @Override
    public int pop() {
        if(front < size)
        {
            int temp = array[front];
            front++;
            return temp;

        }
        else
        {
            System.out.println("Queue is empty.");
            return -1;
        }
    }
}
