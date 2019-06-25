package niuke.offer;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class Solution {
    public static void main(String[] args) {
        int[] n = {6,-3,-2,7,-15,1,2,2};
        int result = FindGreatestSumOfSubArray(n);
        System.out.println(result);

    }
    public static int FindGreatestSumOfSubArray(int[] array) {
        int result = Integer.MIN_VALUE;
        System.out.println(result);
        for(int i=1;i<array.length+1;i++){
            int num = Integer.MIN_VALUE;
            for(int j=0;j<=array.length-i;j++){
                int value=0;
                for(int k=j;k<j+i;k++){
                    value+=array[k];
                }
                num=value>num?value:num;
            }
            result = num>result?num:result;
        }
        return result;
    }
    @Test
    public void testPrintMinNumber(){
        int[] n = {3,32,321};
        String string = PrintMinNumber(n);
        System.out.println(string);
    }
    public String PrintMinNumber(int [] numbers) {
        if(numbers==null || numbers.length==0) return "";
        int length = numbers.length;
        String[] str = new String[length];
        for(int i=0;i<length;i++) {
            str[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(str, new Comparator<String>() {

            public int compare(String o1, String o2) {
                String c2 = o1+o2;
                String c3 = o2+o1;
                return c2.compareTo(c3);
            }
        });
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<length;i++) {
            sb.append(str[i]);
        }
        return sb.toString();
    }
    public int GetUglyNumber_Solution(int index) {

        return 0;
    }
    @Test
    public  void testFirstNotRepeatingChar(){
        String str ="assda";
        System.out.println(FirstNotRepeatingChar(str));
        System.out.println((double) 100/3);
        assertEquals(1,1);
        ArrayList result = new ArrayList();
    }
    public int FirstNotRepeatingChar(String str) {
        int result=-1;
        Map map = new HashMap();
        if (null==str||str.length()==0){
            return -1;
        }
        String[] strings = str.split("");

        for(int i=0;i<strings.length;i++){
            Integer value =  map.get(strings[i])==null?1:(Integer) map.get(strings[i])+1;
            map.put(strings[i],value);
        }
        for(int i=0;i<strings.length;i++){
            Integer integer =(Integer) map.get(strings[i]);
            if (integer.equals(1)){
                result=i;
                break;
            }
        }
        return result;
    }
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        Map map = new HashMap();
        for(int i=0;i<array.length;i++){
            Integer value = (Integer)map.get(array[i]);
            map.put(array[i],value==null?1:value+1);
        }
        ArrayList list = new ArrayList();
        Iterator iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            Integer key = (Integer) entry.getKey();
            Integer val = (Integer) entry.getValue();
            if (val ==1){
                list.add(key);
            }
        }
        num1[0] = (Integer) list.get(0);
        num2[0] = (Integer)list.get(1);

    }
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList result = new ArrayList();
        int i=0;
        int j = array.length;
        int temp=0;
        while(i<j){
            for(int k =j-1;k>i;k-- ){
                if(array[i]+array[k]==sum){

                    if(temp>array[i]*array[k]){
                        temp = array[i]*array[k];
                        if(result.size()>0) {
                            result.set(0, array[i]);
                            result.set(1, array[k]);
                        }else {
                            result.add(array[i]);
                            result.add(array[k]);

                        }
                    }
                    j=k;
                    break;
                }
            }
            i++;
        }
        return result;
    }
    @Test
    public void testooo(){
        int[] n ={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
//        FindNumbersWithSum(n,21);
        System.out.println("abcdefg");
        System.out.println(LeftRotateString("abcdefg",2));
    }
    public String LeftRotateString(String str,int n) {
        String result = null;
        String[] strings = str.split("");
        String s1="";
        String s2="";
        n = n%strings.length;
        for(int i=0;i<n;i++){
            s1=s1+strings[i];
        }
        for(int i=n;i<strings.length;i++){
            s2=s2+strings[i];
        }
        result = s2+s1;
        return result;
    }
    @Test
    public void testR(){
        System.out.println(ReverseSentence(" "));
    }
    public String ReverseSentence(String str) {
        String[] strings = str.split(" ");
        String temp = " ";
        if(str.length()==0){
            return "";
        }
        if(str.equals(" ")){
            return str;
        }
        StringBuffer result = new StringBuffer();
        for(int i=0;i<strings.length;i++){
            result.append(strings[strings.length-i-1]).append(temp);
        }
        result.deleteCharAt(result.length()-1);
        return result.toString();
    }
    @Test
    public void test(){
        System.out.println(ouchuancheck("abaababaab"));
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
    }
    public int ouchuancheck(String str){
        String[] strings = str.split("");
        if (strings.length%2==1){return 0;}
        int result =0;
        for(int i=1;i<str.length();i++){
            if((str.length()-i)%2==1)continue;
            String s = str.substring(0,(str.length()-i)/2);
            String s2 = str.substring((str.length()-i)/2,str.length()-i);
            if (s.equals(s2)){
                result = str.length()-i;
            }
        }
        return result;

    }
    public int check2(String str){
        int result =0;
        String[] strings  =str.split("");
        Map map = new HashMap();
        for(int i=0;i<strings.length;i++){
            Integer value = (Integer) map.get(strings[i]);
            map.put(strings[i],value==null?1:value+1);
        }
        Iterator iter = map.entrySet().iterator();
        while(iter.hasNext()){
            Map.Entry entry = (Map.Entry) iter.next();
//            Integer key = (Integer) entry.getKey();
            Integer val = (Integer) entry.getValue();
            if(val%2==1){
                result++;
            }
        }
        return result;
    }
    @Test
    public void test11(){
        System.out.println(check2(5));

    }
    public  int check2(int n){
        int count =yueshu(n);
        int result =0;
        int temp =4;
        if (n==1)
            return 1;
        if (n==2)
            return 2;
        if (n==3)
            return 4;
        for(int i=3;i<n;i++){
            if (i%2==1){
                temp=temp+temp/2;
                for(int j=0;j<count;j++){
                    temp = temp/2;
                }
            }else {
                temp = temp*2;
            }
            temp = temp%1000000007;
        }

        return temp;
    }
    public int yueshu(int n){
        int result =0;
        for(int i=2;i<n;i++){
            if (n%i==0){
                result++;
            }
        }
        return result;
    }
    public boolean isContinuous(int [] numbers) {
        boolean result = false;
        int count = 0;
        Arrays.sort(numbers);
        for(int i=0;i<numbers.length-1;i++){
            if(numbers[i]==0){
                count++;
            }
            else{
                if(numbers[i+1]-numbers[i]==1){
                    continue;
                }
                else if (numbers[i+1]-numbers[i]==2){
                    count--;

                }
                else {
                    count = count-numbers[i+1]+numbers[i]+1;
                }
            }
        }
        if(count>=0){
            result=true;
        }
        return result;
    }
    @Test
    public void testisContinuous(){
        int[] ints = {0,3,2,6,4};
        System.out.println(isContinuous(ints));
    }

    public int LastRemaining_Solution(int n, int m) {
        if (n==0||m==0)
            return -1;
        LinkNode head = createLinklist(n);
        LinkNode p=head,q=head.next;
        while(p.next!=p){
            for(int i=0;i<m-1;i++){
                p=q;
                q=q.next;
            }
            p.value = q.value;
            p.next = q.next;
            q = p.next;
        }



        return p.value;
    }
    @Test
    public void testLastRemaining_Solution(){
        System.out.println(LastRemaining_Solution(5,3));
    }
    public LinkNode createLinklist(int n){
        LinkNode head = new LinkNode(0,null);
        LinkNode newHead =head;
        for(int i=1;i<n;i++){
            LinkNode p = new LinkNode(i,null);
            newHead.next = p;
            newHead = p;
        }
        newHead.next = head;

        return head;
    }
    public void removeLinkNode(LinkNode p){
        p.next=p.next.next;
    }

    public int StrToInt(String str) {
        int result = 0;
        if(str==null||str.length()==0){
            return 0;
        }
        String[] strings = str.split("");

        for(int i=strings.length-1;i>=0;i--){
            if(strings[i].compareTo("0")>=0&&strings[i].compareTo("9")<=0){
//                result+=strings[i]*(strings.length-i);
            }else if(i==0){
                if(strings[i].equals("-")){

                }
            }
            else{
                return 0;
            }
        }
        return result;
    }
}
