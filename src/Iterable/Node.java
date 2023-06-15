package Iterable;

import org.w3c.dom.traversal.NodeIterator;

import java.util.Iterator;

public class Node implements Iterable<Integer>{

  private int data;
  private Node next;

  public Node(int data, Node next){
    this.data = data;
    this.next = next;
  }

  @Override
  public Iterator<Integer> iterator() {
    return new NodeIterator(this);
  }

  public static class NodeIterator implements Iterator<Integer>{

    private Node current;

    public NodeIterator(Node head){
      this.current = head;
    }

    @Override
    public boolean hasNext() {
      return current != null;
    }

    @Override
    public Integer next() {
      int data = current.data;
      current = current.next;
      return data;
    }
  }
}
