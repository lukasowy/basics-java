package generic;

import java.io.Serializable;

public class Counter<T extends Number & Serializable> {
  T i;

  public Counter(T i) {
    this.i = i;
  }

  public void print() {
    System.out.println(i);
  }
}
