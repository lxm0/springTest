package javaBase;

import org.junit.Test;

public class rejectTest {
    @Test
    public void test01(){
        String className ="javaBase.Stringtest";
//        Class classTest = Stringtest.class;
        try {
            Class classtest = Class.forName(className);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
