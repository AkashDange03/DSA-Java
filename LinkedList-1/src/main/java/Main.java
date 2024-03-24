// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
class Node {
  int data;
  Node next;

  Node(int data) {
    this.data = data;
  }

  Node(int data, Node next) {
    this.data = data;
    this.next = next;
  }
}

public class Main {
  public static Node convertArrToLL(int[] arr) {
    Node head = new Node(arr[0]);
    Node Mover = head;
    for (int i = 1; i < arr.length; i++) {
      Node temp = new Node(arr[i]);
      Mover.next = temp;
      Mover = temp;
    }
    return head;
  }

  public static int lengthOfLL(Node head) {
    int count = 0;
    Node temp = head;
    while (temp != null) {
      count++;
      temp = temp.next;
    }
    return count;
  }

  public static boolean present(Node head, int val) {
    Node temp = head;
    while (temp != null) {
      if (temp.data == val) {
        return true;
      }
      temp = temp.next;
    }
    return false;
  }

  public static Node deleteAtHead(Node head) {
    if (head == null) {
      return head;
    }
    head = head.next;
    return head;
  }

  public static void printList(Node head) {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
  }

  public static Node deleteTail(Node head) {
    if (head == null || head.next == null) {
      return null;
    }
    Node temp = head;
    while (temp.next.next != null) {
      temp = temp.next;
    }
    temp.next = null;

    return head;
  }

  public static Node deleteAtK(Node head, int k) {
    if (head == null || head.next == null) {
      return head;
    }

    if (k == 1) {
      head = head.next;
      return head;
    }

    Node temp = head;
    Node prev = null;
    int count = 0;
    while (temp != null) {
      count++;
      if (count == k) {
        prev.next = prev.next.next;
        return head;
      }
      prev = temp;
      temp = temp.next;
    }

    return head;

  }

  public static Node deleteEle(Node head, int k) {
    if (head == null || head.next == null) {
      return head;
    }

    if (head.data == k) {
      head = head.next;
      return head;
    }

    Node temp = head;
    Node prev = null;
    while (temp != null) {
      if (temp.data == k) {
        prev.next = prev.next.next;
        return head;
      }
      prev = temp;
      temp = temp.next;
    }

    return head;

  }

  // insert at

  public static Node InsertAtHead(Node head,int val){
    Node temp = new Node(val,head);
    return temp;
  }

  public static Node InsertAtTail(Node head,int val){
    if(head==null){
      return new Node(val);
    }
    Node newNode = new Node(val);
    Node temp=head;
    while(temp.next!=null){
      temp=temp.next;
    }
    temp.next=newNode;
    return head;
  }


  public static Node InsertAtK(Node head, int val, int k){
    if(head==null){
      if(k==1){
        return new Node(val);
      }else{
        return head;
      }
    }

    if(k==1){
      Node temp = new Node(val,head);
      return temp;
    }

    int count=0;
    Node temp = head;
    while(temp!=null){
      count++;
      if(count==k-1){
        Node newNode = new Node(val);
        newNode.next=temp.next;
        temp.next=newNode;
        return head;
      }
      temp=temp.next;
    }
    return head;
  }

  public static Node InsertAtVal(Node head,int ele,int val){
    if(head==null){
      return head;
    }

    if(head.data==val){
      Node temp = new Node(ele,head);
      return temp;
    }

    Node temp = head;
    while(temp!=null){
      if(temp.next.data==val){
        Node newNode = new Node(ele);
        newNode.next=temp.next;
        temp.next=newNode;
        return head;
      }
      temp=temp.next;
    }
    return head;
  }
  public static void main(String[] args) {
    int[] arr = { 2, 3, 4, 5 };
    Node head = convertArrToLL(arr);
    // System.out.print(" LinkedList before deleting head ");
    // printList(head);
    // System.out.println(lengthOfLL(head));
    // System.out.println(present(head,6));
    // System.out.println(" ");
    // head = deleteAtHead(head);
    // System.out.print(" LinkedList after deleting head ");
    // printList(head);

    // System.out.print(" LinkedList before deleting tail ");
    // printList(head);
    // System.out.println("" );
    // head = deleteTail(head);
    // System.out.print(" LinkedList after deleting tail ");
    // printList(head);

    // System.out.print(" LinkedList before deleting at k ");
    // printList(head);
    // System.out.println(" " );
    // head = deleteAtK(head,4);
    // System.out.print(" LinkedList after deleting at k ");
    // printList(head);

    // System.out.print(" LinkedList before deleting ele ");
    // printList(head);
    // System.out.println(" ");
    // head = deleteEle(head, 5);
    // System.out.print(" LinkedList after deleting ele ");
    // printList(head);

    // System.out.print(" LinkedList before inserting at head ");
    //  printList(head);
    // System.out.println(" " );
    //  head = InsertAtHead(head, 1); 
    // System.out.print(" LinkedList after inserting at head ");
    // printList(head);

    // System.out.print(" LinkedList before inserting at tail ");
    //  printList(head);
    // System.out.println(" " );
    //  head = InsertAtTail(head,7); 
    // System.out.print(" LinkedList after inserting at tail ");
    // printList(head);

    // System.out.print(" LinkedList before inserting at tail ");
    //  printList(head);
    // System.out.println(" " );
    //  head = InsertAtK(head,100,3); 
    // System.out.print(" LinkedList after inserting at tail ");
    // printList(head);

    System.out.print(" LinkedList before inserting at tail ");
     printList(head);
    System.out.println(" " );
     head = InsertAtVal(head,100,5); 
    System.out.print(" LinkedList after inserting at tail ");
    printList(head);

  }

  // @Test
  // void addition() {
  // assertEquals(2, 1 + 1);
  // }
}