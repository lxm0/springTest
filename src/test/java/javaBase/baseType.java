package javaBase;

import java.util.HashMap;
import java.util.Map;

public class baseType {
    public static void main(String[] args) {
        Integer integer = Integer.valueOf(1000);
        Integer a =1000;
        int c= 1000;
        System.out.println(c==integer);
        Double.valueOf(1);
        System.out.println(a.equals(c));
        Map map = new HashMap();
        map.put(1,1);
    }
}
