public class SinglyLinkedList {
    Node head; // 1 -> 2 -> 3

    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        // Tìm node cuoi cung
        Node temp = head;
        while(temp.next != null ){
            temp = temp.next;
        }
        // temp chinh thuc la node cuoi cung hien tai
        temp.next = newNode;
        // Lay node cuoi cung hien tai noi voi newnode

    }
    // In ra link list
    public void printListNode(){
        if(head == null){
            System.out.println("No list");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " , ");
            temp = temp.next;
        }
        System.out.println("null");

    }

    // getNodeByIndex() => In ra 1 giá trị của Node đó tại ví trí index
    public int getNodeByIndex(int index){
        Node curr = head;
        int count = 0;
        while (curr != null){
            if(count == index){
                return curr.data;
            }
            count++;
            curr = curr.next;
        }
        throw new IndexOutOfBoundsException("No result");
    }
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.addLast(1);
        singlyLinkedList.addLast(2);
        singlyLinkedList.addLast(3);
        singlyLinkedList.addFirst(0);


        //In danh sach
        System.out.println("Danh sach hien tai: ");
        singlyLinkedList.printListNode();

        //Index tai vi tri 1
        System.out.println("Vi tri thu 1: "+ singlyLinkedList.getNodeByIndex(1));




    }

}
