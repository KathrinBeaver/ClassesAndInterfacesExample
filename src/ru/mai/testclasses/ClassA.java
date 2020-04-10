package ru.mai.testclasses;

/**
 * @author Beaver
 */
public abstract class ClassA {

    protected int value = 3;
    protected static int count = 0;

    public ClassA() {
        count++;
    }

    /**
     * Method for get objects count
     * @return count of class objects
     */
    public static int calcCount() {
        return count;
    }

    @Override
    public String toString() {
        return "I am object of classA: " + this.value;
    }

    /**
     * Calculate method
     * @return
     */
    public int calculate() {
        return 5 * this.value;
    }

    /**
     * Method for start
     */
    public abstract void start();
}
