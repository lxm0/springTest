package javaBase;

import org.junit.Test;

public class ExceptionTest {
    public static void main(String[] args) {

    }
    @Test
    public void test(){
        try {
            int i=5/0;
        }catch (Exception e){

        }finally {
            System.out.println("finally1");
            int b = 5/0;
            System.out.println("finally2");
        }
    }
}
