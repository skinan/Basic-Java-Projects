package interfaces;

public class DynamicQueue implements IntQueue {
    private Node head;

    @Override
    public void push(int value) {

        Node n = new Node(value);
        if(head == null)
        {
            head = n;
        }
        else
        {
            n.next = head;
            head = n;
        }
    }

    @Override
    public int pop()
    {
         if(head == null)
         {
             System.out.println("Queue is empty");
             return -1;
         }


         Node p = head;
         Node temp = p;
         while (p.next != null)
         {
             temp = p;
             p = p.next;
         }
         temp.next = null;
         return p.data;

    }

    public void printQueue()
    {
        System.out.print("Queue");
        Node p = head;
        while(p != null)
        {
            System.out.print(" >> " + p.data);
            p = p.next;
        }

        System.out.println();
    }
}
