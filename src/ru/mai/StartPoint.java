package ru.mai;

import ru.mai.testclasses.*;

import java.util.Date;

/**
 * @author Beaver
 */
public class StartPoint {

    public static int a;

    public static void start() {
        System.out.println("Start class StartPoint");
        System.out.println("a = " + a);
    }

    static {
        System.out.println("Before start class StartPoint");
        a = 10;
    }

    public static void complexExample() {
        start();

        System.out.println("\nObjects:");
//        ClassA objA = new ClassA();
//        System.out.println(objA);
        ClassA obj1 = new ClassC();
        ClassB obj2 = new ClassC();
        ClassC obj3 = new ClassC();

        System.out.println("ClassA count = " + ClassA.calcCount());
        System.out.println("ClassB count = " + ClassB.calcCount());
        System.out.println("ClassC count = " + ClassC.calcCount());

        obj3.print();
        ((ClassC) obj1).print();

        Interface2 obj4 = new ClassC();
        Interface1 obj5 = new ClassD();

        System.out.println(obj1.toString());
        System.out.println(obj2.toString());
//        
        obj1.start();
        obj2.start();
        obj3.start();

        System.out.println("obj1 value = " + obj1.calculate());
        System.out.println("obj2 value = " + obj2.calculate());

    }

    public static void arrayExample() {
        ClassA obj1 = new ClassC();
        Object[] objects = new Object[5];
        objects[0] = new Object();
        objects[1] = obj1;
        objects[2] = new ClassD();
        objects[3] = new ClassC();
        objects[4] = new Date();

        System.out.println("\nObjects: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(objects[i]);
        }

        Interface1[] items = new Interface1[2];
        items[0] = new ClassC();
        items[1] = new ClassD();

        System.out.println("\nItems: ");
        for (Interface1 item : items) {
            item.print();
        }
    }
}
