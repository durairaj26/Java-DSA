class DoublyLinkedListNode {
    int data;
    DoublyLinkedListNode prev;
    DoublyLinkedListNode next;

    public DoublyLinkedListNode(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    DoublyLinkedListNode head;
    DoublyLinkedListNode tail;

    // Constructor to initialize an empty doubly linked list
    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // Method to insert a node at the end of the list
    public void append(int data) {
        DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
        if (tail == null) {
            // If the list is empty, both head and tail point to the new node
            head = newNode;
            tail = newNode;
        } else {
            // Update the next pointer of the current tail node
            tail.next = newNode;
            // Update the previous pointer of the new node
            newNode.prev = tail;
            // Move the tail pointer to the new node
            tail = newNode;
        }
    }

    // Method to display the elements of the doubly linked list
    public void display() {
        DoublyLinkedListNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Method to delete a node from the doubly linked list
    public void delete(int data) {
        DoublyLinkedListNode current = head;
        while (current != null) {
            if (current.data == data) {
                if (current.prev != null) {
                    current.prev.next = current.next; // Update next pointer of previous node
                } else {
                    head = current.next; // Update head if deleting the first node
                }
                if (current.next != null) {
                    current.next.prev = current.prev; // Update previous pointer of next node
                } else {
                    tail = current.prev; // Update tail if deleting the last node
                }
                return; // Node found and deleted
            }
            current = current.next;
        }
        System.out.println("Element " + data + " not found in the list.");
    }
}

public class DoublyLinkedListExample {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        
        // Inserting elements into the doubly linked list
        dll.append(1);
        dll.append(2);
        dll.append(3);
        dll.append(4);
        
        // Displaying the doubly linked list
        System.out.print("Doubly Linked List: ");
        dll.display();
        
        // Deleting an element from the doubly linked list
        dll.delete(2);
        
        // Displaying the modified doubly linked list
        System.out.print("Modified Doubly Linked List: ");
        dll.display();
    }
}
