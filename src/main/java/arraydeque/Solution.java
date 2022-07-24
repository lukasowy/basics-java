package arraydeque;

import java.util.ArrayDeque;

public class Solution {
  public static void main(String[] args) {
    ArrayDeque<String> arrayDeque = new ArrayDeque<>();

    arrayDeque.offer("a");
    arrayDeque.offer("b");
    arrayDeque.offer("c");
    arrayDeque.pop();

    System.out.println(arrayDeque);
  }
}
