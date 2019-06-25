package niuke.offer;

import org.junit.Test;

import java.util.*;

public class Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "abc";
        Set set  =new HashSet();
        ArrayList arrayList  = new ArrayList();
        String[] strings = s.split("");


    }
    @Test
    public void test01(){
        ArrayList list = Permutation("abc");
        System.out.println(list.size());
    }

    ArrayList<String> arrayList = new ArrayList<String>();

    public ArrayList<String> Permutation(String str) {
        if(str==null) {
            return null;
        }
        if(str.length()==0) {
            return arrayList;
        }
        StringBuilder sb = new StringBuilder(str);
        StringBuilder newStr = new StringBuilder();
        boolean[] used = new boolean[str.length()];
        Arrays.sort(str.toCharArray());
        next_permutation(str,used,newStr,str.length());
        return arrayList;
    }

    private void next_permutation(String sb, boolean[] used, StringBuilder newStr, int length) {
        // TODO Auto-generated method stub
        if(newStr.length() == length) {
            arrayList.add(newStr.toString());
            return;
        }
        for(int j = 0; j < length; j++) {
            if(used[j])
                continue;
            if(j > 0 && sb.charAt(j) == sb.charAt(j-1) && !used[j-1])
                continue;
            used[j] = true;
            newStr.append(sb.charAt(j));
            next_permutation(sb, used, newStr, length);
            used[j] = false;
            newStr.deleteCharAt(newStr.length()-1);
        }
    }
}
