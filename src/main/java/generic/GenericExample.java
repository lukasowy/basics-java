package generic;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {
  public static void main(String[] args) {
    IntegerCounter integerCounter = new IntegerCounter(2);
    integerCounter.print();

    DoubleCounter doubleCounter = new DoubleCounter(2.0);
    doubleCounter.print();

    Counter<Integer> iCounter = new Counter<>(3);
    iCounter.print();

    Counter<Double> dCounter = new Counter<>(3.2);
    dCounter.print();

    ArrayList<Object> list = new ArrayList<>();
    list.add(1);
    list.add("1");

    Integer integer = (Integer) list.get(0);
    String string = (String) list.get(1);

    System.out.println(integer);
    System.out.println(string);

    print("Manieksi", "Paniek");

    ArrayList<Integer> listWildcards = new ArrayList<>();
    listWildcards.add(1);
    listWildcards.add(2);
    print(listWildcards);
  }

  private static <T, U> T print(T t, U u) {
    System.out.println(t);
    System.out.println(u);

    return t;
  }

  private static void print(List<? extends Number> list) {
    System.out.println(list);
  }
}
