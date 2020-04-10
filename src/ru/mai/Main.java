package ru.mai;

import ru.mai.data.MyFirstClass;
import ru.mai.data.MySecondClass;
import ru.mai.testclasses.ClassC;
import ru.mai.testclasses.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Main {

    public static void main(String[] args) {
        simpleExample();
        StartPoint.complexExample();
        StartPoint.arrayExample();
        someReflectionExample();
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

    private static void someReflectionExample() {
        ClassC testClass = new ClassC();
        System.out.println(testClass.getClass().getName());
        System.out.println(testClass.getClass().getSuperclass().getName());
        System.out.println(testClass.getClass().getPackage().getName());

        int mods = testClass.getClass().getModifiers();
        if (Modifier.isPublic(mods)) {
            System.out.println("public");
        }
        if (Modifier.isAbstract(mods)) {
            System.out.println("abstract");
        }
        if (Modifier.isFinal(mods)) {
            System.out.println("final");
        }

        for (Field field : testClass.getClass().getFields()) {
            System.out.println(field.getName() + " : " + field.getType());
        }

        for(Class cInterface : testClass.getClass().getInterfaces()) {
            System.out.println( cInterface.getName() );
        }

        TestClass testClassSimple = new TestClass();
        for (Field field : testClassSimple.getClass().getDeclaredFields()) {
            System.out.println(field.getName() + " : " + field.getType());
        }

        for (Field field : testClass.getClass().getDeclaredFields()) {
            System.out.println(field.getName() + " : " + field.getType());
        }

        for (Field field : testClass.getClass().getSuperclass().getDeclaredFields()) {
            System.out.println(field.getName() + " : " + field.getType());
        }

        for (Field field : testClass.getClass().getSuperclass().getSuperclass().getDeclaredFields()) {
            System.out.println(field.getName() + " : " + field.getType() + " : " + field.getModifiers());
        }

    }
}
