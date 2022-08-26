package lambda;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Person {

  private String name;
  private int age;
  private String emailAddress;
  private Sex gender;

  public static List<Person> generateDefaultList() {
    List<Person> people = new ArrayList<>();

    people.add(new Person("Luks", 23, "asd@d.com", Sex.MALE));
    people.add(new Person("Dsad", 53, "aslkd@d.com", Sex.FEMALE));
    people.add(new Person("Vds", 33, "asasdd@d.com", Sex.MALE));
    people.add(new Person("Wghfdg", 14, "asasdasd@d.com", Sex.MALE));
    return people;
  }

  public enum Sex {
    MALE,
    FEMALE
  }
}
