/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.mai.data;

/**
 * @author Beaver
 */
public class MyFirstClass {

    /**
     * Test property
     */
    protected int myProperty;

    @Override
    public String toString() {
        return "MyFirstClass convert to String";
    }

    /**
     * @return the myProperty
     */
    public int getMyProperty() {
        return myProperty;
    }

    /**
     * @param myProperty the myProperty to set
     */
    public void setMyProperty(int myProperty) {
        this.myProperty = myProperty;
    }
}
