package javaBase;

public class staticTest  {
    public static Integer integer = 1000;

    public static void main(String[] args) {
        staticTest statiTest = new staticTest();
        staticTest statiTest2 = new staticTest();
        staticTest.integer=1;
        int n=4;
        n|=n;
//        System.out.println(n);
        int  h = hash("w33");
//        System.out.println(h);


    }
    static final int hash(Object key) {
        int h;
        int a = key.hashCode();
        a = a>>>16;
        System.out.println(a);
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }
}
