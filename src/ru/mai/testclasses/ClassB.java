package ru.mai.testclasses;

/**
 * @author Beaver
 */
public abstract class ClassB extends ClassA {

    @Override
    public String toString() {
        return super.toString() + " - I am object of classB";
    }

    @Override
    public int calculate() {
        return 10 * this.value;
    }
}
