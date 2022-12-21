public class SingleLinkedList {
  private class Node {

    int val;
    Node next;

    Node() {
      val = 0;
      next = null;
    }

    Node(int val) {
      this.val = val;
      next = null;
    }

  }

  private Node head;
  private Node tail;

  SingleLinkedList() {
    head = null;
    tail = null;
  }

  public void insertLast(int value) {

    if (head == null && tail == null)
      head = tail = new Node(value);
    else {
      tail.next = new Node(value);
      tail = tail.next;
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
      tail.next = null;
    }

  }

  public void show() {
    Node curr = head;
    while (curr != null) {
      System.out.println(curr.val);
      curr = curr.next;
    }

  }

  public static void main(String[] args) {
    SingleLinkedList test = new SingleLinkedList();
    test.insertLast(5);
    test.insertLast(10);
    test.insertLast(11);
    test.insertLast(5);
    test.insertLast(13);
    test.deleteLast();

    test.show();
  }

}