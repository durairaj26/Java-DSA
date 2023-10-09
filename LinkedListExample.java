class Node{
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
    
}
public class LinkedListExample{
public static void main(String [] args){
Node head = new Node(1);
Node second = new Node(2);
Node third = new Node(3);

head.next = second;
second.next = third;

Node current = head;

while(current != null){
    System.out.print(current.data+" ");
    current = current.next;

}
}
}
