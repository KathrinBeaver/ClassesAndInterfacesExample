package ru.mai;

import ru.mai.data.MyFirstClass;
import ru.mai.data.MySecondClass;

public class Main {

    public static void main(String[] args) {
//        simpleExample();
        StartPoint.complexExample();
//        StartPoint.arrayExample();
    }

    private static void simpleExample() {
        Object obj = new Object();
        System.out.println(obj);
        System.out.println(obj.hashCode());
        System.out.println(obj.getClass());

        TestClass testClass = new TestClass();
//        testClass.myProperty = -1000;
        System.out.println(testClass);

        MyFirstClass firstClass = new MyFirstClass();
        System.out.println(firstClass);

//        System.out.println(null);

        MySecondClass secondClass = new MySecondClass();
        System.out.println(secondClass);
        secondClass.test();

        MyFirstClass thirdClass = new MySecondClass();
        System.out.println(thirdClass);

//        MySecondClass tmp = new MyFirstClass();
    }
}
