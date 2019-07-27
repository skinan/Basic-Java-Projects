package interfaces;

public class Interfaces {
    public static void main(String[] args)
    {
        // Implementation of a Dynamic Queue is shown below.
        System.out.print("Dynamic Queue Operations: " + "\n");
        DynamicQueue dQ = new DynamicQueue();
        dQ.push(1);
        dQ.push(2);
        dQ.push(3);
        dQ.push(4);
        dQ.push(5);
        dQ.printQueue();
        System.out.println("Popped Element : " + dQ.pop());
        dQ.printQueue();
        System.out.println("Popped Element : " + dQ.pop());
        dQ.printQueue();
        System.out.println("Popped Element : " + dQ.pop());
        dQ.printQueue();
        dQ.push(6);
        System.out.println("After a push: ");
        dQ.printQueue();

        // Implementation of a Fixed Queue.
        System.out.print("\n" + "Fixed Queue Operations: " + "\n");

        FixedQueue fQ = new FixedQueue(5); // A Fixed Queue of Size 5.
        fQ.push(1);
        fQ.push(2);
        fQ.push(3);
        fQ.push(4);
        fQ.push(5);

        System.out.println("Popped Element From Fixed Queue: " + fQ.pop());
        System.out.println("Popped Element From Fixed Queue: " + fQ.pop());
        System.out.println("Popped Element From Fixed Queue: " + fQ.pop());
        System.out.println("Popped Element From Fixed Queue: " + fQ.pop());
        System.out.println("Popped Element From Fixed Queue: " + fQ.pop());
        System.out.println("Popped Element From Fixed Queue: " + fQ.pop());

        // Implementation of Dynamic Stack using Array List.
        System.out.print("\n" + "Dynamic Stack Operations Using Arraylist: " + "\n");

        DynamicStack dynamicStack = new DynamicStack();

        dynamicStack.push(6);
        dynamicStack.push(7);
        dynamicStack.push(8);
        dynamicStack.push(9);

        System.out.println("Popped Element From Stack: " + dynamicStack.pop());
        System.out.println("Popped Element From Stack: " + dynamicStack.pop());
        System.out.println("Popped Element From Stack: " + dynamicStack.pop());
        System.out.println("Popped Element From Stack: " + dynamicStack.pop());
        System.out.println("Popped Element From Stack: " + dynamicStack.pop());


    }
}
