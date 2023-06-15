package PriorityQueue.Examples;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

  static class Car implements Comparable<Car> {
    //attributes - price and speed
    int price;
    int speed;
    String name;

    public Car(int price, int speed, String name) {
      this.price = price;
      this.speed = speed;
      this.name = name;
    }
    @Override
    public int compareTo(Car o) {
      return this.price - o.price;
    }

    @Override
    public String toString() {
      return "Car{" +
          "price=" + price +
          ", speed=" + speed +
          '}';
    }
  }

  public static void main(String[] args) {
    demo2();
  }
  private static void demo2(){
    // comparable used because no dedicated class passed for comparison
    PriorityQueue<Car> pq = new PriorityQueue<>(Collections.reverseOrder());
    pq.add(new Car(50, 800, "A"));
    pq.add(new Car(20, 200, "B"));
    pq.add(new Car(70, 600, "C"));
    pq.add(new Car(30, 300, "D"));
    pq.add(new Car(10, 500, "E"));

    while(!pq.isEmpty()){
      System.out.println(pq.remove());
    }
  }
}
