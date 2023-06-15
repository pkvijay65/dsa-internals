package LinkedList;

public class LinkedList<T> {
  private Node<T> head;
  private int size;

  private static class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
      this.data = data;
      this.next = null;
    }
  }

  public LinkedList() {
    this.head = null;
    this.size = 0;
  }

  public void add(T data) {
    Node<T> newNode = new Node<>(data);
    if (head == null) {
      head = newNode;
    } else {
      Node<T> current = head;
      while (current.next != null) {
        current = current.next;
      }
      current.next = newNode;
    }
    size++;
  }

  public int size() {
    return size;
  }

  public void display() {
    Node<T> current = head;
    while (current != null) {
      System.out.print(current.data + " ");
      current = current.next;
    }
    System.out.println();
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<Integer>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.display();
    System.out.println("size of list is :: " + list.size());
    System.out.println("is list empty :: " + list.isEmpty());
  }
}

