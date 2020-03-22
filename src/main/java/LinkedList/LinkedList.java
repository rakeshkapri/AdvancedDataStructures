package LinkedList;

public class LinkedList {
    private Node head;

    public void addElement(int item){
        if(head == null){
            head = new Node(item, null);
            return;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = new Node(item, null);
    }

    public void print(){
        Node current = head;
        while(current!=null){
            System.out.println("Item: " + current.item);
            current = current.next;
        }
    }

   public void reverse(){
        reverse(head, null);
   }
   private void reverse(Node current, Node previous){
        if(current!=null){
            Node next = current.next;
            current.next = previous;
            reverse(next, current);
        }
        else{
            head = previous;
        }
    }


    public static void main(String s[]){
        LinkedList list = new LinkedList();
        list.addElement(1);
        list.addElement(2);
        list.addElement(3);
        list.addElement(4);
        list.addElement(5);

        list.print();

        list.reverse();

        list.print();
    }
}
