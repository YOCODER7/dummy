class pratice {

    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int value) {
            data = value;
            next = null;
            prev = null;
        }
    }

    Node head = null;

    void insert(int value) {

        Node newNode = new Node(value);
        newNode.next = head;

        if (head != null) {
            head.prev = newNode;
        }

        head = newNode;
        System.out.println(value + " Inserted ");
    }

    public void delete(int value) {

        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;

       
        if (head.data == value) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            System.out.println(value + " Deleted ");
            return;
        }

       
        while (temp != null && temp.data != value) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Value not found.");
            return;
        }

         
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }

        if (temp.prev != null) {
            temp.prev.next = temp.next;
        }

        System.out.println(value + " Deleted ");
    }

    public void display() {

    if (head == null) {
        System.out.println("null");
        return;
    }

    Node temp = head;

    System.out.print("null <-> ");

    while (temp != null) {
        System.out.print(temp.data + " <-> ");
        temp = temp.next;
    }

    System.out.println("null");
}


    public static void main(String[] args) {

        pratice list = new pratice();


        list.insert(1000);
        list.insert(2000);
        list.insert(300);

        list.display();

        list.delete(1000);
        list.display();
    }
}












    
