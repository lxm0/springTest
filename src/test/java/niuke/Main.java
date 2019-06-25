package niuke;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s  =scanner.nextLine();
        calulae(s);

//        System.out.println(getnumber("1T"));
    }
    public static int getnumber(String s){
        int result= 0;
        String[] strings = s.split("");
        for(int i=strings.length-1;i>=0;i--){
            if (strings[i].equals("T")){
                result-= Math.pow(3,strings.length-i-1);
            }else
                result+=Math.pow(3,strings.length-i-1);
        }
        return result;
    }
    public static int calulae(String s){
        int result =0;
//        ScriptEngine jse = new ScriptEngineManager().getEngineByName("JavaScript");
//        try {
//            System.out.println(jse.eval( "1+1*2+(10-(2*(5-3)*(2-1))-4)+10/(5-0)"));
//        } catch (ScriptException e) {
//            e.printStackTrace();
//        }
        String[] strings = s.split("");

//        Stack stack = new Stack();
//        for(int i=0;i<strings.length;i++){
//            if (strings[i].equals("(")){
//                stack.push(strings[i]);
//            }
//
//        }
        return result;
    }
    public static List<String> InfixToPostfix(List<String> list){
        List<String> Postfixlist = new ArrayList<String>();//存放后缀表达式
        Stack<String> stack = new Stack<String>();//暂存操作符
        //stack.push('#');
        for(int i=0;i<list.size();i++){

            String s = list.get(i);
            if(s.equals("(")){
                stack.push(s);
            }else if(s.equals("*")||s.equals("/")){
                stack.push(s);
            }else if(s.equals("+")||s.equals("-")){
                if(!stack.empty()){
                    while(!(stack.peek().equals("("))){
                        Postfixlist.add(stack.pop());
                        if(stack.empty()){
                            break;
                        }
                    }
                    stack.push(s);
                }else{
                    stack.push(s);
                }
            }else if(s.equals(")")){
                while(!(stack.peek().equals("("))){
                    Postfixlist.add(stack.pop());
                }
                stack.pop();
            }else{
                Postfixlist.add(s);
            }
            if(i==list.size()-1){
                while(!stack.empty()){
                    Postfixlist.add(stack.pop());
                }
            }
        }
        return Postfixlist;
    }


}
