package ru.mai.testclasses;

/**
 * @author Beaver
 */
public class ClassC extends ClassB implements Interface2 {

    @Override
    public void start() {
        System.out.println("Start!");
    }

    @Override
    public int getCount() {
        return 0;
    }

//    @Override
//    public void print() {
//
//    }
}
