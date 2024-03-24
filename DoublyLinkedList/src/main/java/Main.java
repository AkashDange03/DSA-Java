
class Node {
  int data;
  Node next;
  Node back;

  public Node(int data) {
    this.data = data;
    this.next = null;
    this.back = null;
  }

  public Node(int data, Node next, Node back) {
    this.data = data;
    this.next = next;
    this.back = back;
  }
}

public class Main {

  public static Node ArrToDLL(Node head, int[] arr) {
    Node prev = head;
    for (int i = 1; i < arr.length; i++) {
      Node temp = new Node(arr[i]);
      temp.back = prev;
      prev.next = temp;
      prev = temp;
    }
    return head;
  }

  public static void displayDLL(Node head) {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
  }

  public static Node deleteHead(Node head) {
    if (head == null || head.next == null) {
      return null;
    }
    Node prev = head;
    head = head.next;
    head.back = null;
    prev.next = null;
    return head;
  }

  public static Node deleteTail(Node head) {
    if (head == null || head.next == null) {
      return null;
    }
    Node tail = head;
    while (tail.next != null) {
      tail = tail.next;
    }
    Node prev = tail.back;
    prev.next = null;
    tail.back = null;
    // now prev becomes new tail
    return head;
  }

  public static Node deleteKthEle(Node head, int k) {
    if (head == null) {
      return null;
    }
    int count = 0;
    Node kNode = head;
    while (kNode != null) {
      count++;
      if (count == k) {
        break;
      }
      kNode = kNode.next;
    }

    Node prev = kNode.back;
    Node front = kNode.next;

    if (prev == null && front == null) {
      return null;
    } else if (prev == null) {
      return deleteHead(head);
    } else if (front == null) {
      return deleteTail(head);
    }

    prev.next = front;
    front.back = prev;
    kNode.next = null;
    kNode.back = null;
    return head;
  }

  public static Node deleteEle(Node head, int ele) {
    if (head == null) {
      return null;
    }
    Node temp = head;
    while (temp != null) {
      if (temp.data == ele) {
        break;
      }
      temp = temp.next;
    }

    Node prev = temp.back;
    Node front = temp.next;

    if (prev == null && front == null) {
      return null;
    } else if (prev == null) {
      return deleteHead(head);
    } else if (front == null) {
      return deleteTail(head);
    }

    prev.next = front;
    front.back = prev;
    temp.next = null;
    temp.back = null;
    return head;
  }

  public static void deleteNode(Node temp) {
    Node prev = temp.back;
    Node front = temp.next;
    if (front == null) {
      prev.next = null;
      temp.back = null;
    }
    prev.next = front;
    front.back = prev;

    temp.next = temp.back = null;
  }

  // insertion
  public static Node insertBeforeHead(Node head, int val) {
    Node newNode = new Node(val);
    newNode.next = head;
    head.back = newNode;
    return newNode;
  }

  public static Node insertBeforeTail(Node head, int val) {
   if (head.next == null) {
      return insertBeforeHead(head, val);
    }

    Node temp = head;
    while (temp.next != null) {
      temp = temp.next;
    }
    Node prev = temp.back;
    Node newNode = new Node(val,temp,prev);
    prev.next = newNode;
    temp.back = newNode;

    return head;

  }

  public static void main(String[] args) {
    int[] arr = { 12, 3, 4, 5 };
    Node head = new Node(arr[0]);
    head = ArrToDLL(head, arr);
    displayDLL(head);
    // head = deleteHead(head);
    // System.out.println(" ");
    // displayDLL(head);

    // head = deleteTail(head);
    // System.out.println(" ");
    // displayDLL(head);

    // head = deleteKthEle(head,2);
    // System.out.println(" ");
    // displayDLL(head);

    // head = deleteEle(head,12);
    // System.out.println(" ");
    // displayDLL(head);

    // deleteNode(head.next.next);
    // System.out.println(" ");
    // displayDLL(head);

    // head=insertBeforeHead(head,100);
    // System.out.println(" ");
    // displayDLL(head);

    head = insertBeforeTail(head, 100);
    System.out.println(" ");
    displayDLL(head);
  }

}