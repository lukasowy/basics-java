package methodreference;

import java.util.function.Consumer;

public class MethodReferenceDemo {
    public static void main(String[] args){
      EmployeeService service = new EmployeeService();

      //anonymous implementation
      service.loadEmployees()
              .forEach(new Consumer<Employee>() {
                  @Override
                  public void accept(Employee employee) {
                      System.out.println(employee);
                  }
              });

      //lambda expression
      service.loadEmployees()
              .forEach(employee -> {
                  System.out.println(employee);
              });

      //method reference
      service.loadEmployees()
              .forEach(MethodReferenceDemo::print);
    }

    private static void print(Employee employee) {
        System.out.println(employee);
    }
}



