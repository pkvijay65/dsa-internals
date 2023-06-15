package Queue.Implentation_by_arraylist;

import java.util.ArrayList;

public class Queue {
  ArrayList<Integer> list = new ArrayList<Integer>();

  public void enque(int data) {
    list.add(data);
  }

  public int deque() {
    if (list.isEmpty()) {
      throw new RuntimeException("Queue is empty");
    } else {
      int temp = list.get(0);
      list.remove(0);
      return temp;
    }
  }

  public static void main(String[] args) {
    Queue queue = new Queue();
    queue.enque(1);
    queue.enque(2);
    queue.enque(3);
    queue.enque(4);
    queue.enque(5);
    System.out.println("first data point in queue is :: " +  queue.deque());
  }

}
