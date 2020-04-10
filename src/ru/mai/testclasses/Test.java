package ru.mai.testclasses;

import java.util.Objects;

/**
 * @author Beaver
 */
public class Test {

    private String str;
    private int count;

    @Override
    public boolean equals(Object obj) {
        return str.equals(((Test) obj).str);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.str);
        return hash;
    }

    /**
     * @return the str
     */
    public String getStr() {
        return str;
    }

    /**
     * @param str the str to set
     */
    public void setStr(String str) {
        this.str = str;
    }

    /**
     * @return the count
     */
    public int getCount() {
        return count;
    }

    /**
     * @param count the count to set
     */
    public void setCount(int count) {
        this.count = count;
    }
}
