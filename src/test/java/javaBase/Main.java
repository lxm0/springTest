package javaBase;

import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String A = scanner.nextLine();
//        String B = scanner.nextLine();
        int[] A ={1,2,3,5};
        int[] B ={2,3,4};
        check(A,B);
    }
    public static void check(int[] A,int[] B){

        HashSet setA  =new HashSet();
        HashSet setB  =new HashSet();
        for(int i:A){
            setA.add(i);
        }
        for(int i:B){
            setB.add(i);
        }
        Iterator<Integer> it = setA.iterator();
        while (it.hasNext()) {
            int str = it.next();
            if(!setB.contains(str)){
                System.out.println(str);
            }
        }
    }
}
