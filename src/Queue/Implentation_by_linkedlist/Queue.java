package Queue.Implentation_by_linkedlist;

class Node {
  int data;
  Node next;

  public Node(int data){
    this.data = data;
  }

}
public class Queue{
  Node front;
  Node rear;

  public void enque(int data){
    if (front == null) {
      front = new Node(data);
      rear = front;
    } else {
      rear.next = new Node(data);
      rear = rear.next;
    }
  }

  public int deque() {
    if (front == null) {
      throw new RuntimeException("Queue is empty");
    } else {
      int temp = front.data;
      front = front.next;
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