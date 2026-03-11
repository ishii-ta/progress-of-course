class Node{
    int  data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class SingleLinkedList {

    Node head;
    void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
     void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
     void reverse() {
        Node prev = null;
        Node current = head;
        Node nextNode;

        while (current != null) {
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        head = prev;
    }

    public static void main(String[] args) {

        SingleLinkedList list = new SingleLinkedList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.print("Original List: ");
        list.display();

        list.reverse();

        System.out.print("Reversed List: ");
        list.display();
    }
}

