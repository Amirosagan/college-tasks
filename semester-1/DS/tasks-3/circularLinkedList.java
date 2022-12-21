public class circularLinkedList {
  private class Node {
    int val;
    Node next;

    Node() {
      val = 0;
      next = null;
    }

    Node(int value) {
      this.val = value;
      next = null;
    }
  }

  Node head;
  Node tail;

  circularLinkedList() {
    head = tail = null;
  }

  public void insertFirst(int value) {
    if (head == null && tail == null) {
      tail = head = new Node(value);
      head.next = head;
    } else {
      tail.next = new Node(value);
      tail.next.next = head;
      head = tail.next;
    }
  }

  public void deleteFirst() {
    if (head == tail)
      head = tail = null;
    else {
      head = head.next;
      tail.next.next = null;
      tail.next = head;
    }
  }

  public void insertLast(int value) {

    if (head == null && tail == null)
      head = tail = new Node(value);
    else {
      tail.next = new Node(value);
      tail = tail.next;
      tail.next = head;
    }

  }

  public void deleteLast() {
    if (head == tail)
      head = tail = null;
    else {
      Node curr = new Node();
      curr = head;

      while (curr.next != tail)
        curr = curr.next;

      tail = curr;
      tail.next = head;
    }

  }

  public void show() {
    Node curr = head;
    while (curr != tail) {
      System.out.println(curr.val);
      curr = curr.next;
    }
    System.out.println(curr.val);

  }

  public static void main(String[] args) {
    circularLinkedList test = new circularLinkedList();
    test.insertLast(5);
    test.insertLast(10);
    test.insertLast(11);
    test.insertLast(5);
    test.insertFirst(18);
    test.insertFirst(77);
    test.deleteFirst();
    test.deleteFirst();
    test.insertLast(13);
    test.deleteLast();

    test.show();
  }

}
