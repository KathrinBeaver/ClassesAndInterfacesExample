/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.mai.data;

/**
 * Class description
 * @author Beaver
 */
public class MySecondClass extends MyFirstClass {

    @Override
    public String toString() {
        this.myProperty = 5;
        return "MySecondClass convert to String";
    }

    /**
     * Test method
     */
    public void test() {
    }
}

