package niuke.offer;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MoreThanHalfNum {
    public static void main(String[] args) {
        int[] n ={1,2,3,2,2,2,5,4,2};
        Set set = new HashSet();
        Arrays.sort(n);
        int num=1;
        for(int i=1;i<n.length;i++){
            if(n[i]==n[i-1]){
                num++;
            }
            else {
                num=1;
            }
            if (num>n.length/2){
                System.out.println(n[i]);
            }
        }

        System.out.println(0);
    }
}
