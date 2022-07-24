package priorityqueue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {
  public static void main(String[] args) {
    PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());

    priorityQueue.add(3);
    priorityQueue.add(1);
    priorityQueue.add(5);
    priorityQueue.add(6);

    System.out.println(priorityQueue);
    System.out.println(priorityQueue.poll());
    System.out.println(priorityQueue);

    Queue<Customer> customers = new PriorityQueue<>(new CustomerOrder());
    customers.add(new Customer(6, 50.0, "Maniek"));
    customers.add(new Customer(5, 40.0, "Bozena"));
    customers.add(new Customer(2, 60.0, "Stasiek"));
    customers.add(new Customer(3, 100.0, "Gienek"));

    System.out.println(customers);
    System.out.println(customers.poll());
    System.out.println(customers);
  }
}
