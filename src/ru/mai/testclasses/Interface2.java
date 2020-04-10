package ru.mai.testclasses;

/**
 * @author Beaver
 */
public interface Interface2 extends Interface1 {

    int getCount();

    default void print() {
        System.out.println("Default string");
    }
}

