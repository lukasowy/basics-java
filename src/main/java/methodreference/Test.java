package methodreference;

public class Test {

    public static void test2() {
        System.out.println("test2()");
    }

    public static void main(String[] args){

//        reference :: methodName
//        Test::test2(); - static method reference

        Test.test2();
        Test test = new Test();
        test.test1();

//        test::test1(); - instance method reference

//        constructor reference


    }

    public void test1(){
        System.out.println("test1()");
    }
}
